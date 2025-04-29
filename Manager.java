class Employee{
    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("Employee Name: "+name+",ID "+id+", salary:"+salary);
    }
}
class Manager extends Employee{
    Manager(String Name,int id,double salary){
        super(name,id,salary);
    }

     @Override
    void displayDetails() {
        super.displayDetails();
        double bonus = salary * 0.2;
        System.out.println("Bonus: " + bonus);
}