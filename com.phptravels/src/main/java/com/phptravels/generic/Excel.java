package com.phptravels.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Automation_Constants
{
  public static String getCellValue(String PATH_EXCEL,String Sheet,int row,int cell)
  {
	  String v="";
	  try
	  {
		  FileInputStream fis=new FileInputStream(PATH_EXCEL);
		  Workbook wb=WorkbookFactory.create(fis);
		  Cell c=wb.getSheet(Sheet).getRow(row).getCell(cell);
		  v=c.getStringCellValue();
	  }
	  catch(Exception e)
	  {
		  Reporter.log("File is not available", true);
	  }
	  return v;
  }
}
