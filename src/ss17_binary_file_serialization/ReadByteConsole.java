package ss17_binary_file_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;
//        String hi = new String();
//
//        while (true) {
//            System.out.print("Nhập 1 ký tự: ");
//            int ch = is.read();
//            if (ch == 'q') {
//                System.out.println("Finished!");
//                break;
//            }
//            is.skip(0); // Loại bỏ 2 ký tự \r và \n
//            System.out.println("Ký tự nhận được: " + (char) ch);
//        }


        // Tạo một luồng đầu vào bằng cách đọc một file
        // File CodeGym.txt có chứa từ khóa: Hello InputStream
        InputStream in = new FileInputStream("CodeGym.txt");

        // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
        // Ta dùng mảng 10 byte

        byte[] bytes = new byte[105];
        int i = -1;
        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
        // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
        // Khi không còn phần tử trong luồng i sẽ = -1
        while ((i = in.read(bytes)) != -1) {
            // Tạo String từ các byte đọc được
            System.out.println(i);
            String s = new String(bytes, 0, i);
            System.out.println(s);
        }
        in.close();
    }
}
