package com.ricky.queue_stack;

public class JZ73 {
    /*翻转单词序列
    描述
    牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些
    句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来
    翻看，但却读不懂它的意思。例如，“nowcoder. a am I”。后来才意识
    到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a nowc
    oder.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
    数据范围：1 \le n \le 100 \1≤n≤100
    进阶：空间复杂度 O(n) \O(n)  ，时间复杂度 O(n) \O(n)  ，保证没
    有只包含空格的字符串*/
    public class Solution {
        public String ReverseSentence(String str) {
            str = str.trim();
            StringBuilder s = new StringBuilder();
            int i = str.length() - 1;
            int j = i;
            while(i >= 0){
                //找到倒数第一个空格
                while(i >= 0 && str.charAt(i) != ' ') i--;
                //将倒数第一个单词拼接到s上
                s.append(str.substring(i + 1, j + 1) + " ");
                //清除倒数第一个单词前连续多个空格
                while(i >= 0 && str.charAt(i) == ' ') i--;
                j = i;
            }
            return s.toString().trim();
        }
    }
}
