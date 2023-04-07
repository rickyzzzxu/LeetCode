package ricky.com.demo;

import java.util.HashMap;
import java.util.List;

class LRUCache {

    HashMap<Integer, Node> map;
    DoubleLinkedList linkedList;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        linkedList = new DoubleLinkedList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            linkedList.delete(map.get(key));
            linkedList.addFirst(map.get(key));
            return map.get(key).value;
        }
    }

    public void put(int key, int value) {
        Node newNode = new Node(key, value);
        if (map.containsKey(key)) {
            linkedList.delete(map.get(key));
            linkedList.addFirst(newNode);
            map.put(key, newNode);
        } else {
            if (map.size() == capacity) {
                int k = linkedList.deleteLast();
                map.remove(k);

            }
            linkedList.addFirst(newNode);
            map.put(key, newNode);
        }
    }
}

class Node {
    int key;
    int value;
    Node pre;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class DoubleLinkedList {
    Node tail;
    Node head;

    public DoubleLinkedList() {
        tail = new Node(-1, -1);
        head = new Node(-1, -1);
        head.next = tail;
        tail.pre = head;
    }

    public void addFirst(Node node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    public int delete(Node node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
        return node.key;
    }

    public int deleteLast() {
        return delete(tail.pre);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */