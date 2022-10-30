package com.ricky.queue_stack;

import java.util.Stack;

public class JZ30 {
    /*包含min函数的栈
    描述
    定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的 min 函数，
    输入操作时保证 pop、top 和 min 函数操作时，栈中一定有元素。
    此栈包含的方法有：
    push(value):将value压入栈中
    pop():弹出栈顶元素
    top():获取栈顶元素
    min():获取栈中最小元素
    数据范围：操作数量满足 0 \le n \le 300 \0≤n≤300  ，输入的元素满足 |val| \le 10000 \∣val∣≤10000
    进阶：栈的各个操作的时间复杂度是 O(1)\O(1)  ，空间复杂度是 O(n)\O(n)*/

    public class Solution {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void push(int node) {
            stack1.push(node);
            if(stack2.isEmpty() || node <= stack2.peek()){
                stack2.push(node);
            }
        }

        public void pop() {
            if(stack1.peek().intValue() == stack2.peek().intValue()){
                stack2.pop();
            }
            stack1.pop();
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            return stack2.peek();
        }
    }

}
