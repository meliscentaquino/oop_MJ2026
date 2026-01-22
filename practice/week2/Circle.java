class Circle {
    double radius;
    static final double PI = 3.24;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;

    }
    public double getArea(){
        return PI * (radius * radius);
    }

}