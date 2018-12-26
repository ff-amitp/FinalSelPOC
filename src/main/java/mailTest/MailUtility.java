package mailTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.exec.OS;

public class MailUtility {

	public static void SendMailForExecutionStarted() {
        
		String mailList = "20@gmail.com";

        final String from = "20@gmail.com";
        final String username = "20@gmail.com";
        final String password = "";

        Properties props = new Properties();
        props.put( "mail.smtp.auth", "true" );
        props.put( "mail.smtp.starttls.enable", "true" );
        props.put( "mail.smtp.host", "smtp.gmail.com" );
        props.put( "mail.smtp.port", "465" );
        props.put( "mail.smtp.socketFactory.port", "465" );
        props.put( "mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory" );
        props.put( "mail.smtp.socketFactory.fallback", "false" );

        Session session = Session.getInstance( props, new javax.mail.Authenticator() {protected PasswordAuthentication getPasswordAuthentication() { return new PasswordAuthentication( username, password );}} );
        try {
            Message message = new MimeMessage( session );
            message.setFrom( new InternetAddress( from ) );
            message.setRecipients( Message.RecipientType.TO, InternetAddress.parse( mailList ) );
            String application = "Preprod";
            message.setSubject( application + " execution is triggered" );
            Multipart multipart = new MimeMultipart();
            MimeBodyPart textPart1 = new MimeBodyPart();
            textPart1.setText( "Hi All,\n\n" + application + " execution is triggered. You will soon get the execution report.", "utf-8" );
            multipart.addBodyPart( textPart1 );
            message.setContent( multipart );
            System.out.println( "Sending message to " + mailList );
            Transport.send( message );
            System.out.println( "message sent successfully" );
        } catch( Exception e ) {
            System.out.println( "Error while sending mail, error = " + e.getMessage() );
            System.out.println( "StackTrace = " + e.getStackTrace() );
            e.printStackTrace();
        }

    }
    
    public static void SendMail() {
        
        String browserVersion = "43.07";
        String mailList = "20@gmail.com";
        String branch_name = "<Unavailable>";

        String passPercent = "78.03";
        String regex = "";
        if ( OS.isFamilyWindows() ) {
            regex = "\\\\";
        } else {
            regex = File.separator.toString();
        }

        String testNGReportFileName = "D:\\Automation\\GitWorkspace\\eVerifile\\test-output" + File.separator + "emailable-report.html";
        String testNGExecutionReport = "E:\\FirstFuelAutomationFrameworkArtifacts\\TestNGOutputFolder" + File.separator + "Execution_Report.html";
        final String from = "20@gmail.com";

        final String username = "mailtestsourabh@gmail.com";
        final String password = "Allstate1$";

        Properties props = new Properties();
        props.put( "mail.smtp.auth", "true" );
        props.put( "mail.smtp.starttls.enable", "true" );
        props.put( "mail.smtp.host", "smtp.gmail.com" );
        props.put( "mail.smtp.port", "465" );
        props.put( "mail.smtp.debug", "true" ); // property to turn on debug
        props.put( "mail.smtp.socketFactory.port", "465" );
        props.put( "mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory" );
        props.put( "mail.smtp.socketFactory.fallback", "false" );

        Session session = Session.getInstance( props, new javax.mail.Authenticator() { protected PasswordAuthentication getPasswordAuthentication() { return new PasswordAuthentication( username, password );}} );
        try {
            Message message = new MimeMessage( session );
            message.setFrom( new InternetAddress( from ) );
            message.setRecipients( Message.RecipientType.TO, InternetAddress.parse( mailList ) );
            message.setSubject( "Automation Execution Report for Environment : QA");
            BodyPart messageBodyPart = new MimeBodyPart();
            
            String totalPassed = "60";
            String totalFailed = "30";
            String totalSkipped = "10";
            int totalTestCases = Integer.parseInt( totalPassed ) + Integer.parseInt( totalFailed )+ Integer.parseInt( totalSkipped);
            String table = "";
            table += "<table border=\"1\" style=\"width:25%\">";
            table += "<TR>";
            table += "<TD width=\"70%\">Total Test Cases</TD>";
            if ( totalTestCases == 0 ) {
                table += "<TD>" + "Not Available" + "</TD>";
            } else {
                table += "<TD>" + totalTestCases + "</TD>";
            }
            table += "</TR>";
            table += "<TR>";
            table += "<TDwidth=\"70%\">Passed Test Cases</TD>";
            if ( totalTestCases == 0 ) {
                table += "<TD>" + "Not Available" + "</TD>";
            } else {
                table += "<TD>" + totalPassed + "</TD>";
            }
            table += "</TR>";
            table += "<TR>";
            table += "<TDwidth=\"70%\">Failed Test Cases</TD>";
            if ( totalTestCases == 0 ) {
                table += "<TD>" + "Not Available" + "</TD>";
            } else {
                table += "<TD>" + totalFailed + "</TD>";
            }
            table += "</TR>";

            table += "<TR>";
            table += "<TDwidth=\"70%\">Skipped Test Cases</TD>";
            if ( totalTestCases == 0 ) {
                table += "<TD>" + "Not Available" + "</TD>";
            } else {
                table += "<TD>" + totalSkipped + "</TD>";
            }
            table += "</TR>";

            table += "</TABLE>";

            String application = "Preprod";

            Multipart multipart = new MimeMultipart();
            messageBodyPart = new MimeBodyPart();
            String filename = new File( testNGReportFileName ).getAbsolutePath();
            DataSource source = new FileDataSource( filename );
            messageBodyPart.setDataHandler( new DataHandler( source ) );
            String fName = filename.split( regex )[filename.split( regex ).length - 1];
            messageBodyPart.setFileName( fName );

            String urls = "Browser Version : "+browserVersion+"\n";
            urls += "TEST Application URL : " + "www.google.com" + "\n";

            MimeBodyPart textPart1 = new MimeBodyPart();
            textPart1.setText( "Hi All,\n\nAttached is the suite execution report for " + branch_name + ". Below is the summary of the Execution.\n\n" + urls + "\n", "utf-8" );
            multipart.addBodyPart( textPart1 );

            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent( table, "text/html; charset=utf-8" );
            multipart.addBodyPart( htmlPart );


            String logFileName = "E:\\FirstFuelAutomationFrameworkArtifacts\\LogFiles\\logFile.txt";
            File f = new File( logFileName );
            if ( logFileName != null && f.exists() ) {
                messageBodyPart = new MimeBodyPart();
                filename = new File( logFileName ).getAbsolutePath();
                source = new FileDataSource( filename );
                messageBodyPart.setDataHandler( new DataHandler( source ) );
                fName = filename.split( regex )[filename.split( regex ).length - 1];
                messageBodyPart.setFileName( fName );
                multipart.addBodyPart( messageBodyPart );

            }
            message.setContent( multipart );
            System.out.println( "Sending message to " + mailList );
            Transport.send( message );
            System.out.println( "message sent successfully" );
        } catch( Exception e ) {
            System.out.println( "Error while sending mail, error = " + e.getMessage() );
            System.out.println( "StackTrace = " + e.getStackTrace() );
            e.printStackTrace();
        }
    }

}
