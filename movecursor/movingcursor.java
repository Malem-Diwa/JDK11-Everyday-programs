public class movingcursor {
	public static void main(java.lang.String[] args) {
		java.lang.System.out.print("\033[2J");
		java.lang.System.out.print("\033[10;50HIn another position...");
		java.lang.System.out.print("\033[5;25HNear the top left.");
	}
}
