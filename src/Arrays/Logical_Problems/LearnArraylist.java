package Arrays.Logical_Problems;
import java.util.ArrayList;
import java.util.List;
public class LearnArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            list.add(i+1);
        }
        System.out.println(list.toString());
    }
}