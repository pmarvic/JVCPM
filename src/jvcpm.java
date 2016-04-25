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
        InputStream entrada = null;

        try {

            entrada = new FileInputStream("EnterpriseConfig.properties");

            // cargamos el archivo de config
            config.load(entrada);

            // obtenemos las config y las imprimimos
            System.out.println(config.getProperty("ip"));
            System.out.println(config.getProperty("database"));
            System.out.println(config.getProperty("user"));
            System.out.println(config.getProperty("pass"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}  