import java.util.Scanner;

class lab1{

  String name;
  int age;
  
  void display(){
    System.out.println("This is a non-static method");
    System.out.println("The name of the candidate is: " + name);
    System.out.println("The age of the candidate is: " + age);
    System.out.println("\n");

  }

  void display1(){
    System.out.println("This is a static method");
    System.out.println("The name of the candidate is: " + name);
    System.out.println("The age of the candidate is: " + age);
    System.out.println("\n");
  }



  public static void main(String[] args){
    try{


    Scanner obj = new Scanner(System.in);
    lab1 a = new lab1();

    System.out.println("Enter the name: ");
    a.name = obj.nextLine();
    System.out.println("Enter the age: ");
    a.age = obj.nextInt();


    a.display();
    a.display1();
    obj.close();


    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}

   