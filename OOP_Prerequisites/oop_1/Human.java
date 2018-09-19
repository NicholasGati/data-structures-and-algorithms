public class Human {
  String name;
  String eyeColor;
  int age;
  int heightInInches;
  
  // This constructor comes by default with each class
  public Human(String name, String eyeColor, int age, int height) {
    super();
    this.name = name;
    this.age = age;
    this.eyeColor = eyeColor;
    this.heightInInches = height;
  }

  public void speak() {
    System.out.println("Hello, my name is " + name);
    System.out.println("I am " + heightInInches + " inches tall.");
    System.out.println("I am " + age + " years old.");
    System.out.println("My eyes are " + eyeColor);
  } 

  public void eat() {
    System.out.println("I am eating.");
  }

  public void walk() {
    System.out.println("I am walking.");
  }

  public void work() {
    System.out.println("I am working.");
  }
}