package com.practice;

public class LinkedLists {
	Node head;

	public static void main(String[] args) {
		LinkedLists llist = new LinkedLists();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		llist.head.next = second;
		second.next = third;
		System.out.print("Linked list : ");
		llist.printList();
		System.out.print("Added 4 in front of Linked list : ");
		llist.addNodeInFront(4);
		llist.printList();
		System.out.print("Insert 5 after node in Linked list : ");
		llist.insertAfter(llist.head.next.next,5);
		llist.printList();
		System.out.print("insert at end of Linked list : ");
		llist.insertAtEnd(6);
		llist.printList();
		System.out.print("delete node with key 2 : ");
		llist.deleteNodeWithKey(2);
		llist.printList();
		System.out.print("delete node at position 2 : ");		
		llist.deleteNodeAtPosition(2);
		llist.printList();
		System.out.println("linked list length : "+llist.getLength());
		System.out.println("linked list length using recursion : "+llist.getLengthUsingRecursion(llist.head));
		System.out.println("Is 4 present : "+llist.search(llist.head, 4));
		System.out.println("Is 4 present(Using recursion) : "+llist.searchUsingRecursion(llist.head, 4));
		System.out.println("Adding 6 in front : ");
		llist.addNodeInFront(6);
		llist.printList();
		System.out.println("Number of times 6 occurs in linked list : "+llist.getCountOfNumberInLinkedList(6));
		llist.swapNodes(4, 3);
		llist.printList();
		System.out.println("Deleting node");
		llist.deleteNode(second);
		llist.printList();
		System.out.println("done");
		try{
		System.out.println("Get node at index 3 :" + llist.getNth(llist.head, 4));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Middle node :"+llist.getMiddleNode(llist.head));
		LinkedLists llist1 = new LinkedLists();
		llist1.head = new Node(3);
		Node second1 = new Node(5);
		Node third1 = new Node(4);
		Node four = new Node(2);
		llist1.head.next = second1;
		second1.next = third1;
		third1.next=four;
		//four.next=llist1.head;
		//four.next=second1;
//		llist1.printList();
//		llist1.InsertNth(10,1);
//		llist1.printList();
//	
		System.out.println(llist1.hasCycle());

	}
	
	public void deleteNode(Node node) {
		if (node == null) return;

        node.data = node.next.data;
        node.next = node.next.next;
    }

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();		
	}
	
	public void addNodeInFront(int data){
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	
	/*
	  Insert Node at a given position in a linked list 
	  head can be NULL 
	  First element in the linked list is at position 0
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	
	public boolean hasCycle() {
		 Node slowptr=head;
	     Node fastptr=head.next;
	        while(fastptr!=null && fastptr.next!=null){
	            if(slowptr==fastptr){
	                return true;
	            }
	            else{                
	                slowptr=slowptr.next;
	                fastptr=fastptr.next.next;
	                
	            }
	        }
	        return false;
	        }
	    

	public void InsertNth(int data, int position) {
	   // This is a "method-only" submission. 
	    // You only need to complete this method.
	    int pos=0;
	    Node node=head;
	    while(pos!=(position-1)){
	        
	        node=node.next;
	        pos++;
	                 
	    }
	    Node newNode=new Node(data);
	    newNode.next=node.next;
	    node.next=newNode;
	}

	
	public void insertAfter(Node prevNode, int data){
		if(prevNode!=null){
		Node newNode= new Node(data);
		newNode.next=prevNode.next;
		prevNode.next=newNode;
		}
		else{
			System.out.println("Prev node is null");
		}
	}
	
	public void insertAtEnd(int newData){
		Node n =new Node(newData);
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=n;
	}
	
	public void deleteNodeWithKey(int key){
		Node temp=head , prev=null;
		if(temp!=null && temp.data==key){
			head=temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null) return;
		prev.next=temp.next;
	}
	
	public void deleteNodeAtPosition(int position){
		if(head==null)return;
		Node temp=head;
		
		if(position==0){
			head=temp.next;
			return;
		}
		
		for(int i=0;i<position-1;i++){
			temp=temp.next;
		}
		if(temp==null || temp.next==null)
			return;
		
		Node nodeToBeDeleted=temp.next;
		temp.next=nodeToBeDeleted.next;
	}
	
	public int getLength(){
		Node current=head;
		int length=0;
		while(current!=null){
			current=current.next;
			length++;
		}
		return length;
	}
	
	public int getLengthUsingRecursion(Node head){
		//Node current=currentHead;
		if(head==null)return 0;
		else return 1+getLengthUsingRecursion(head.next);
			
	}
	public boolean search(Node head,int key){
		Node current=head;
		while(current!=null){
			if(current.data==key)
				return true;
			current=current.next;
		}
		return false;
	}
	
	public boolean searchUsingRecursion(Node head,int key){
		if(head==null)return false;
		if(head.data==key)return true;
		else return searchUsingRecursion(head.next,key);
	}
	
	public int getCountOfNumberInLinkedList(int number){
		Node current=head;
		int count=0;
		while(current!=null){
			if(current.data==number)
				count++;
			current=current.next;
		}
		return count;
	}
	
	public void swapNodes(int x, int y){
		Node prev=head;
		Node current=head.next;
		Node nodeX = null, nodeY=null ,prevX=null,prevY=null;
		while(current!=null){
			
			if(current.data==x){
				prevX=prev;
				nodeX=current;
			}
			if(current.data==y){
				prevY=prev;
				nodeY=current;
			}
			prev=prev.next;
			current=current.next;
		}
		if(nodeX!=null && nodeY!=null){
			if(prevX!=null){
				prevX.next=nodeY;
			}
			else{
				head=nodeY;
			}
			if(prevY!=null){
				prevY.next=nodeX;
			}
			else{
				head=nodeX;
			}			
			Node temp = nodeX.next;
			nodeX.next = nodeY.next;
			nodeY.next = temp;
			
		}
		else{
			System.out.println("No node found with x and y as data");
		}
	}
	
	public int getNth(Node head,int index){
		Node curr=head;
		for(int i=0;i<index;i++){			
			curr=curr.next;
			if(curr==null){
				throw new IllegalArgumentException("no such index");
			}
		}
		return curr.data;		
	}
	
	public int getMiddleNode(Node head){
		Node pntr1=head;
		Node pntr2=head;
		while(pntr2!=null && pntr2.next!=null){
			pntr2=pntr2.next.next;
			pntr1=pntr1.next;
		}
		return pntr1.data;
	}

}
