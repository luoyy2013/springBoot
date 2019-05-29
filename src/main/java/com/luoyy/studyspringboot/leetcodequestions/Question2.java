package com.luoyy.studyspringboot.leetcodequestions;

/**
 *
 * 您将获得两个非空链表，表示两个非负整数。数字以相反的顺序存储，每个节点包含一个数字。添加两个数字并将其作为链接列表返回。

 您可以假设这两个数字不包含任何前导零，除了数字0本身。

 例：

 输入：（2  - > 4  - > 3）+（5  - > 6  - > 4）
 输出： 7  - > 0  - > 8
 说明： 342 + 465 = 807。
 * @author luosir
 * @date 2019/04/24
 */
public class Question2 {
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next = l1.next;
        while (next != null) {
            next = next.next;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(1),new ListNode(2)));
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}