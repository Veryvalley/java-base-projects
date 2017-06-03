package cn.mamp.base.http.javaapi;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
		String url = "http://localhost:8888/httpserver/param";
		try {
			System.out.println("==========GET===========");
			HttpClient.sendGet(url, "name=666");
			System.out.println("==========POST===========");
			HttpClient.sendPost(url, "name=888");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
