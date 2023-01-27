import java.util.Scanner;

public class School {
 
    public static void main(String[] args) {
        
    String id,name,surname,address,standard;
    String dob,age,divison,roll_no,mob_no;

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter id : ");
    id = sc.nextLine();
    System.out.print("Enter name : ");
    name = sc.nextLine();
    System.out.print("Enter Surname : ");
    surname = sc.nextLine();
    System.out.print("Enter Address : ");
    address = sc.nextLine();
    System.out.print("Enter Standard : ");
    standard = sc.nextLine();
    System.out.print("Enter DOB : ");
    dob = sc.nextLine();
    System.out.print("Enter Age : ");
    age = sc.nextLine();
    System.out.print("Enter divison : ");
    divison = sc.nextLine();
    System.out.print("Enter roll number : ");
    roll_no = sc.nextLine();
    System.out.print("Enter Mobile number : ");
    mob_no = sc.nextLine();
    System.out.println("=================================");
    System.out.println("=================================");
    

    Student s = new Student(id,name,surname,address,standard,dob,age,divison,roll_no,mob_no);
    System.out.println("Id = "+s.id);
    System.out.println("Name = "+s.name);
    System.out.println("Surname = "+s.surname);
    System.out.println("Address = "+s.address);
    System.out.println("Standard = "+s.standard);
    System.out.println("Bod = "+s.dob);
    System.out.println("Age = "+s.age);
    System.out.println("Divison = "+s.divison);
    System.out.println("roll_number = "+s.roll_no);
    System.out.println("mob_number = "+s.mob_no);
    }
}

class Student{

    public String id,name,surname,address,standard;
    public String dob,age,divison,roll_no,mob_no;

    Student(String i,String n,String s,String a,String s1,String d,String a1,String d,String r,String m){
        id = i;
        name = n;
        surname = s;
        address = a;
        standard = s1;
        dob= d;
        age = a1;
        divison = d;
        roll_no = r;
        mob_no = m;
    }
}

