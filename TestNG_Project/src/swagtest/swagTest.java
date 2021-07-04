package swagtest;

import org.testng.annotations.Test;

import pages.SwagLabpage;

public class swagTest extends swagBaseclass {
	
	@Test
	public void test()
	{
		SwagLabpage obj=new SwagLabpage();
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
	    String password=sheet.getRow(1).getCell(1).getStringCellValue();
		obj.SwagPage(username, password);
	}

}
