package proxypattern.protectionproxy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bhushan on 18/3/17.
 */
public class Folder implements IFolder {

    @Override
    public void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            int i;
            System.out.println("file content:");
            while((i=fileReader.read())!=-1) {
                System.out.print((char)i);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry file not found.");
        } catch (IOException e) {
            System.out.println("Sorry something went wrong!");
        }
    }

}
