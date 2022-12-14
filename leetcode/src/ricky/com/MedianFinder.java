package ricky.com;

import java.util.PriorityQueue;

public class MedianFinder {
    /*如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
    如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。*/
    class MedianFinderr {

        /** initialize your data structure here. */
        PriorityQueue<Integer> min;
        PriorityQueue<Integer> max;
        public MedianFinderr() {
            min = new PriorityQueue<>();
            max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        }

        public void addNum(int num) {
            if(min.size() == max.size()){
                min.add(num);
                max.add(min.poll());
            }else{
                max.add(num);
                min.add(max.poll());
            }
        }

        public double findMedian() {
            if(min.size() == max.size()){
                return (min.peek() + max.peek()) / 2.0;
            }else{
                return 1.0 * max.peek();
            }
        }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
