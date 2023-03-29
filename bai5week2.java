import java.io.*;

public class bai5week2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap ten tep tin: ");
        String fileName = br.readLine();

        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);

        System.out.println("Nhap cac chuoi( 'quit' de ket thuc nhap chuoi):");
        String line;
        do {
            line = br.readLine();
            if (!line.equals("quit")) {
                String upperCaseLine = line.toUpperCase();
                fw.write(upperCaseLine + "\n");
            }
        } while (!line.equals("quit"));

        fw.close();
        br.close();

        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        System.out.println("Cac chuoi da ghi vao tep tin:");
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }

        fr.close();
        reader.close();
    }
}