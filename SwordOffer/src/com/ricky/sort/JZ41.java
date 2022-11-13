package com.ricky.sort;

import java.util.PriorityQueue;

public class JZ41 {
    /*数据流中的中位数
            描述
    如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中
    间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使
    用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。*/

    public class Solution {
        //小顶堆，存放较大的数
        PriorityQueue<Integer> min = new PriorityQueue<>();
        //大顶堆，存放较小的数
        PriorityQueue<Integer> max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        public void Insert(Integer num) {
            //要加入的数为第奇数个
            if(max.size() == min.size()){
                max.add(num);
                min.add(max.poll());
                //要加入的数为第偶数个
            }else{
                min.add(num);
                max.add(min.poll());
            }
        }

        public Double GetMedian() {
            if(max.size() == min.size()){
                return (min.peek() + max.peek()) / 2.0;
            }else{
                return min.peek() * 1.0;
            }
        }


    }


}
