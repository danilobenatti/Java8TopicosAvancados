package http2Incubator;

import java.net.http.HttpClient;

public class Http2Example {
	
	public static void main(String[] args) {
		
		HttpClient client = HttpClient.newHttpClient();
		System.out.println(client.getClass().toString());
	}
	
}
