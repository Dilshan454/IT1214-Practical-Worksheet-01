class Vehicle{
    String brand;
    int speed;

    void display(){
        System.out.println("This is vehicle.");
        System.out.println("Brand: "+brand+", speed: "+speed+"km/h");
    }
}
class Car extends Vehicle{
    String model;

    @Override
    void display(){
        System.out.println("Brand: "+brand+", Model: "+model+", speed: "+speed+"km/h");
    }
}