import java.io.IOException;
import java.util.Properties;

public class ProperterMgr {
    static Properties props  = new Properties();
    static {
        try {
            props.load(ProperterMgr.class.getClassLoader().getResourceAsStream("config/tank.properties"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public static String getProper(String key){
        return props.getProperty(key);
    }
}
