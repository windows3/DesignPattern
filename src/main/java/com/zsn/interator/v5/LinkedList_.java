package com.zsn.interator.v5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;
    LinkedList<Object> list = new LinkedList<Object>();

    //目前容器中有多少个元素
    private int size = 0;

    public void add(Object o) {
        Node n = new Node(o);
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
        }

        tail.next = n;
        tail = n;
//        map.put(String.valueOf(size), n.getO());
        list.add(n);
        size++;

    }

    private class Node {
        private Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }

        public Object getO() {
            return o;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {

        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator_ {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= size) return false;
            return true;
        }

        @Override
        public Object next() {
            Node n = (Node) list.get(currentIndex);
            Object o = n.getO();
            currentIndex++;
            return o;
        }
    }
}
