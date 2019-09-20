public class Main {
  public static void main(String[] args) {
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x <= y; x++) {
        // if we're on an even row print "O", otherwise print "X"
        if (y % 2 == 0) {
          System.out.print("O");
        } else {
          System.out.print("X");
        }
      }
      System.out.println();
    }
  }
}
