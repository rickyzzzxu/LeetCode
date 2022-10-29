package com.ricky.queue_stack;

import java.util.Stack;

public class JZ9 {
    /*用两个栈实现队列
    描述
    用两个栈来实现一个队列，使用n个元素来完成 n 次在队列尾部插入整数(push)
    和n次在队列头部删除整数(pop)的功能。 队列中的元素为int类型。保证操作合
    法，即保证pop操作时队列内已有元素。
    数据范围： n\le1000n≤1000
    要求：存储n个元素的空间复杂度为 O(n)O(n) ，插入与删除的时间复杂度都是 O(1)O(1)*/


    public class Solution {
        //入栈只对stack1操作，出栈只对stack2操作
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            //栈2不为空直接pop元素
            if(!stack2.isEmpty()){
                return stack2.pop();
                //栈2空，栈1不空，把栈1中所有元素装入栈2
            }else if(!stack1.isEmpty() && stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
                //栈1，栈2都为空，返回-1。
            }else{
                return -1;
            }
        }
    }

}
