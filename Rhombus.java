package practice;

public class Rhombus {
    public static void main(String[] args) {
        drawRhombus(6);
    }

    private static void drawRhombus(int size) {
        int space = size - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
            space--;
        }

        space = 1;
        size -= 1;

        for (int i = size; i > 0; i--) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }
}
