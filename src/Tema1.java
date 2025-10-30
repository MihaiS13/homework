public class Tema1 {
    public static void main(String[] args) {
//        drawFullShape(10, 4);
//        drawShapeOutline(10, 4);
        drawFullShape(5);
    }

    public static void drawFullShape(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//        public static void drawShapeOutline(int width1, int height1) {
//            for (int w = 0; w < height1; w++) {
//                if (w == 0 || w ==height1 - 1) {
//                    for (int e = 0; e < width1 ; e++) {
//                        System.out.print("*");
//                    }
//                    } else {
//                        System.out.print("*");
//                        for ( int e = 0; e < width1 - 2; e++) {
//                            System.out.print(" ");
//                        }
//                        System.out.print("*");
//                        }
//                System.out.println();
//                    }
//                }
    public static void drawFullShape(int size) {
        drawFullShape(size, size);
    }

            }
