import java.io.*;
import java.util.*;

public class GhiDaySo {
    public static void main(String[] args) throws IOException {
        // Tạo một tệp tin với tên "dayso.dat"
        String fileName = "dayso.dat";
        File file = new File(fileName);
        file.createNewFile();

        // Tạo một đối tượng RandomAccessFile để ghi dữ liệu vào tệp tin
        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        // Tạo một mảng ngẫu nhiên gồm 10 số nguyên
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        // Ghi mảng số nguyên vào tệp tin
        for (int i = 0; i < arr.length; i++) {
            raf.writeInt(arr[i]);
        }

        // Đóng đối tượng RandomAccessFile
        raf.close();

        // Mở đối tượng RandomAccessFile để đọc dữ liệu
        raf = new RandomAccessFile(file, "rw");

        // Đọc dữ liệu từ tệp tin và hiển thị lên màn hình
        System.out.println("day so nguyen trong tep tin ban dau:");
        for (int i = 0; i < arr.length; i++) {
            int num = raf.readInt();
            System.out.print(num + " ");
        }

        // Sắp xếp mảng số nguyên
        Arrays.sort(arr);

        // Đưa con trỏ đọc về đầu tệp tin
        raf.seek(0);

        // Ghi lại mảng số nguyên vào tệp tin
        for (int i = 0; i < arr.length; i++) {
            raf.writeInt(arr[i]);
        }

        // Đóng đối tượng RandomAccessFile
        raf.close();

        // Mở đối tượng RandomAccessFile để đọc dữ liệu
        raf = new RandomAccessFile(file, "r");

        // Đọc dữ liệu từ tệp tin và hiển thị lên màn hình
        System.out.println("\nday so nguyen trong tep tin sau khi sap xep:");
        for (int i = 0; i < arr.length; i++) {
            int num = raf.readInt();
            System.out.print(num + " ");
        }

        // Đóng đối tượng RandomAccessFile
        raf.close();
    }
}