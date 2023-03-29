import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInput {
    public static void main(String[] args) {
        byte[] byteArray = new byte[100];
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) (i + 1);
        }

        System.out.println("Byte array:");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }

        ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
        byte[] readByteArray = new byte[100];

        try {
            bis.read(readByteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nRead byte array:");
        for (byte b : readByteArray) {
            System.out.print(b + " ");
        }
    }
}