package cn.mamp.base.commonutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class ClassloaderUtil extends ClassLoader {

	private static Logger log = LoggerFactory.getLogger(ClassloaderUtil.class);

	public static void main(String[] args) {
		
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		return super.findClass(name);

	}

}
