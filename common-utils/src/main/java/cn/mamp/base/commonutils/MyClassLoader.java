package cn.mamp.base.commonutils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClassLoader extends ClassLoader {

	private static Logger log = LoggerFactory.getLogger(MyClassLoader.class);

	/**
	 * ClassLoader => SecureClassLoader => URLClassLoader => (1.AppClassLoader == 2.EXtClassLoader)
	 */
	private String path = "E:\\Asiainfo\\Work\\workspaces\\sd0603\\common-utils\\target\\classes";

	public MyClassLoader(String path) {
		super();
		this.path = path;
	}

	public MyClassLoader(ClassLoader parent, String path) {
		super(parent);
		this.path = path;

	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		byte[] bytes = loadClassData(name);
		return defineClass(name, bytes, 0, bytes.length);
	}

	private byte[] loadClassData(String name) {
		FileInputStream fis = null;
		ByteArrayOutputStream baos = null;
		try {
			name = name.replace(".", File.separator);
			fis = new FileInputStream(new File(path + name + ".class"));
			baos = new ByteArrayOutputStream();
			int b;
			while ( (b = fis.read()) != -1) {
				baos.write(b);
			}
			return baos.toByteArray();
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (baos != null) {
					baos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
		return null;
	}

	public static void main(String[] args)
		throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
		SecurityException, IllegalArgumentException, InvocationTargetException {
		String path = "E:\\Asiainfo\\Work\\workspaces\\sd0603\\common-utils\\target\\classes\\";
		URL url = MyClassLoader.class.getResource(".\\");
		log.debug(url.toString());
		url = MyClassLoader.class.getClassLoader().getResource("\\");
		log.debug(url.toString());
		url = MyClassLoader.class.getResource("\\");
		log.debug(url.toString());

		MyClassLoader mcl = new MyClassLoader(path);
		Class<?> clazz = mcl.findClass("cn.mamp.test.TestClassLoader");
		Object obj = clazz.newInstance();
		Method m = clazz.getMethod("test");
		m.invoke(obj, null);
	}

}
