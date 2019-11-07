package utilities;

import java.util.ArrayList;

public class StoreExcelValues {
	
	public ArrayList<Object[]> StoreValue(String SheetName,String path) throws Exception
	{
		excel_utility ut=new excel_utility(path);
		ArrayList<Object[]> value= new ArrayList<Object[]>();
		for(int i=2;i<=ut.getRowCount(SheetName);i++)
		{
			String column1=ut.getCellValue(SheetName,Utility.FetchPropertyvalue("col_1").toString(), i);
			String column2=ut.getCellValue(SheetName,Utility.FetchPropertyvalue("col_2").toString(), i);
			Object[] obj= {column1,column2};
			value.add(obj);
		}
		return value;
	}

}
