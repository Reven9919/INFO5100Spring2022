class Shape {
    private String name;
    private double area;
    private double perimeter;
    private double radius;

    public Shape(String name, double area, double perimeter){
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }
    public String Shape(){
        return "Shape";
    }
    public void display(){
        return;
    }
    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            super(name, area, perimeter);
            this.length = length;
            this.width = width;
        }
        @Override
        public String Shape() {
            return "Rectangle";
        }
        public double computerArea() {
            return this.length * this.width / 2;
        }
        public double computerPerimeter() {
            return this.length * 2 + this.width * 2;
        }
    }


    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super(name, area, perimeter);
            this.radius = radius;
        }
    }
    @Override
    public String Shape() {
        return "Circle";
    }
    public double computerArea() {
        return this.radius * this.radius * 3.14;
    }

    public double computerPerimeter() {
        return this.radius * 2 * 3.14;
    }
}
