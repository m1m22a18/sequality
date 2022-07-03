package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSums() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sums(1, 10));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.average(55, 10), 0);
  }

  @Test
  public void testOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumsOdd(1, 10));
  }

  @Test
  public void testOdd2() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumsOdd(0, 10));
  }

  @Test
  public void testEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumsEven(1, 10));
  }

  @Test
  public void testEven2() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumsEven(2, 10));
  }
}
