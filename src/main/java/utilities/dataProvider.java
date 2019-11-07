package utilities;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

public class dataProvider {
	@DataProvider(name="Excel")
	public static Iterator<Object[]> dataprovidermethod() throws Exception
	{
		StoreExcelValues excel_value= new StoreExcelValues();
		ArrayList<Object []> obj=excel_value.StoreValue(Utility.FetchPropertyvalue("Sheetname").toString(),Utility.FetchPropertyvalue("ExcelAddress").toString());
		
		return obj.iterator();
	}

}
