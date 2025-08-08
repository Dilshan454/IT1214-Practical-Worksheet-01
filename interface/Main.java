//Define interface for shape
interface Shape{
    double getArea();
    double getPerimeter();
}

//Create a Circle class that implements the Shape interface
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}





public class Main{
    public static void main(String[] args){
        Shape circle=new Circle(5);


        System.out.println("Circle Area: "+circle.getArea());

    }
}