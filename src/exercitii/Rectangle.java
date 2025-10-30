package exercitii;

public class Rectangle {

private double lenght = 10;
private static double width = 20;



    public static void main(String[] args) {
getArea();
getPerimeter();
getDiagonal();
    }

    static void getArea(){
        System.out.println( width * 1);
    }
    static void getPerimeter(){
        System.out.println( 2 * (width + 1));
    }
    static void getDiagonal(){
        System.out.println( Math.sqrt (Math.pow( width , 2) + Math.pow( 1 , 2)));
    }


}
