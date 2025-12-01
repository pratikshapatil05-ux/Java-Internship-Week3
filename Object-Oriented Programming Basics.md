**1.Introduction to Object-Oriented Programming (OOP)**



Programming style based on objects

* OOP is faster and easier to execute
* OOP provides a clear structure for the programs
* OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
* OOP makes it possible to create full reusable applications with less code and shorter development time



**2. Classes and Objects**



Classes and objects are the two main aspects of object-oriented programming

ex, fruit is class and apple, banana, mango is  objects



class Fruits{

&nbsp;   String name;

&nbsp;   String color;

}



public class Main {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Fruits f1 = new Fruits();   // object

&nbsp;       f1.name = "Apple";

&nbsp;       f1.color = "Red";

&nbsp;   }

}



**3. Constructors \& Method Overloading**



A **constructor** in Java is a special method that is used to initialize objects.

The constructor is called when an object of a class is created.



Types:



* Default constructor
* Parameterized constructor



Ex, 

class Student {

&nbsp;   String name;

&nbsp;   int age;



&nbsp;   Student() {  // default constructor

&nbsp;       name = "Unknown";

&nbsp;   }



&nbsp;   Student(String n, int a) {  // parameterized

&nbsp;       name = n;

&nbsp;       age = a;

&nbsp;   }

}



**Method Overloading** -> same method name, different parameters

like 

void show(){}

void show(int a){}

void show(String name){}



**4. Access Modifiers-> controls the access level**



By now, you are quite familiar with the public keyword that appears in almost all of our examples:

***public class Main***

The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.



| Modifier  | Access                  |

| --------- | ----------------------- |

| public    | everywhere              |

| private   | same class only         |

| protected | same package + subclass |

| default   | same package            |



**5. Encapsulation \& Data Hiding**



The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:



* &nbsp;declare class variables/attributes as private
* provide public get and set methods to access and update the value of a private variable



ex, 

class BankAccount {

&nbsp;   private double balance;



&nbsp;   public double getBalance() {

&nbsp;       return balance;

&nbsp;   }



&nbsp;   public void deposit(double amt) {

&nbsp;       balance += amt;

&nbsp;   }

}



**6. Basic Class Relationships**



Has-a (Composition): Library has books

Uses-a: Student uses Library

Is-a (Inheritance – next week)







