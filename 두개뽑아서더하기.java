import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] solution(int[] numbers) {
        Set set = new HashSet();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted()
                .mapToInt(e->(Integer)e).toArray();
    }
}
