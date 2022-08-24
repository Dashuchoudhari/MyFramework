package propertiesFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		
		

	}
	public static void getProperties() {
		try {
		Properties prop=new Properties();
		String projectPath=System.getProperty("user.dir");
		InputStream input=new FileInputStream(projectPath+"\\src\\test\\java\\propertiesFile\\config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
	}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

}
}