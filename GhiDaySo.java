import java.io.*;
import java.util.*;

public class GhiDaySo {
    public static void main(String[] args) throws IOException {
        String fileName = "dayso.dat";
        File file = new File(fileName);
        file.createNewFile();

        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            raf.writeInt(arr[i]);
        }

        raf.close();

        raf = new RandomAccessFile(file, "rw");

        System.out.println("day so nguyen trong tep tin ban dau:");
        for (int i = 0; i < arr.length; i++) {
            int num = raf.readInt();
            System.out.print(num + " ");
        }

        Arrays.sort(arr);

        raf.seek(0);

        for (int i = 0; i < arr.length; i++) {
            raf.writeInt(arr[i]);
        }

        raf.close();

        raf = new RandomAccessFile(file, "r");

        System.out.println("\nday so nguyen trong tep tin sau khi sap xep:");
        for (int i = 0; i < arr.length; i++) {
            int num = raf.readInt();
            System.out.print(num + " ");
        }

        raf.close();
    }
}