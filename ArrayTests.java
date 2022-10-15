import static org.junit.Assert.*;
import org.junit.*;

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
  public void testReverseInPlace_2(){
    int[] input1= {1,2,3,4,5,6};
    int[] check1= {6,5,4,3,2,1};
    ArrayExamples.reverseInPlace(input1);
    for (int i=0; i<input1.length; i++){
      System.out.println(input1[i]);
    }
    assertArrayEquals(check1,input1);
  }

  @Test 
  public void testReversed_2(){
    int[] input= {1,2,3,4,5,6};
    int[] new_arr= ArrayExamples.reversed(input);
    assertEquals(new_arr,input);
  }

  @Test
  public void testAverageWOLowest(){
    double[] input= {1.0,1.0,1.0,1.0};
    assertEquals(1.0,ArrayExamples.averageWithoutLowest(input),0.0);
  }
}
