package ss17_binary_file_serialization;

import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
        FileOutputStream os = new FileOutputStream("output.txt");

        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };

        // Ghi lần lượt các ký tự vào luồng
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            // Ghi ký tự vào luồng
            os.write(b);
        }
        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
        os.close();
        InputStream is = new FileInputStream("output.txt");
        byte[] bytes1 = new byte[100];
        int i = -1;
        while ((i = is.read(bytes1)) != -1){
            System.out.println(new String(bytes1, 0 ,i));
        }
        is.close();
    }
}