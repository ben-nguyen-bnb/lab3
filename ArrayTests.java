import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceWMore() {
    int[] input1 = {0, 1, 2, 3, 4, 5, 6, 7};
    int[] correct = {7, 6, 5, 4, 3, 2, 1, 0};
    ArrayExamples.reverseInPlace(input1);
    System.out.println(input1);
    assertArrayEquals(correct, input1);
  }

  @Test
  public void testReversedNew() {
    int[] input1 = {0, 1, 2, 3, 4, 5, 6, 7};
    int[] correct = {7, 6, 5, 4, 3, 2, 1, 0};
    assertArrayEquals(correct, ArrayExamples.reversed(input1));
  }
}
