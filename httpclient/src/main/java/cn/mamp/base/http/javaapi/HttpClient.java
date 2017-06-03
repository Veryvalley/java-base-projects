package cn.mamp.base.http.javaapi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class HttpClient {

	public static void sendGet(String url, String params) throws IOException {
		url = url + "?" + params;
		URL httpUrl = new URL(url);
		URLConnection conn = httpUrl.openConnection();
		setRequestProperties(conn);
		InputStream is = conn.getInputStream();
		byte[] bytes = new byte[2048];
		is.read(bytes);

		System.out.println(new String(bytes));
		is.close();

	}

	public static void sendPost(String url, String params) throws IOException {
		URL httpUrl = new URL(url);
		URLConnection conn = httpUrl.openConnection();
		setRequestProperties(conn);
		// Post请求设置参数在请求的body中传输
		conn.setDoOutput(true);
		conn.setDoInput(true);
		OutputStream os = conn.getOutputStream();
		os.write(params.getBytes());
		os.flush();

		InputStream is = conn.getInputStream();
		byte[] bytes = new byte[2048];
		is.read(bytes);

		System.out.println(new String(bytes));
		is.close();
	}

	private static void setRequestProperties(URLConnection conn) {
		conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
		// conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
		conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.8");
		conn.setRequestProperty("Cache-Control", "no-cache");
		conn.setRequestProperty("Connection", "keep-alive");
		conn.setRequestProperty("Cookie", "ORIGIN=0; bdime=0");
		conn.setRequestProperty("Pragma", "no-cache");
		conn.setRequestProperty("User-Agent",
			"Mozilla/5.0 (Windows NT 10.0; WOW64) "
			+ "AppleWebKit/537.36 (KHTML, like Gecko) "
			+ "Chrome/50.0.2661.102"
			+ "UBrowser/6.1.2107.204 Safari/537.36");
	}

}
