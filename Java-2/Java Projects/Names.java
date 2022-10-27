import java.io.*;
public class Names 
{
    public static void main(String[] args) throws Exception 
    {
        File file = new File("/Users/ethannelson/Java-2/Babynames/babynames.txt");


        BufferedReader br  = new BufferedReader(new FileReader(file));
        String st;

        while((st = br.readLine()) != null)
        {
            System.out.println(st);
        }
    }
}
