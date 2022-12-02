package com.ricky.other_algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class JZ58 {
    /*左旋转字符串
            描述
    汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
    对于一个给定的字符序列  S ，请你把其循环左移 K 位后的序列输出。例如，字符序列 S = ”abcXYZdef” ,
    要求输出循环左移 3 位后的结果，即 “XYZdefabc”*/
    public class Solution {
        public String LeftRotateString(String str, int n) {
            if (str == null || str.length() == 0) {
                return "";
            }

            Queue<Character> queue = new LinkedList<>();
            for (int i = 0; i < str.length(); i++) {
                queue.add(str.charAt(i));
            }

            for (int i = 0; i < n; i++) {
                queue.add(queue.poll());
            }

            StringBuilder s = new StringBuilder();
            while (!queue.isEmpty()) {
                s.append(queue.poll());
            }

            return s.toString();
        }
    }
}
