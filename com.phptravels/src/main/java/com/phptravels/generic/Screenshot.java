package com.phptravels.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot implements Automation_Constants
{
	public static void capture(WebDriver driver,String pathOfScreenshot) throws IOException
	   {
		 Date d=new Date();
		 String d1=d.toString();
		 String date=d1.replace(":","-");
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File dst=new File(PATH_SCREENSHOT+date+".jpeg");
		 Files.copy(src, dst);
	   }
}
