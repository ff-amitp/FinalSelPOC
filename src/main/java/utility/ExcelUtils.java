package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	//private static XSSFRow Row;

	// This method is to set the File path and to open the Excel file, Pass Excel
	// Path and Sheetname as Arguments to this method

	
	public static void setExcelFile(String Path, String SheetName) throws Exception 
		{

			try 
				{

					// Open the Excel file
					FileInputStream ExcelFile = new FileInputStream(Path);

					// Access the required test data sheet

					ExcelWBook = new XSSFWorkbook(ExcelFile);
					ExcelWSheet = ExcelWBook.getSheet(SheetName);

				} 
			
			catch (Exception e) 
				{

					throw (e);

				}

		}


	
	
	
	public static Object[][] getSignUpData(String FilePath, String SheetName, int iTestCaseRow) throws Exception

		{

			String[][] signUpDataArray = null;

			try 
				{

					FileInputStream ExcelFile = new FileInputStream(FilePath);

					// Access the required test data sheet

					ExcelWBook = new XSSFWorkbook(ExcelFile);
					ExcelWSheet = ExcelWBook.getSheet(SheetName);

					int startCol = 1;
					int ci = 0, cj = 0;
					int totalRows = 1;
					int totalCols = 21;

					
					signUpDataArray = new String[totalRows][totalCols];

						for (int j = startCol; j <= totalCols; j++, cj++)

							{
							signUpDataArray[ci][cj] = getCellData(iTestCaseRow, j);
									System.out.println(signUpDataArray[ci][cj]);

							}

				}

			catch (FileNotFoundException e)

				{

					System.out.println("Could not read the Excel sheet");
					e.printStackTrace();

				}

			catch (IOException e)

				{

					System.out.println("Could not read the Excel sheet");
					e.printStackTrace();

				}

			return (signUpDataArray);

	}
	
	
	
	public static Object[][] getLoginDataArray(String FilePath, String SheetName, int iTestCaseRow) throws Exception

	{

		String[][] loginDataArray = null;

		try 
			{

				FileInputStream ExcelFile = new FileInputStream(FilePath);

				// Access the required test data sheet

				ExcelWBook = new XSSFWorkbook(ExcelFile);
				ExcelWSheet = ExcelWBook.getSheet(SheetName);

				int startCol = 1;
				int ci = 0, cj = 0;
				int totalRows = 1;
				int totalCols = 2;

				
				loginDataArray = new String[totalRows][totalCols];

					for (int j = startCol; j <= totalCols; j++, cj++)

						{
						loginDataArray[ci][cj] = getCellData(iTestCaseRow, j);
								System.out.println(loginDataArray[ci][cj]);

						}

			}

		catch (FileNotFoundException e)

			{

				System.out.println("Could not read the Excel sheet");
				e.printStackTrace();

			}

		catch (IOException e)

			{

				System.out.println("Could not read the Excel sheet");
				e.printStackTrace();

			}

		return (loginDataArray);

}
	
	
	
	
	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception 
	
		{

			try 
				{
				
				
				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
				Cell.setCellType(CellType.STRING);
			
				String CellData = Cell.getStringCellValue();
				return CellData;
				//getCellValueAsString(Cell);


					/*Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
					if(ColNum == 1)
					{
					Cell.setCellType(CellType.STRING);
					}
					else
					{
						Cell.setCellType(CellType.STRING);
					}
					String CellData = Cell.getStringCellValue();
					return CellData;
					//getCellValueAsString(Cell);
*/				

				
/*				public void readFormula() throws IOException {
				    FileInputStream fis = new FileInputStream("Path of your file");
				    Workbook wb = new XSSFWorkbook(fis);
				    Sheet sheet = wb.getSheetAt(0);
				    FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();

				    CellReference cellReference = new CellReference("C2"); // pass the cell which contains the formula
				    Row row = sheet.getRow(cellReference.getRow());
				    Cell cell = row.getCell(cellReference.getCol());

				    CellValue cellValue = evaluator.evaluate(cell);

				    switch (cellValue.getCellType()) {
				        case Cell.CELL_TYPE_BOOLEAN:
				            System.out.println(cellValue.getBooleanValue());
				            break;
				        case Cell.CELL_TYPE_NUMERIC:
				            System.out.println(cellValue.getNumberValue());
				            break;
				        case Cell.CELL_TYPE_STRING:
				            System.out.println(cellValue.getStringValue());
				            break;
				        case Cell.CELL_TYPE_BLANK:
				            break;
				        case Cell.CELL_TYPE_ERROR:
				            break;

				        // CELL_TYPE_FORMULA will never happen
				        case Cell.CELL_TYPE_FORMULA:
				            break;
				    }

				}*/
				
				
				} 
			
			catch (Exception e) 
				{

					return "";

				}

		}
	
	
    
	
	
	
	public static String getTestCaseName(String sTestCase) throws Exception 
	
		{

			String value = sTestCase;

			try 
				{

					int posi = value.indexOf("@");

					value = value.substring(0, posi);

					posi = value.lastIndexOf(".");

					value = value.substring(posi + 1);

					return value;

				} 
			
			catch (Exception e) 
				{

					throw (e);

				}

		}

	
	
	public static int getRowContains(String sTestCaseName, int colNum) throws Exception 
		{

			int i;

			try 
				{

					int rowCount = ExcelUtils.getRowUsed();

					for (i = 0; i < rowCount; i++) 
						{

								if (ExcelUtils.getCellData(i, colNum).equalsIgnoreCase(sTestCaseName)) 
									{

										break;

									}

						}

					return i;

				}
			
			catch (Exception e) 
				{

					throw (e);

				}

		}

	
	
	
	public static int getRowUsed() throws Exception 
	
		{

			try 
		
				{

					int RowCount = ExcelWSheet.getLastRowNum();
					return RowCount;

				} 
		
			catch (Exception e) 
		
				{

					System.out.println(e.getMessage());
					throw (e);

				}

		}

}