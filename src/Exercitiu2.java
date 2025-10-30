public class Exercitiu2 {
    public static void main(String[] args) {
        drawShapeCorners(10, 4);
    }

    public static void drawShapeCorners(int width2, int height2) {
        for (int w = 0; w < height2; w++) {
            if (w == 0 || w == height2 - 1) {
                {
                    System.out.print("*");
                    for (int x = 0; x < width2 - 2; x++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            } else {
                for (int e = 0; e < width2; e++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
