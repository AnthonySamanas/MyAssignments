package week3day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("End point is "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("End point is "+endpoint+" & Request Body is "+requestBody+" & Request Status is "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient client= new APIClient();
		client.sendRequest("www.google.com");
		client.sendRequest("www.instagram.com", "instagramAPI", true);
	}
}
