package ricky.com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/2/27 19:49
 */
public class demo1 {

    public static void main(String[] args) {
        int[] numbers = {2,2,2,0,1};
        int l = 0;
        int r = numbers.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (numbers[l] <= numbers[r]) {
                System.out.println(numbers[l]);
            }

            if (numbers[mid] > numbers[l]) {
                l = mid + 1;
            } else if (numbers[mid] < numbers[l]) {
                r = mid;
            } else {
                l++;
            }
        }

        System.out.println(numbers[l]);
    }

}