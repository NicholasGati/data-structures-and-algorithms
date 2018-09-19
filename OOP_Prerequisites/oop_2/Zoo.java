public class Zoo {
  public static void main(String args[]) {
    Animal animal1 = new Animal("dog", "male", 3);
    Animal animal2 = new Animal("dragon", "female", 1024);
    Animal animal3 = new Animal("fish", "male", 1);

    animal1.info();
    animal2.info();
    animal3.info();
  }
}