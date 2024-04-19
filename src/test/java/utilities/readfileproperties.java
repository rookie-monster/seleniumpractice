package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readfileproperties {

	public static void main(String[] args) throws IOException {

		FileReader frd = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
		Properties prp = new Properties();
		prp.load(frd);

	}

}
