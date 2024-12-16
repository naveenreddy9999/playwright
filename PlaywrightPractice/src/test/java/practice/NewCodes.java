package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewCodes {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,5,7,8,4);

       System.out.println(number.stream().filter(n-> n%2==0).collect(Collectors.toList()));
    }
}
