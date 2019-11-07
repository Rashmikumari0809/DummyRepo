package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;

public class excel_utility {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;

	excel_utility(String path)

	{
		try {
			fis= new FileInputStream(new File(path));
			wb= new XSSFWorkbook(fis);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public int getRowCount(String Sheetname)
	{
		int rowcount=-1;
		sh=wb.getSheet(Sheetname);
		rowcount=sh.getPhysicalNumberOfRows();
		return rowcount;
	}

	public int getColCount(String Sheetname)
	{
		int colcount=-1;
		sh=wb.getSheet(Sheetname);
		colcount=sh.getRow(0).getPhysicalNumberOfCells();
		return colcount;
	}

	public String getCellValue(String SheetName,String ColName,int rowNum)
	{
		String cellValue=null;
		int ColNum=-1;
		row=sh.getRow(0);
		for(int i=0;i<row.getPhysicalNumberOfCells();i++)
		{
			if(row.getCell(i).getStringCellValue().equalsIgnoreCase(ColName))
			{
				ColNum=i;
			}
		}


		row=sh.getRow(rowNum-1);
		cell=row.getCell(ColNum);

       if(cell.getCellType()==CellType.STRING)
       {
    	   cellValue=cell.getStringCellValue();
       }
		if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA)
		{
			cellValue= String.valueOf(cell.getNumericCellValue());
		}
      /*  if(HSSFDateUtil.isCellDateFormatted(cell))
        {
        	Date dt=cell.getDateCellValue();
        	SimpleDateFormat sd= new SimpleDateFormat("dd/mm/yy");
        	cellValue=sd.format(dt);
        	
        }*/
        if(cell.getCellType()==CellType.BOOLEAN)
        {
        	cellValue=String.valueOf(cell.getBooleanCellValue());
        }
        if(cell.getCellType()==CellType.BLANK) {
        	cellValue="";
        }
        return cellValue;
	}

}
