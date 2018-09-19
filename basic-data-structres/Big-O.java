/* Introduction to Algorithm Analysis and Big O Notation
-----------------------------------------------------

Algorithm: A computer program is basically a list of step-by-step instructions on how the computer should go about solving a problem.

An algorithm is considered efficient if it scales well relative to input.

Algorithms that iterate an entire list of things once are typically Linear.

Growth Rate = The way an algorithm scales as you give it more input.
  Linear = Sinlge Loop regardless of input size.
  Quadratic = A loop inside of a loop.

Asymptotic Notation:  n = input size.
  Constant Time Growth rate = O(1)
  Linear Growth Rate = O(n)
  Quadratic Growth Rate = O(n^2) 
  Cubic Growth Rate = O(n^3)
  Exponential Growth Rate = O(n^n)
*/

public int countEvens(int elements[]) {
  /** 
   * Linear.
   * The time it takes this algorithms to run is linearly dependent on the size of the input. 
   * O(n) 
  */
  int count = 0;
  for (int i = 0; i < elements.length; i++) {
    if (elements[i] %2 == 0) {
      count++;
    }
  }
  return count;
}

/**
 * Constant. 
 * O(1)
 * Very efficient.
 */
public int getElementFrom(int [] a, int index) {
  return a[index];
}

/**
 * Quadratic.
 * Quadratic in Math means squared.
 * O(n^2)
 * The number of iterations is the size of the input squared!
 * The more input values, the slower the algorithm is going to get.
 */
public int countDulicates(int items1[], int items2[]) {
  int count = 0;
  for (int i = 0; i < items1.length; i++) {
    for (int j = 0; j < items2.length; j++) {
      if (items1[i] == items2[j]) {
        count++;
      }
    }
  }
  return count;
}

/**
 * Cubic.
 * O(n^3)
 * Very inefficient.
 */
for (int i = 0; i < items1.length; i++) {
  for (int j = 0; j < items2.length; j++) {
    for (int k = 0; k < items2.length; k++) {
      // do something...
    }
  }
}

/**
 * Matrix Chain Multiplication
 * This is an optimization problem that can be solved using dynamic programming. 
 * Given a sequence of matrices, the goal is to find the most efficient way to multiply these matrices. 
 * The problem is not actually to perform the multiplications, but merely to decide the sequence of the matrix multiplications involved.
 * 
 * This algorithm below is Cubic. 
 * O(n^3)
 */
public class MatrixOrderOptimization {
  protected int[][]m;
  protected int[][]s;

  public void matrixChainOrder(int[] dims) {
    int n = dims.length - 1;
    m = new int[n][n];
    s = new int[n][n];

    for (int lenMinusOne = 1; lenMinusOne < n; lenMinusOne++) {
      for (int i = 0; i < n - lenMinusOne; i++) {
        int j = i + lenMinusOne;
        m[i][j] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
          int cost = m[i][k] + m[k+1][j] + dims[i]*dims[k+1]*dims[j+1];
          if (cost < m[i][j]) {
            m[i][j] = cost;
            s[i][j] = k;
          }
        }
      }
    }
  }

  public void printOptimalParenthesizations() {
    boolean[] inAResult = new boolean[s.length];
    printOptimalParenthesizations(s, 0, s.length - 1, inAResult);
  }

  void printOptimalParenthesizations(int[][]s, int i, int j,  /* for pretty printing: */ boolean[] inAResult) {
    if (i != j) {
      printOptimalParenthesizations(s, i, s[i][j], inAResult);
      printOptimalParenthesizations(s, s[i][j] + 1, j, inAResult);
      String istr = inAResult[i] ? "_result " : " ";
      String jstr = inAResult[j] ? "_result " : " ";
      System.out.println(" A_" + i + istr + "* A_" + j + jstr);
      inAResult[i] = true;
      inAResult[j] = true;
    }
  }
}