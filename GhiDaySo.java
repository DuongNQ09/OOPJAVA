import java.io.IOException;
import java.io.RandomAccessFile;

public class GhiDaySo {
    public static void main(String[] args) {
        String fileName = "dayso.dat";
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Ghi file
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            for (int number : numbers) {
                raf.writeInt(number);
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }

        // Đọc file
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            long fileLength = raf.length();
            for (int i = 0; i < fileLength / 4; i++) {
                int number = raf.readInt();
                System.out.print(number + " ");
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}