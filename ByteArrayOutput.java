import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutput {
    public static void main(String[] args) {
        byte[] byteArray = new byte[100];
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) (i + 1);
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            bos.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] outputByteArray = bos.toByteArray();

        System.out.println("Output byte array:");
        for (byte b : outputByteArray) {
            System.out.print(b + " ");
        }
    }
}