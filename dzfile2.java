import java.io.IOException;
import java.io.*;
import java.io.FileWriter;


public class dzfile2 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter out = null;
        try {
            fw = new FileWriter("file.txt", true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            for (int i = 0; i < 100; i++) {
                out.print("TEXT ");
            }
   
            out.close();
} catch (IOException e) {
    //exception handling left as an exercise for the reader
}
}
}