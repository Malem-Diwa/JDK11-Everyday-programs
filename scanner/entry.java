public class entry {
	public static java.lang.String Input;
	public static void main(java.lang.String[] args) {
		try {
			java.io.InputStreamReader inputstreamreader = new java.io.InputStreamReader(java.lang.System.in);
			java.io.BufferedReader bufferedreader = new java.io.BufferedReader(inputstreamreader);
			java.lang.System.out.println("Type something and let BufferedReader interpret it. ('exit' for quit)");
			while (true) {
				Input = bufferedreader.readLine();
				if ("exit".equals(Input)) {
					java.lang.System.out.println("End.");
					break;
				}
			else {
				java.lang.System.out.print("\033[2K\r");
				java.lang.System.out.println("'" + Input + "'");
				}
			}
		}
		catch (java.io.IOException exception) {
				exception.printStackTrace();
			}
		}
	}
