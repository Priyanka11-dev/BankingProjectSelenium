package Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig() {
		try {
		File src=new File("./Configurations/config.properties");
		FileInputStream file=new FileInputStream(src);

		prop=new Properties();
		prop.load(file);}
		catch(Exception e){
			System.out.println("Exception happended");
		}
	}

	public String getURL() {
		String url=prop.getProperty("url");
		return url;
	}
	
	public String getUserid() {
		String userid=prop.getProperty("userid");
		return userid;
	}
	
	public String getPswrd() {
		String pswrd=prop.getProperty("pswrd");
		return pswrd;
	}
	
	public String getChromepath() {
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getIEpath() {
		String iepath=prop.getProperty("iepath");
		return iepath;
	}

}
