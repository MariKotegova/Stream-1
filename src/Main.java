import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> modifiedList = new ArrayList<>();
        for(int i : list){
            if((i > 0) && (i % 2 == 0)) {
                modifiedList.add(i);
            }
        }
        System.out.println("Список из четных чисел больше нуля \n" + modifiedList);
        modifiedList.sort(Comparator.naturalOrder());
        System.out.println("Тот же список отсортированный в порядке возрастания \n" + modifiedList);
    }
}

