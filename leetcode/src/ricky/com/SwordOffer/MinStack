package ricky.com.SwordOffer;

import java.util.Stack;

public class MinStack {
    /*剑指 Offer 30. 包含min函数的栈
    定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop
    的时间复杂度都是 O(1)。*/
    class MinStack1 {

        /** initialize your data structure here. */
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public MinStack1() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
            if(stack2.isEmpty() || x <= stack2.peek()){
                stack2.push(x);
            }
        }

        public void pop() {
            if(stack1.peek().equals(stack2.peek())){
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
