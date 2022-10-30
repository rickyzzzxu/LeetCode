package com.ricky.queue_stack;

import java.util.Stack;

public class JZ31 {
    /*栈的压入、弹出序列
    描述
    输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
    假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该
    压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
            1. 0<=pushV.length == popV.length <=1000
            2. -1000<=pushV[i]<=1000
            3. pushV 的所有数字均不相同*/
    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            if(pushA.length < 1){
                return true;
            }

            Stack<Integer> stack = new Stack<>();
            int k = 0;
            for(int i = 0; i < pushA.length; i++){
                stack.push(pushA[i]);
                while(!stack.isEmpty() && stack.peek() == popA[k]){
                    stack.pop();
                    k++;
                }
            }
            return stack.isEmpty();
        }
    }
}
