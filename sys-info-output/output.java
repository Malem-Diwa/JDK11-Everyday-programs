public class output {
	public static java.lang.String osname = java.lang.System.getProperty("os.name");
	public static java.lang.String osversion = java.lang.System.getProperty("os.version");
	public static java.lang.String osarch = java.lang.System.getProperty("os.arch");
	public static void main(java.lang.String[] args) {
		java.lang.System.out.println("os.name [" + osname + "]");
		java.lang.System.out.println("os.version [" + osversion + "]");
		java.lang.System.out.println("os.arch [" + osarch + "]");
	}
}
