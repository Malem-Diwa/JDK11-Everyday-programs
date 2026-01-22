public class timedisplay {
	public static void main(java.lang.String[] args) {
		java.time.ZonedDateTime asia;
		java.time.ZoneId jakarta;
		jakarta = java.time.ZoneId.of("Asia/Jakarta");
		asia = java.time.ZonedDateTime.now(jakarta);
		java.lang.System.out.print("\u001B[35m" + asia + "\u001B[0m");
	}
}
