import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Selection_Sort {
    public static void sort(List<Student> ar, Comparator<Student> comparator){
        for(int i = 0; i < ar.size() - 1; i++){
            int min_index = i;
            for(int j = i +1; j < ar.size(); j++){
                if(comparator.compare((ar.get(j)),ar.get(min_index)) < 0){
                    min_index = j;
                }
            }
            Student temp = ar.get(i);
            ar.set(i, ar.get(min_index));
            ar.set(min_index, temp);

        }
    }
}
