public class main {
	static java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
	public static void main(java.lang.String[] args) {
		boolean FINISH = false;
		while (FINISH == false) {
			java.lang.System.out.println("Type 'stop' to break the while loop.");
			short A = (short)(java.lang.Math.random() * 1003);
			short B = (short)(java.lang.Math.random() * 258);
			short C = (short)(java.lang.Math.random() * 9);
			java.lang.System.out.println("PROBLEM {" + A + " + " + "Math.pow(" + B + ", " + C + ")" + "}");
			java.lang.String INPUT = scan.nextLine();
			short CORRECT = (short)(A + java.lang.Math.pow(B,C));
			if (INPUT.equals(java.lang.Short.toString(CORRECT))) {
				java.lang.System.out.println("true.");
			}
			else if (INPUT.equals("stop")) {
				break;
			}
			else {
				java.lang.System.out.println("false.");
			}
		}
		scan.close();
		scan = null;
		java.lang.System.out.println("Stop.");
	}
}
