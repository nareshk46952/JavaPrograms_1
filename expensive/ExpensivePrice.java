package expensive;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpensivePrice {
    public static void main(String[] args) throws IOException {

        File xl = new File(
                "C:\\Users\\knare\\Files\\Upgard\\JAVA\\demo\\expensive\\folder\\home-and-garden - new.csv");
        Scanner s = new Scanner(xl);
        ArrayList<String> aStr = new ArrayList<String>();
        while (s.hasNextLine()) {
            String data = s.nextLine();
            aStr.add(data);
        }
        s.close();
        Object[] list = new Object[aStr.size()];
        list = aStr.toArray();
        // Converting Object array to String array;
        String strList = "";
        for (int i = 0; i < list.length; i++) {
            strList += (String) list[i];
        }
        String[] strArr = strList.split(",");
        
    }
}