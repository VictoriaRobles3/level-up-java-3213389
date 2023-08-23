package com.linkedin.javacodechallenges;
import java.util.*;
public class Person {
  private String fname;
  private String lname;
  private int age;
  Scanner in = new Scanner(System.in);
  public void introduction(){
    welcome();
    name();
    lastName();
    Age();
    displayWelcomeMessage();
    changeData();
    sayHello();
  }
  public void welcome(){
    System.out.println("Hello, please introduce yourself");
  }
  public void name(){
    System.out.println("What is your first name?: ");
    String name = in.nextLine();
    this.fname = name;
  }
  public String getName(){
    return this.fname;
  }
  public void setName(String name){
    this.fname = name;
  }

  public void lastName(){
    System.out.println("What is your last name?: ");
    String last = in.nextLine();
    this.lname = last;
  }
  public String getlastName(){
    return this.lname;
  }

  public void setlastName(String last){
    this.lname = last;
  }

  public void Age(){
    System.out.println("How old are you?: ");
    int age = in.nextInt();
    this.age = age;
  }
  public int getAge(){
    return this.age;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void changeData(){
    System.out.println("Is everything correct?: ");
    in.nextLine();
    String answer = in.nextLine();
    switch(answer){
      case "yes":
      break;
      case "no":
        System.out.println("Please update your information");
        introduction();
      break;
      default:
        System.out.println("Cannot recognize input, try again.");
    }
  }
  public void displayWelcomeMessage(){
    System.out.println("-- Welcome -- \n");
    System.out.println("Name: " + this.fname);
    System.out.println("Last name: " + this.lname);
    System.out.println("Age: " + this.age);
  }

  public void sayHello(){
    System.out.println("Hello, my name is "+ getName() + " " + getlastName()+ 
                      " and I am " + getAge() + " years old.");
  }

  public static void main(String[] args){
    Person example = new Person();
    example.introduction();
   /*example.setName("Victoria");
   System.out.println(example.getName());
   example.setlastName("Robles");
   System.out.println(example.getlastName());
   example.setAge(24);
   System.out.println(example.getAge());
   example.displayWelcomeMessage(); */
  }
}
