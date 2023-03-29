import java.io.*;

public class ByteArrayInput {
    public static void main(String[] args) {
        byte[] b = new byte[100];
        for (byte i = 0; i < b.length; i++) b[i]=i;

        try {
            InputStream is = new ByteArrayInputStream(b);
            for(byte i = 0; i < b.length; i++) System.out.print(is.read()+" ");
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}