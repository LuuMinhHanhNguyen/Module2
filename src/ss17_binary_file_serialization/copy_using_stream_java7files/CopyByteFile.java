package ss17_binary_file_serialization.copy_using_stream_java7files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyByteFile {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.println("Enter destination file:");
        String targetPath = in.nextLine();

        FileInputStream inputStream = new FileInputStream("src/ss17_binary_file_serialization/copy_using_stream_java7files/" + sourcePath);
        FileOutputStream outputStream = new FileOutputStream("src/ss17_binary_file_serialization/copy_using_stream_java7files/" + targetPath);
        byte[] bytes = new byte[100];
        int length;
        int byteCount = 0;
        while ((length = inputStream.read(bytes)) > 0){
            outputStream.write(bytes, 0, length);
            byteCount += length;
        }

        inputStream.close();
        outputStream.close();
        System.out.println("Number of byte: " + (byteCount * 2));

    }
}
