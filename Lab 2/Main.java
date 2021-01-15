import java.util.Scanner;
// QUESTION ONE
public class Main {
  public static void main(String[] args) {
    // STARTUP SCANNER
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = 4;
    // CREATE DATA LIB
    int action[] = { 100, 0, 90, 21 };
    int comedy[] = { 0, 100, 17, 80 };
    int category[] = { 1, 2, 1, 2 };
    System.out.println("Enter test data :D");
    // GET USER INPUT
    int x = sc.nextInt();
    int y = sc.nextInt();
    double c[] = new double[n];
    // FIND EUCLIDIAN
    for (int j = 0; j < n; j++) {
      c[j] = (x - action[j]) * (x - action[j]) + (y - comedy[j]) * (y - comedy[j]);
      c[j] = Math.pow(c[j], 0.5);
    }
    double min = c[0];
    int p = 0;
    for (int i = 0; i < n; i++) {
      if (min > c[i]) {
        min = c[i];
        p = i;
      }
    }
    // PREDICT A? or C?
    if (category[p] == 1) {
      System.out.println("Action");
    } else if (category[p] == 2) {
      System.out.println("Comedy");
    }
    // End Of Question One
  }
}