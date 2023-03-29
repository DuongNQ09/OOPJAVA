import java.io.*;

public class LuongXuatMang {
    try{
        ByteArrayOutputStream os = new ByteArrayOutputStream(100);
        for(byte i=0;i<100;i++)os.write(i);
        byte[] b=os.toByteArray();
        for(byte i=0;i<100;i++) System.out.println(b[i]+" ");
        os.close();
    }
    catch(Exception e){
        System.err.println(e);
    }
}