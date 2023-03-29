import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class GhiDaySo {
    public static void main(String[] args) {
        String fileName = "dayso.dat";
        int[] numbers = { 10, 50, 30, 40, 20 };

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            // Ghi file
            for (int number : numbers) {
                raf.writeInt(number);
            }

            // Đọc file
            long fileLength = raf.length();
            raf.seek(0);

            int[] readNumbers = new int[(int) (fileLength / 4)];
            for (int i = 0; i < fileLength / 4; i++) {
                readNumbers[i] = raf.readInt();
            }

            // Sắp xếp và ghi file
            Arrays.sort(readNumbers);
            raf.setLength(0);

            for (int number : readNumbers) {
                raf.writeInt(number);
            }

            // In dãy số
            raf.seek(0);

            System.out.print("Dãy số: ");
            for (int i = 0; i < fileLength / 4; i++) {
                System.out.print(raf.readInt() + " ");
            }
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}