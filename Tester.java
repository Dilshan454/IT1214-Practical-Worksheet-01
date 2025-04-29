  public class Tester {

    //Q1
     public static void main(String[] args) {
      Student student = new Student("John Doe", 2025101, "Information Technology");
        student.display();

    //Q2
    Rectangle rect1=new Rectangle();
    Rectangle rect2=new Rectangle(5,10);
    System.out.println("Area of rect2:" +rect2.area());

    //Q3
    Calculator calc=new Calculator();
    System.out.println("Add two integers: " +calc.add(2,3));
    System.out.println("Add three integers:" +calc.add(2,3,4));
    System.out.println("Add two doubles: "+calc.add(2.5,3.5));

    //Q4
    Car car=new Car();
    car.brand="Toyota";
    car.speed=120;
    //car.model="Corolla";
    car.display();

    //Q5
    BankAccount account=new BankAccount();
    account.deposit(5000);
    account.withdraw(1500);
    account.displayBalance();
 }
 }