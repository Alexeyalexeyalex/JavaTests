import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;





public class Tests {

    @Test
    public void sumListShouldBeCorrect(){
	    List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
	    List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
	    List<Integer> result = new ArrayList<>(Arrays.asList(2,4,6));
	    List <Integer> resultTest = ListOperations.sumLists(list1, list2);
	    assertEquals(result, resultTest, "Сумма списков не верна!");
    }
    
    @Test
    public void findMaxShouldBeCorrect(){
	    List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,9));
	    int maxValue = 9;
	    int result = ListOperations.findMax(list1);
	    assertEquals(result, maxValue, "Неправильное максимальное значение!");
    }
    
    @Test
    public void filterStringsShouldBeCorrect(){
	    List<String> list1 = new ArrayList<>(Arrays.asList("Lee","Jackson","Ahalay Mahalay","Hello"));
	    int minValue = 4;
	    List<String> resultList = new ArrayList<>(Arrays.asList("Jackson","Ahalay Mahalay","Hello"));
	    
	    List<String> result = ListOperations.filterStrings(list1, minValue);
	    assertEquals(result, resultList, "Неправильная фильтрация!");
    }
    
    
}



