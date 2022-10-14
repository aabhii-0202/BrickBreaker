import java.util.Scanner;

/*
Design an Address class with member variables Street num, city, state and country and appropriate constructor.
Design a Student class with constructor (Student (String USN, String Name, Address addr)), College class with
constructor (College (String Name, Address addr)) and Employee class with constructor
(Employee (String EmpID, String Name, Address addr)).

Write a Java program to create ‘n’ Student objects,College Objects and Employee objects
and print the student, college and employee addresses respectively and
demonstrate passing of object as a parameter to the constructor.
 */
class Address {
    int street_num;
    String city,state,country;

    public Address(int street_num, String city, String state, String country) {
        this.street_num = street_num;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student{
    String usn,name;
    Address address;

    public Student(String usn, String name, Address address) {
        this.usn = usn;
        this.name = name;
        this.address = address;
    }
}

class College{
    String name;
    Address address;

    public  College(String name, Address address){
        this.name = name;
        this.address = address;
    }
}

class Employee{
    String id,name;
    Address address;

    public Employee(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Student[] students = new Student[n];
        College[] colleges = new College[n];
        Employee[] employees = new Employee[n];

    }
}
