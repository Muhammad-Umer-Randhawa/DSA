class HanoiTowers {
  public static void main(String[] args) {
    int numTowers = 3;
    if (args.length > 0) numTowers = Integer.parseInt(args[0]);
    print(numTowers, 'A', 'B', 'C');
  }

  static void print(int n, char x, char y, char z) {
    // move n disks from peg x to peg y using peg z:
    if (n == 1) System.out.println(x + " --> " + y); // base
    else {
      print(n-1, x, z, y); // recursion
      System.out.println(x + " --> " + y);
      print(n-1, z, y, x); // recursion
    }
  }
}