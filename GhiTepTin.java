import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiTepTin {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String content = "Hello, world!";

        // Ghi file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(content.getBytes());
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }

        // Đọc file
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                String str = new String(buffer, 0, bytesRead);
                System.out.print(str);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}