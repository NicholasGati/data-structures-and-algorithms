public class Animal {

  String type;
  String gender;
  int age;

  public Animal(String type, String gender, int age) {
    super();
    this.type = type;
    this.gender = gender;
    this.age = age;
  }

  public void eat() {
    System.out.println("eating...");
  }

  public void sleep() {
    System.out.println("sleeping...");
  }

  public void info() {
    System.out.println("I am a " + age + " year old " + gender + " " + type);
  }
}