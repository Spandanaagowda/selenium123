package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Script2 
{
	@Test
	public void state() throws FileNotFoundException, IOExceptio
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./p.properties"));
		String a1=p.getProperty("baseurl");
		System.out.println(a1);
	}


}
