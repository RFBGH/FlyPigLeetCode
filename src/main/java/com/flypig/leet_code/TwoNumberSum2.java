package com.flypig.leet_code;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TwoNumberSum2 {

   public static class ListNode {
       int val;
       ListNode next;

       ListNode(int x) {
           val = x;
       }
   }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       ListNode num1 = l1;
       ListNode num2 = l2;

       List<Integer> result = new LinkedList<Integer>();

       int carry = 0;
       while(num1 != null && num2 != null){

           int sum = num1.val + num2.val + carry;
           if(sum != 0){
               carry = sum / 10;
           }else{
               carry = 0;
           }
           sum = sum % 10;

           result.add(sum);

           num1 = num1.next;
           num2 = num2.next;
       }

       while(num1 != null){

           int sum = num1.val + carry;
           if(sum != 0){
               carry = sum / 10;
           }else{
               carry = 0;
           }
           sum = sum % 10;
           result.add(sum);

           num1 = num1.next;
       }

       while (num2 != null){

           int sum = num2.val + carry;
           if(sum != 0){
               carry = sum / 10;
           }else{
               carry = 0;
           }
           sum = sum % 10;
           result.add(sum);

           num2 = num2.next;
       }

       while (carry != 0){
           result.add(carry%10);
           carry /= 10;
       }

       ListNode resultNode = null;
       ListNode currNode = null;
       for(int i : result){

           ListNode newNode = new ListNode(i);
           if(resultNode == null){
               resultNode = newNode;
           }else{
               currNode.next = newNode;
           }
           currNode = newNode;
       }

        return resultNode;
   }


    public static void main(String[] args){
        System.out.println("hello world");

//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        ListNode result = addTwoNumbers(l1, l2);

        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
   }
}
