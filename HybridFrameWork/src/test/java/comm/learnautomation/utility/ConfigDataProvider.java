package comm.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File src = new File("./Config/Config.properties");
		try {
			FileInputStream fi = new FileInputStream(src);
			pro = new Properties();
			pro.load(fi);
		} catch (Exception e) {
			System.out.println("Not able to read File " + e.getMessage());
		}

	}

	public String getConfigData(String key) {
		return pro.getProperty(key);
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getStagingUrl() {
		return pro.getProperty("qaUrl");
	}
}
