package org.singlyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Lists {

    public static void main(String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.create(2);
        list1.insertAtLast(4);
        list1.insertAtLast(5);
        list1.insertAtLast(6);

        SinglyLinkedListNode lastNode =list1.getLastNode();


        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.create(9);
        list2.insertAtLast(65);
        list2.insertAtLast(57);
        list2.insertAtLast(66);

        lastNode.next = list2.head;


        System.out.print("List1 = ");
        list1.displayLinkedList();

        System.out.print("List2 = ");
        list2.displayLinkedList();

        System.out.print("Intersection With Time Complexity = ");
        SinglyLinkedListNode intersectionNode = intersectionOf2ListWithOn2TimeComplexity(list1,list2);
        System.out.println(intersectionNode.val);

        System.out.print("Intersection With Space Complexity = ");
        SinglyLinkedListNode intersectionNode1 = intersectionOf2ListWithOnSpaceComplexity(list1,list2);
        System.out.println(intersectionNode1.val);
    }

    public static SinglyLinkedListNode intersectionOf2ListWithOn2TimeComplexity(SinglyLinkedList list1, SinglyLinkedList list2){

        SinglyLinkedListNode list1Head = list1.head;
        while (list1Head != null){
            SinglyLinkedListNode list2Head = list2.head;
            while (list2Head != null){

                if(list2Head == list1Head){
                    return list2Head;
                }

                list2Head = list2Head.next;
            }
            list1Head = list1Head.next;
        }

        return null;
    }

    public static SinglyLinkedListNode intersectionOf2ListWithOnSpaceComplexity(SinglyLinkedList list1, SinglyLinkedList list2){

        Set<SinglyLinkedListNode> elements = new HashSet<>();

        SinglyLinkedListNode list1Head = list1.head;
        while (list1Head != null){
            elements.add(list1Head);
            list1Head = list1Head.next;
        }

        SinglyLinkedListNode list2Head = list2.head;
        while (list2Head != null){
            if (!elements.add(list2Head)){
                return list2Head;
            }
            list2Head= list2Head.next;
        }
        return null;
    }



}
