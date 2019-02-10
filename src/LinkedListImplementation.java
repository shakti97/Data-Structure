import java.util.Collections;
import java.util.List;

public class LinkedListImplementation {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	public static LinkedListImplementation insert(LinkedListImplementation list,int data) {
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(list.head==null) {
			list.head=new_node;
		}
		else {
			Node last=list.head;
			while(last.next != null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	public static LinkedListImplementation insertAtPosition(LinkedListImplementation list,int pos,int data) {
		Node currNode = list.head;
		Node newNode= new Node(data);
		Node prev=null;
		int i=1;
		while(i != pos) {
			prev=currNode;
			currNode=currNode.next;
			i++;
		}
		newNode.next=currNode;
		prev.next=newNode;
		return list;
	}
	public static LinkedListImplementation deleteNode(LinkedListImplementation list,int key){
		Node currNode = list.head;
		Node prev=null;
		
		if(currNode!=null && currNode.data==key){
			list.head = currNode.next;
			System.out.println(key+" found and delete");
			return list;
		}
		while(currNode!=null && currNode.data!=key) {
			prev=currNode;
			currNode=currNode.next;
		}
		if(currNode!=null) {
			prev.next = currNode.next;
			System.out.println(key+" found deleted ");
		}
		if(currNode==null) {
			System.out.println(key+" not found ");
		}
		return list;
	}
	public static LinkedListImplementation deleteAtPosition(LinkedListImplementation list,int index) {
		Node currNode= list.head;
		Node prev=null;
		int i=0;
		while(currNode!=null ) {
			if(i==index) {
				prev.next=currNode.next;
				System.out.println("\nposition found and deleted");
				break;
			}
			prev=currNode;
			currNode=currNode.next;
			i++;
		}
		if(currNode==null) {
			System.out.println("position not found");
		}
		return list;
	}
	@SuppressWarnings("null")
	public static LinkedListImplementation convertIntoCircularLinkedList(LinkedListImplementation list) {
		Node currNode=list.head;
		Node startNode=list.head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=startNode;
		DisplayCircularLinkedList(list);
		return list;
	}
	public static void DisplayCircularLinkedList(LinkedListImplementation list) {
		Node start=list.head;
		Node currNode=start;
		System.out.println("\nDoubly Linked List");
		while(currNode.next!=start) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.print(currNode.data);
	}
	public static void printList(LinkedListImplementation list) {
		Node currNode=list.head;
		System.out.println("Linked List ");
		
		while(currNode!=null) {
			System.out.print(currNode.data+ " ");
			currNode = currNode.next;
		}
	}
	public static void main(String[] args) {
		LinkedListImplementation list= new LinkedListImplementation();
		list.insert(list, 8);
		list.insert(list, 4);
		list.insert(list, 9);
		list.insert(list, 1);
		list.insert(list, 5);
		list.insert(list, 7);
		list.insert(list, 3);
		list.insert(list, 2);
		list.insert(list, 6);
		printList(list);
		insertAtPosition(list, 4, 10);
		printList(list);
//		convertIntoCircularLinkedList(list);
//		Collections.sort(List<T> list);
	}

}
