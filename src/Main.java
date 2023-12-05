public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.println("Diện tích Hình tròn: " + circle.Area());


        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Diện tích Hình chữ nhật: " + rectangle.Area());
    }
}
