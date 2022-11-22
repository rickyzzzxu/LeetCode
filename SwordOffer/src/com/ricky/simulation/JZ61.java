package com.ricky.simulation;

import java.util.HashMap;

public class JZ61 {
    /*扑克牌顺子
            描述
    现在有2副扑克牌，从扑克牌中随机五张扑克牌，我们需要来判断一下是不是顺子。
    有如下规则：
            1. A为1，J为11，Q为12，K为13，A不能视为14
            2. 大、小王为 0，0可以看作任意牌
            3. 如果给出的五张牌能组成顺子（即这五张牌是连续的）就输出true，否则就输出false。
            4.数据保证每组5个数字，每组最多含有4个零，数组的数取值为 [0, 13]*/
    public class Solution {
        public boolean IsContinuous(int [] numbers) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0;
            int min = 13;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    if (map.containsKey(numbers[i])) {
                        return false;
                    } else {
                        map.put(numbers[i], i);
                        if (numbers[i] > max) {
                            max = numbers[i];
                        }
                        if (numbers[i] < min) {
                            min = numbers[i];
                        }
                    }
                }
            }

            if (max - min < 5) {
                return true;
            } else {
                return false;
            }
        }
    }


}
