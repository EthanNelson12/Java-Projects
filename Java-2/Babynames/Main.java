import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
      File text = new File("/Users/ethannelson/Java-2/Babynames/babynames.txt");
      Scanner scan = new Scanner(text);
      String line = "";
      FileWriter writer = new FileWriter("boyNames.txt");
      while(scan.hasNextLine())
      {
        line = scan.nextLine();
        String[] split = line.split(" ");
       
        writer.write(split[2] + "\n");
        
      }
      writer.close();
     
    }

   
}
