public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.3,9);
        System.out.println("-".repeat(20) + "RECTANGLE" + "-".repeat(20));
        System.out.println(" Area of rectangle : " + rectangle.getArea());
        System.out.println(" Perimeter of rectangle : " + rectangle.getPerimeter());



        Square square = new Square(10.22);
        System.out.println("\n" + "-".repeat(20) + "SQUARE" + "-".repeat(20));
        System.out.println(" Area of rectangle : " + square.getArea());
        System.out.println(" Perimeter of rectangle : " + square.getPerimeter());
    }
}
