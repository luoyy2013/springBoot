package com.luoyy.studyspringboot.leetcodequestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组，返回两个数字的索引，使它们相加到特定目标。

 您可以假设每个输入只有一个解决方案，并且您可能不会两次使用相同的元素。

 例：

 给定nums = [2,7,11,15]，target = 9，

 因为nums [ 0 ] + nums [ 1 ] = 2 + 7 = 9，
 返回[ 0，1 ]。

 * @author luosir
 * @date 2019/04/24
 */
public class Question1 {
    private static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>(2);
        for (int i = 0; i < numbers.length; map.put(numbers[i], i++)) {
            if (map.containsKey(target - numbers[i])) {
                return new int[] {map.get(target - numbers[i]), i};
            }
        }
        return new int[] {0, 0};
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15,23,34,22,1,54,222,432,231}, 663)));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
