package com.github.EpochFeng.leetcode100;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 冯纪元
 * @ClassName NumberTwentyNine
 * @description: TODO
 * @datetime 2026年 05月 30日 15:01
 * @version: 1.0
 */
public class NumberTwentyNine {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (ListNode list : lists) {
            if (list!=null) queue.add(list);
        }
        ListNode listNode = new ListNode();
        ListNode pre = listNode;
        while (!queue.isEmpty()){
            ListNode poll = queue.poll();
            pre.next = poll;
            if (poll.next!=null) queue.add(poll.next);
            pre = pre.next;
        }
        return listNode.next;
    }
    public ListNode mergeKLists1(ListNode[] lists,int left,int right) {
         if (lists.length==0){
             return null;
         }
         if (left==right){
             return lists[left];
         }
        int i = (left+right)/ 2;
        ListNode listNode = mergeKLists1(lists, left, i);
        ListNode listNode1 = mergeKLists1(lists, i + 1, right);
        ListNode merger = merger(listNode, listNode1);
        return merger;
    }
    public ListNode merger(ListNode head1,ListNode head2) {
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        if (head1.val<head2.val){
         head1.next =   merger(head1.next,head2);
         return head1;
        }else {
         head2.next =   merger(head1, head2.next);
         return head2;
        }
    }
}
