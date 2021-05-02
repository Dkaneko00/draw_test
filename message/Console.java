import java.util.Properties;
public class Console {

    private static final boolean isWIN32 = System.getProperty("os.name")
            .toLowerCase().startsWith("windows");

    public static void clear() {
        if(isWIN32) {
            for(int i = 0; i < 50; i++){System.out.println();}
        } else {
            System.out.print("\u001b[2J\u001b[1;1H");
            System.out.flush();
        }
    }


}
