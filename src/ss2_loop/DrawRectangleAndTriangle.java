package ss2_loop;

public class DrawRectangleAndTriangle {
    public static void main(String[] args) {
        drawRectangle(3, 5);
        System.out.println();
        drawTriangle1(6);
        System.out.println();
        drawTriangle2(6);
        System.out.println();
        drawTriangle3(5);
        System.out.println();
        drawDiamond1(7);
        System.out.println();
        drawDiamond2(5);
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle1(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle2(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle3(int width) {
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

    public static void drawDiamond1(int width) {
        for (int i = 1; i <= width; i++) {
            for (int j = width - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2; k++) {
                if (k == 1 || k == i * 2) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = width - 1; i >= 1; i--) {
            for (int j = width - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2; k++) {
                if (k == 1 || k == i * 2) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();

        }
    }


    public static void drawDiamond2(int width) {
        for (int i = 1; i <= width; i++) {
            for (int j = width - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = width - 1; i >= 1; i--) {
            for (int j = width - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
