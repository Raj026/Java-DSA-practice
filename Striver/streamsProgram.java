package Striver;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsProgram {
    public static void main(String[] args) {
        int[] arr = {4,5,6,9,10};

        List<Integer> res = Arrays.stream(arr).map(a -> a * 6).filter(a -> a / 4 == 6).boxed().toList();
        System.out.println(res);
    }
}
