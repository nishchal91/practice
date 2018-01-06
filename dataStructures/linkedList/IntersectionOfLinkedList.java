package com.practice.dataStructures.linkedList;

import java.util.HashMap;

public class IntersectionOfLinkedList {

	public Node getIntersectionNode(Node headA, Node headB) {
        Node node1=headA;
        Node node2=headB;
        HashMap<Node,Integer> map=new HashMap<Node,Integer>();
        while(node1!=null){
            map.put(node1,1);
            node1=node1.next;
        }
        
        while(node2!=null){
            if(map.containsKey(node2)){
                return node2;
            }
            map.put(node2,1);
            node2=node2.next;
        }
        
        return null;
    }
	
	
	public static void main(String[] args) {
		LinkedLists llist3 = new LinkedLists();
		llist3.head = new Node(8);
		Node second3 = new Node(9);
		Node third3 = new Node(10);
		llist3.head.next = second3;
		second3.next = third3;
		System.out.print("Linked list : ");
		llist3.printList();
		
		
		LinkedLists llist = new LinkedLists();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		llist.head.next = second;
		second.next = third;
		System.out.print("Linked list : ");
		third.next=llist3.head;
		llist.printList();
		
		LinkedLists llist2 = new LinkedLists();
		llist2.head = new Node(5);
		Node second2 = new Node(6);
		Node third2 = new Node(7);
		llist2.head.next = second2;
		second2.next = third2;
		third2.next=llist3.head;
		System.out.print("Linked list : ");
		llist2.printList();
		
		IntersectionOfLinkedList intersect= new IntersectionOfLinkedList();
		Node intersection= intersect.getIntersectionNode(llist.head, llist2.head);
		System.out.println(intersection.data);
		
		
		
		
	}

}
