public class http {
    private static final java.net.http.HttpClient client_http = java.net.http.HttpClient.newBuilder().version(java.net.http.HttpClient.Version.HTTP_1_1).connectTimeout(java.time.Duration.ofSeconds(16)).build();
    private static java.net.http.HttpHeaders headers;
    private static java.net.http.HttpResponse<java.lang.String> response;
    public static void main(java.lang.String[] args)
    {
	java.net.http.HttpRequest http_request = java.net.http.HttpRequest.newBuilder().GET().uri(java.net.URI.create("https://www.oracle.com")).setHeader("User-Agent", "Java HTTP Bot").build();
	try {
	response = client_http.send(http_request, java.net.http.HttpResponse.BodyHandlers.ofString());
	headers = response.headers();
        headers.map().forEach((k, v) -> java.lang.System.out.println(k + ":" + v));
	}
	catch (java.io.IOException | java.lang.InterruptedException exception) {
	   exception.printStackTrace();
	}
	java.lang.System.out.println(response.statusCode());
	java.lang.System.out.println(response.body());
    }
}
