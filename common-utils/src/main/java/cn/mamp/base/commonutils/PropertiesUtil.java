package cn.mamp.base.commonutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class PropertiesUtil {

	private static Logger log = LoggerFactory.getLogger(PropertiesUtil.class);

	public static void main(String[] args) {
		try {
			getProperty("");
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static void getProperty(String prop) throws IOException {
		InputStream is = null;
		Properties pro = new Properties();
		is = ClassloaderUtil.class.getClassLoader().getResourceAsStream("app.properties");
		pro.load(is);
		log.debug(pro.getProperty("app.name"));

		pro = new Properties();
		is = ClassloaderUtil.class.getClassLoader().getResourceAsStream("\\app.properties");
		pro.load(is);
		log.debug(pro.getProperty("app.name"));

		pro = new Properties();
		is = ClassloaderUtil.class.getClassLoader().getResourceAsStream("conf/conf.properties");
		pro.load(is);
		log.debug(pro.getProperty("jdk.version"));

		pro = new Properties();
		is = ClassloaderUtil.class.getClassLoader().getResourceAsStream("\\conf/conf.properties");
		pro.load(is);
		log.debug(pro.getProperty("jdk.version"));
	}
}
