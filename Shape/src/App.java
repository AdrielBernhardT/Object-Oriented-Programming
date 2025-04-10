public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle();
        Square square = new Square();

        circle.Luas = 314;
        circle.Keliling = 62;

        System.out.println("\nCircle Luas : " + circle.Luas);
        System.out.println("Circle Keliling : " + circle.Keliling);
        System.out.println("Square Luas : " + square.Luas);
        System.out.println("Square Keliling : " + square.Keliling);
    }
}
