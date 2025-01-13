abstract class Shape{

  
    private String color;

    public Shape(String color){
        this.color = color;
    }
    public String getcolor(){
        return this.color;
    }
    public void setolor(String colour){
        this.color = colour;
    }

    public abstract double calculateArea();

    public void displayinfo(){
        System.out.println("Color: " + this.color);
    }

}

class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(String color, double width, double length){
        super(color);
        this.width = width;
        this.length = length;
       
    }

    public void setWidth(double value){
        this.width=value;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLength(double value){
        this.length=value;
    }
    public double getLength(){
        return this.length;
    }

    public double calculateArea(){
        return (this.width)*(this.length);

    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.print(" Width: " + this.width + " Length: " + this.length + " Area: " + this.calculateArea());
    }

}

class Triangle extends Shape{
    private double height;
    private double base;
    public Triangle (String color, double height, double base){
        super(color);
        this.height = height;
        this.base = base;
    }
    public void setHeight(double value){
        this.height=value;
    }
    public double getHeight(){
        return this.height;
    }
    public void setBase(double value){
        this.base=value;
    }
    public double getBase(){
        return this.base;
    }

    public double calculateArea(){
        return this.height * this.base / 2;

    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.print(" Height: " + this.height + " Base: " + this.base + " Area: " + this.calculateArea());
    }
}

class Circle extends Shape{

    private double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double value){
        this.radius = value;
    }

    public double calculateArea(){
        return 3.14 * radius * radius;

    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.print(" Radius " + this.radius + " Area: " + this.calculateArea());
    }
}