package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sums(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public double average(int sum, int num) {
    double ave;
    ave = (double) sum / num;
    return ave;
  }

  public int sumsOdd(int s, int e) {
    int sum = 0;
    if (s % 2 == 0)
      s += 1;
    for (int i = s; i <= e; i += 2) {
      sum += i;
    }
    return sum;
  }

  public int sumsEven(int s, int e) {
    int sum = 0;
    if (s % 2 != 0)
      s += 1;
    for (int i = s; i <= e; i += 2) {
      sum += i;
    }
    return sum;
  }
}
