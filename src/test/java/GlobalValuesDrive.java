import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        FileInputStream fis= new FileInputStream("C:\\Users\\admin\\thanhhoa\\data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser", "chrome");
        FileInputStream fos =new FileInputStream("D:\\AutoTest\\chromedriver_win32\\chromedriver.exe");

    }
}
