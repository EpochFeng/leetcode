package com.github.EpochFeng.leetcode100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 冯纪元
 * @ClassName LRUCache
 * @description: TODO
 * @datetime 2026年 05月 31日 20:34
 * @version: 1.0
 */
public class LRUCache {
    public class ListNode {
        int key;
        int value;
       ListNode next;
       ListNode pre;

        ListNode() {
        }

        ListNode(int key,int value) {
            this.key = key;
            this.value = value;
        }

        ListNode(int key,int value, ListNode next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    Map<Integer, ListNode> map;
    ListNode tail = new ListNode();
    ListNode head = new ListNode();
    Integer capacity;
    Integer used;


    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
        used = 0;
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        ListNode listNode = map.get(key);
        if (listNode==null){
            return -1;
        }else {
            remove(listNode);
            addList(listNode);
            return listNode.value;
        }
    }

    public void put(int key, int value) {
        ListNode listNode = map.get(key);
        if (listNode==null){
            used++;
            if (used>capacity){
                ListNode listNode1 = removeLast();
                map.remove(listNode1.key);
                listNode = new ListNode(key,value);
                map.put(key,listNode);
                addList(listNode);
                used--;
            }else {
                listNode = new ListNode(key,value);
                map.put(key,listNode);
                addList(listNode);
            }
        }else {
            remove(listNode);
            listNode.value = value;
            map.put(key,listNode);
            addList(listNode);
        }
    }
    public void remove(ListNode listNode){
        listNode.pre.next = listNode.next;
        listNode.next.pre = listNode.pre;
    }
    public void addList(ListNode newNode){
        newNode.next = head.next;
        head.next.pre = newNode;
        head.next = newNode;
        newNode.pre = head;
    }
    public ListNode removeLast(){
        ListNode pre = tail.pre;
        remove(pre);
        return pre;
    }
}
