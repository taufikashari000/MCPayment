import java.util.*;

public class MCPayment {
    public static void main(String[] args) {
        /*
        * YOU CAN PUT TEST CODE HERE, JUST CALL FUNCTION BELOW
        * */
    }
    //NOMOR 1
    public static List<Integer> subs(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        boolean check = false;
        for(Integer i : nums) {
            for(Integer j : nums) {
                if(i-j >=0) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if(check) {
                result.add(i);
            }
        }
        return result;
    }

    //NOMOR 2
    public static List<Integer> div(List<Integer> nums, Integer x) {
        List<Integer> result = new ArrayList<>();
        boolean check = false;
        for(Integer i : nums) {
            for(Integer j : nums) {
                if(i/j != x) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if(check) {
                result.add(i);
            }
        }
        return result;
    }

    //NOMOR 3
    public static List<String> stringLength(String word, Integer x) {
        String[] splitted = word.split("\\s+");
        List<String> result = new ArrayList<>();
        for(int i = 0; i < splitted.length; i++) {
            if(splitted[i].length() == x) {
                result.add(splitted[i]);
            }
        }
        return result;
    }
}

