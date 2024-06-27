
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader {
	public String getReadData(String path,int sheetno,  int rowno, int colno)
	{ 
		String value ="";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetno);
		 value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
			
			
		} catch (Exception e) {
			System.out.println("issue in  get read data : " + e);
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\New folder\\eclips ide\\Array_program\\Testing baba.xlsx";
		ExcelReader ob = new ExcelReader();
		for(int i=1; i<=5;i++ )
		{
		String out = ob.getReadData(path, 0,i,1 );
		System.out.println(out);
		}
	}
}


