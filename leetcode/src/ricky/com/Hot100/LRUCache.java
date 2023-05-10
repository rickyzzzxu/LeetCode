package ricky.com.Hot100;

import java.util.HashMap;

/**
 * @Author xdg
 * @Date 2023/4/5 17:46
 */
public class LRUCache {
    /*146. LRU 缓存
    请你设计并实现一个满足  LRU (最近最少使用) 缓存 约束的数据结构。
    实现 LRUCache 类：
    LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
    int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
    void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；
    如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，
    则应该 逐出 最久未使用的关键字。
    函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。*/
    DoubleLinkedList linkedList;
    HashMap<Integer, Node> map;
    int capacity;

    public LRUCache(int capacity) {
        linkedList = new DoubleLinkedList();
        map = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            Node temp = map.get(key);
            linkedList.delete(temp);
            linkedList.addFirst(temp);
            return temp.val;
        }
    }

    public void put(int key, int value) {
        Node temp = new Node(key, value);
        if (!map.containsKey(key)) {
            //可以优化，提取公共部分
            if (map.size() >= capacity) {
                int k = linkedList.deleteLast();
                map.remove(k);
                linkedList.addFirst(temp);
                map.put(key, temp);
            } else {
                linkedList.addFirst(temp);
                map.put(key, temp);
            }
        } else {
            linkedList.delete(map.get(key));
            linkedList.addFirst(temp);
            map.put(key, temp);
        }
    }
}

class Node {
    Node pre;
    Node next;
    int key;
    int val;

    public Node(int key, int value) {
        this.key = key;
        this.val = value;
    }
}

class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.pre = head;
    }

    public void addFirst(Node node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    public int delete(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        return node.key;
    }

    public int deleteLast() {
        return delete(tail.pre);
    }
}