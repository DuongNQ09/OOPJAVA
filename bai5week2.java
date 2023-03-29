import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bai5week2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        try {
            System.out.print("Nhập tên tệp tin: ");
            fileName = br.readLine();

            // Ghi tệp tin
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));

            System.out.print("Nhập số lượng chuỗi: ");
            int n = Integer.parseInt(br.readLine());

            for (int i = 1; i <= n; i++) {
                System.out.print("Nhập chuỗi thứ " + i + ": ");
                String line = br.readLine();
                line = line.toUpperCase();
                bw.write(line);
                bw.newLine();
            }

            bw.close();

            // Đọc tệp tin
            BufferedReader fr = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = fr.readLine()) != null) {
                System.out.println(line);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}