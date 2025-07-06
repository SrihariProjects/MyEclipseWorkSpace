package abhibus;

public class TestUtil {
    // Static wait (not preferred for real use, just for demonstration)
    public static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

