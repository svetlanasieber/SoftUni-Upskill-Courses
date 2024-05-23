import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int singleByte = inputStream.read();

        while (singleByte >= 0) {
            System.out.print(Integer.toBinaryString(singleByte) + " ");
            singleByte = inputStream.read();

        }
        inputStream.close();
    }
}
