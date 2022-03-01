class Shape {
    private String name;
    private String color;
    private int area;
    private int perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String printShape() {
        return "Shape";
    }

    public int getArea() {
        return this.area;
    }

    public int getPerimeter() {
        return this.perimeter;
    }
}

class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, String color, int side) {
        super(name, color);
        this.base = side;
        this.height = (int) (side * Math.sqrt(3) / 2);
    }

    @Override
    public String printShape() {
        return "Triangle";
    }

    @Override
    public int getArea() {
        return this.base * this.height / 2;
    }

    @Override
    public int getPerimeter() {
        return base + (int) Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2)) * 2;
    }

}

class Rhombus extends Shape {
    private int d1;
    private int d2;

    public Rhombus(String name, String color, int d1, int d2) {
        super(name, color);
        this.d1 = d1;
        this.d2 = d2;
    }

    public Rhombus(String name, String color, int d1) {
        super(name, color);
        this.d1 = d1;
        this.d2 = d1;
    }


    @Override
    public String printShape() {
        return "Rhombus";
    }

    @Override
    public int getArea() {
        return this.d1 * this.d2 / 2;
    }

    @Override
    public int getPerimeter() {
        return (int) Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2)) * 4;
    }
}