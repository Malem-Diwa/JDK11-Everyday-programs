public class Main {
	public static void main(java.lang.String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
		while (true) {
			java.lang.System.out.println("Enter the URI, then wait. Or just type (EXIT, CASE INSENSITIVE DUE TO equalsIgnoreCase())");
			java.util.Scanner netscanner = null;
			try {
				java.lang.String input = scanner.nextLine();
				if (input.equalsIgnoreCase("exit")) {
					break;
				}
				java.net.URI uri = new java.net.URI(input);
				java.net.URL url = uri.toURL();
				java.io.InputStream inputStream = url.openStream();
				netscanner = new java.util.Scanner(inputStream);
				while (netscanner.hasNextLine()) {
					java.lang.System.out.println(netscanner.nextLine());
				}
				netscanner.close();
				java.lang.System.out.println("SUCCESS.");
			}
			catch (java.lang.Exception exception) {
				exception.printStackTrace();
				if (netscanner != null) {
					netscanner.close();
				}
			}
		}
		scanner.close();
	}
}
