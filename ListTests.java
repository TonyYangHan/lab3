import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


class Check implements StringChecker{
    public boolean checkString(String s){
        return s.length()>5;
    }
}
public class ListTests {
    @Test
    public void simplyAdd(){
        StringChecker sc1= new Check();
        ArrayList<String> input1= new ArrayList<>();
        input1.add("apple");
        input1.add("pinapple");
        input1.add("watermelon");
        String[] check1= {"pinapple","watermelon"};
        Object[] result= ListExamples.filter(input1, sc1).toArray();
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        assertArrayEquals(check1,result);
    }
}
