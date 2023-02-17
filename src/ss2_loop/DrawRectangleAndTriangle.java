package ss2_loop;

public class DrawRectangleAndTriangle {
    public static void main(String[] args) {
        drawRectangle(3,5);
        System.out.println();
        drawTriangle1(6);
        System.out.println();
        drawTriangle2(6);
        System.out.println();
        drawTriangle3(5);
    }

    public static void drawRectangle(int height, int width){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle1(int height){
        for(int i = 1; i <= height; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle2(int height){
        for(int i = 1; i <= height; i++){
            for (int j = height; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle3(int width){
        for (int i = 1; i <= width; i++) {
            for (int j = width - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
