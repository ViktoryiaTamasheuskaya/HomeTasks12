package Tasks12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main( String [] args )
    {

        List<Book> Library = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
            String fileRead = br.readLine();
            while (fileRead != null)
            {
                String[] tokenize = fileRead.split(",");
                String title=tokenize[0];
                 String author=tokenize[1];
                int yearPublished = Integer.parseInt(tokenize[2]);
                Book b = new Book(title,author, yearPublished);

                Library.add(b);
                fileRead = br.readLine();
            }

            br.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }

        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }

        for (Book each : Library)
        {
            System.out.println("====================");
            System.out.println(each.getTitle() + " " + each.getAuthor() + " " + each.getYear());



        }

    }

}
