// Lớp Hình tròn kế thừa từ Shape
class Circle extends Shape {
    double radius;

    // Constructor của Hình tròn
    public Circle(double radius) {
        this.radius = radius;
    }

    // Triển khai phương thức Area cho Hình tròn
    @Override
    double Area() {
        return Math.PI * radius * radius;
    }
}
