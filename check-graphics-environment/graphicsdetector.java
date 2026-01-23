public class graphicsdetector {
	public static void main(java.lang.String[] args) {
		java.lang.String DISPLAY = java.lang.System.getenv("DISPLAY");
		java.lang.String WAYLAND_DISPLAY = java.lang.System.getenv("WAYLAND_DISPLAY");
		java.lang.String XDG_CURRENT_DESKTOP = java.lang.System.getenv("XDG_CURRENT_DESKTOP");
		java.lang.String DESKTOP_SESSION = java.lang.System.getenv("DESKTOP_SESSION");
		if (DISPLAY != null || WAYLAND_DISPLAY != null || XDG_CURRENT_DESKTOP != null || DESKTOP_SESSION != null) {
		java.lang.System.out.println("DISPLAY [" + DISPLAY + "]");
		java.lang.System.out.println("WAYLAND_DISPLAY [" + WAYLAND_DISPLAY + "]");
		java.lang.System.out.println("XDG_CURRENT_DESKTOP [" + XDG_CURRENT_DESKTOP + "]");
		java.lang.System.out.println("DESKTOP_SESSION [" + DESKTOP_SESSION + "]");
		}
		else {
			java.lang.System.out.println("Headless.");
		}
	}
}
