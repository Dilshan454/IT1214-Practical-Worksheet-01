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

    //Q6
    Book book1=new Book("Java Basics", "Authors A",300.0);
    Book book2=new Book("Python Essentials","Author B");

    //Q7
    Circle circle=new Circle(5.0);
    circle.area();

    //Q8
    Person person=new Person();
    person.setName("Alice");
    person.setAge(25);
    System.out.println("Person Name: "+person.getName());
    System.out.println("Person Age: "+person.getAge());

    //Q9
    TempConverter converter=new TempConverter();
    System.out.println("30 Celsius to Farenheit: "+converter.toFahrenheit(30));
    System.out.println("86 Fahrenheit to Celsius: "+converter.toCelsius(86));

    //Q10
    Manager manager = new Manager("Bob", 201, 75000);
    manager.displayDetails();

 }
 }