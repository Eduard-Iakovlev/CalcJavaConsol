public class OSDetected {
    public enum OS {
            WINDOWS, LINUX
        }

    private OS os = null;

    public OS getOS() {
        if (os == null) {
            String operSys = System.getProperty("os.name").toLowerCase();
            if (operSys.contains("win")) {
                os = OS.WINDOWS;
            } else if (operSys.contains("nix") || operSys.contains("nux")
                    || operSys.contains("aix")) {
                os = OS.LINUX;
            }
        }
        return os;
    }
}
