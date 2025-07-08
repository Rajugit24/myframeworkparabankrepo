package ParabankAutomation.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigDataClass {
	Properties pro;
	public ReadConfigDataClass() throws IOException {
	File file=new File("./Cofigurations/config.properties");
	FileInputStream fis=new FileInputStream(file);
	pro=new Properties();
	pro.load(fis);
}

public String  getbrowsername() {
	String browsername=pro.getProperty("browser");
	return browsername;
}

public String geturl() {
	String url=pro.getProperty("url");
	return url;
    }
}

