/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
---------------------------------------------------------------------------------
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
---------------------------------------------------------------------------------------
Input: l1 = [0], l2 = [0]
Output: [0]
--------------------------------------------------------------------------------------
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
------------------------------------------------------------------------------------------
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.io.*;
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1="";
        String s2="";
        while(l1!=null)
        {
            s1=l1.val+s1;
            l1=l1.next;
        }
        while(l2!=null)
        {
            s2=l2.val+s2;
            l2=l2.next;
        }
        BigInteger num1= new BigInteger(s1);
        BigInteger num2= new BigInteger(s2);
        // long num1=convert(s1);
        // long num2=convert(s2);
        BigInteger sum=num1.add(num2);
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println(s1);
        System.out.println(s2);
        String str1=sum.toString(10);
        System.out.println(sum);
        ListNode head=null,temp=null;
        for(int i=str1.length()-1;i>=0;i--)
        {
            int v=str1.charAt(i)-'0';
            ListNode newNode=new ListNode(v);
            if(head==null)
            {
                head=newNode;
                temp=head;
            }
            else
            {
                temp.next=newNode;
                temp=temp.next;
            }
        }
        return head;
    }
    // public long convert(String s)
    // {
    //    long num=0;
    //      try
    //     { 
    //           num=Long.parseLong(s);
              
    //     }
    //      catch (NumberFormatException e) {
    //         System.out.println("Invalid String");
    //     }
    //     return  num;  
    // }
}