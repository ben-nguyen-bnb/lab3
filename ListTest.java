import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
    
    @Test
    public void ListTestMerge() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> list2 = new ArrayList<String>();
        list2.add("b");
        list2.add("c");
        list2.add("d");

        List<String> input = ListExamples.merge(list, list2);

        List<String> correct = new ArrayList<String>();
        correct.add("a");
        correct.add("b");
        correct.add("b");
        correct.add("c");
        correct.add("c");
        correct.add("d");
        assertEquals(correct.toString(), input.toString());
    }
}
