public class AudioMain {
	public static void main(java.lang.String[] args) {
		java.io.File audiofile = new java.io.File("sega-saturn-startup.wav");
		try {
			javax.sound.sampled.AudioInputStream audiostream = javax.sound.sampled.AudioSystem.getAudioInputStream(audiofile);
			javax.sound.sampled.Clip audioclip = javax.sound.sampled.AudioSystem.getClip();
			audioclip.open(audiostream);
			audioclip.start();
			java.lang.System.out.println("Audiostream initialized, audioclip opened, start.");
			Thread.sleep(audioclip.getMicrosecondLength() / 1000);
		}
		catch (javax.sound.sampled.UnsupportedAudioFileException unsupportedaudiofileException) {
			unsupportedaudiofileException.printStackTrace();
			java.lang.System.out.println("SUPPORTED FORMATS {}");
		}
		catch (java.io.IOException IOexception) {
			IOexception.printStackTrace();
			java.lang.System.out.println("NEVER RUN THIS ON ANYWHERE EXCEPT");
			java.lang.System.out.println("STRAIGHT FROM THE PROGRAM ROOT.");
		}
		catch (javax.sound.sampled.LineUnavailableException lineunavailableException) {
			lineunavailableException.printStackTrace();
		}
		catch (java.lang.InterruptedException interruptedException) {
			interruptedException.printStackTrace();
		}
	}
}
