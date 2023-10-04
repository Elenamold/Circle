// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.01F);
        Float v ;
        v = circle.radius;
        System.out.printf( "Radius = " + circle.radius.toString() ) ;
        System.out.printf( "\n" + "Area of circle  = " + circle.calculateArea(v).toString() ) ;
        }
    }
