package clientjava;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientJavaLanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		try {

		//	String url = "http://192.168.40.88:8080/demoWebService/rest/hello/Hie";
			String url = "http://localhost:8080/demoWebService/rest/hello/Fatima";
			Client client = Client.create();

			WebResource webResource = client
			   .resource(url);

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from My Server  .... \n");
			System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }

	}

}
