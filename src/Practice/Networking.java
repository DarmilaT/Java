package Practice;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Networking {
    public static void main(String[] args) throws IOException {
        URL obj = new URL("https://www.sanfoundry.com/javamcq");
        URLConnection obj1 = obj.openConnection();
        System.out.println(obj1.getContentType());
    }
}
