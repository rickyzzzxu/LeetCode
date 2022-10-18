package com.ricky.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {

        /*HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3 = new HeroNode(3,"林冲","豹子头");
        HeroNode hero4 = new HeroNode(4,"吴用","智多星");*/


        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "林冲", "豹子头");
        HeroNode hero4 = new HeroNode(4, "吴用", "智多星");
        HeroNode hero6 = new HeroNode(2, "卢俊义", "玉麒麟222");
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addByOrder(hero1);
        linkedList.addByOrder(hero4);
        linkedList.addByOrder(hero2);
        linkedList.addByOrder(hero3);
        linkedList.list();


        System.out.println("删除后：");
        linkedList.delete(3);
        //System.out.println("新数据：");
        //linkedList.update(hero6);
        linkedList.list();
        System.out.println("长度为：" + getLength(linkedList.getHead()));


        HeroNode node = FindLastIndex(linkedList.getHead(), 3);
        System.out.println("倒数节点为：" + node);

    }

    public static int getLength(HeroNode heroNode) {

        HeroNode temp = heroNode;
        int sum = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            sum++;
            temp = temp.next;
        }
        return sum;

    }

    public static HeroNode FindLastIndex(HeroNode heroNode, int index) {
        int length = getLength(heroNode);
        HeroNode temp = heroNode;
        if (temp.next == null) {
            throw new RuntimeException("链表为空");
        }
        if (index > length || index <= 0) {
            throw new RuntimeException("输入数据不合理");
        }
        for (int i = 0; i <= length - index; i++) {
            temp = temp.next;
        }
        return temp;
    }


}

class HeroNode {
    public String name;
    public String nickName;
    public int num;
    public HeroNode next;

    public HeroNode(int num, String name, String nickName) {
        this.num = num;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", num=" + num +
                '}';
    }
}

class SingleLinkedList {

    HeroNode head = new HeroNode(0, "", "");


    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = heroNode;
                break;
            }
            temp = temp.next;
        }
    }

    public HeroNode getHead() {
        return head;
    }

    public void list() {
        HeroNode temp = head;
        if (temp.next == null) {
            System.out.println("链表为空");
            return;
        }
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            temp = temp.next;
        }

    }

    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.num > heroNode.num) {
                break;
            }
            if (temp.next.num == heroNode.num) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag) {
            System.out.println("编号已存在");
            return;
        }
        heroNode.next = temp.next;
        temp.next = heroNode;
    }

    public void update(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.num == heroNode.num) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag) {
            temp.next.name = heroNode.name;
            temp.next.nickName = heroNode.nickName;
            return;
        }
        System.out.println("编号不存在");
    }

    public void delete(int num) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.num == num) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("编号不存在");
        }
    }

}
