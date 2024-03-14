import java.awt.SystemTray;
import java.io.*;
public class File {
    public static void main(String[] args) {
        try{
            int array [] ={10,12,13,12,1};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x=0; x<array.length; x++){
                os.write(array[x]);
            }
            os.close();
        InputStream is = new FileInputStream("test.txt");
        int size = is.available();

        for(int i =0; i<size; i++){
            System.out.println((int)is.read() + " ");
        }
        is.close();
        
        } catch (IOException e){
            System.out.println("Exception");
        }
    }
}
