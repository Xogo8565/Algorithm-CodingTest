import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int val = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=val) {
                list.add(arr[i]);
                val = arr[i];
            }
        } return list.stream().mapToInt(i->i).toArray();
    }
}
