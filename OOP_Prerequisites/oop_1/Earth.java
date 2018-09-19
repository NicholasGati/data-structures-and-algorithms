public class Earth {

  // This method is the entry point for all Java applications.
  public static void main(String args[]) {
    Human human1 = new Human("Pablo Fernandez", "purple", 43, 76);
    Human human2 = new Human("Tom Smith", "blue", 12, 56);
    Human human3 = new Human("Morgan Antla", "brown", 26, 68);
    Human human4 = new Human("Samantha Gutierrez", "grey", 34, 48);

    human1.speak();
    human2.speak();
    human3.speak();
    human4.speak();
  }
}

// Compiling instructions
// javac file.java file.java file.java file.java file.jav
// java classname
// https://users.soe.ucsc.edu/~eaugusti/archive/102-winter16/misc/howToCompileAndRunFromCommandLine.html