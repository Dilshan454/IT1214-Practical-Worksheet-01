//Q1

class Student{
    private String name;
    private int regNo;
    private String course;

    Student(String name,int regNo,String course){
        this.name=name;
        this.regNo=regNo;
        this.course=course;
    }

    public String getName(){
        return name;
    }
    public int getRegNo() {
         return regNo; 
    }
     public String getCourse() { 
        return course; 
    }


    public void setName(String name){
         this.name=name;
    }
     public void setRegNo(int regno){
         this.regNo=regNo;
    }
     public void setCourse(String course){
         this.course=course;
    }

    public void display(){
        System.out.println("Name: "+name+ ", Reg No: " + regNo + ", Course: " + course);
    }
}

