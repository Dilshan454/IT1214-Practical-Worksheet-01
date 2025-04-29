class Shape{
    void Shape(){
        System.out.println("Area not defined");
    }
}
class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    //@Override
    public void area(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle: "+area);
    }
}