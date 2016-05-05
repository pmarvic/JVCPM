import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by pmarvic on 25/04/2016.
 */
public class jvcpm {

    static public void main(String[] args)   {

        Properties config = new Properties();
        InputStream inFile = null;

        try {

            inFile = new FileInputStream("EnterpriseConfig.properties");
            config.load(inFile);
            // Load Properties
            System.out.println(config.getProperty("ip"));
            System.out.println(config.getProperty("database"));
            System.out.println(config.getProperty("user"));
            System.out.println(config.getProperty("pass"));
            // Load frmLogin
            gui.frmLogin.launch();

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}  