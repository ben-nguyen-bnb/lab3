import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
public class LinkedListTests {
    
  // LinkedListExample, append
  @Test
  public void testLinkedListAppend() {
    LinkedList linkedList = new LinkedList();
    linkedList.prepend(1);
    linkedList.prepend(0);
    linkedList.prepend(-1);
    linkedList.append(-2);
    assertEquals("-1 0 1 -2 ", linkedList.toString());
  }

  // LinkedListExample, last
  @Test 
  public void testLinkedListLast() {
    LinkedList linkedList = new LinkedList();
    linkedList.prepend(1);
    linkedList.prepend(0);
    linkedList.prepend(-1);
    assertEquals(1, linkedList.last());
  }

  // LinkedListExample, toString (empty)
  @Test
  public void testLinkedListToString() {
    LinkedList linkedList = new LinkedList();
    assertEquals("", linkedList.toString());
  }

  //LinkedListExample, ee
  @Test
  public void testLinkedList() {
    LinkedList linkedList = new LinkedList();
    linkedList.prepend(1);
    // linkedList.prepend(0);
    // linkedList.prepend(-1);
    // System.out.println(linkedList.first());
    // System.out.println(linkedList.last());
    assertEquals(1, linkedList.last());
  }
}
