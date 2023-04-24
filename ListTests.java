import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests{
    @Test
    public void testFilter(){
        ListExamples lE = new ListExamples();
        List<String> testList = new 
            ArrayList<String>(Arrays.asList(" ", "P A", "0"));
        List<String> correctList = new 
            ArrayList<String>(Arrays.asList(" ", "P A"));
        StringChecker sC = new StringCheckerClass(" ");
        assertEquals(correctList, lE.filter(testList, sC));
        testList.remove(0);
        correctList.remove(0);
        assertEquals(correctList, lE.filter(testList, sC));
    }

    @Test
    public void testMerge(){
        ListExamples lE = new ListExamples();
        List<String> testList1 = new 
            ArrayList<String>(Arrays.asList("1", "7"));
        List<String> testList2 = new 
            ArrayList<String>(Arrays.asList("2", "9", "9"));
        List<String> correctList = new 
            ArrayList<String>(Arrays.asList("1", "2", "7", "9", "9"));
        assertEquals(correctList, lE.merge(testList1, testList2));
    }
}