public class Counter {
  
  private String name = null;
  private int counter = 0;

  public Counter(String name) {
    super();
    this.name = name;
  }

  public void increment() {
    counter++;
  }

  public int getCurrentValue() {
    return counter;
  }
  public String toString() {
    return name + ": " + counter;
  }
}