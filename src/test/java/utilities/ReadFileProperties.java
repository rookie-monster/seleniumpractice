package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFileProperties {

	public static Properties prp = new Properties();
	public static FileReader frd;

    public static void readConfigFiles() throws IOException {
        frd = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
        prp.load(frd);
    }

    public static Properties getPrp() {
        return prp;
    }

}
