
public class DoublyLinkedListImplementation {
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			this.data=d;
			next=null;
			prev=null;
		}
	}
	public static void insertFront(DoublyLinkedListImplementation list,int data) {
		System.out.println("Add Node in front");
		Node new_node=new Node(data);
		Node start=list.head;
		new_node.next=list.head;
		new_node.prev=null;
		if(start!=null) {
			start.prev=new_node;
		}
		list.head=new_node;
	}
	public static void insertAfterGivenNode(Node prev_node,int data) {
		Node new_node=new Node(data);
		if(prev_node!=null) {
			Node next_node=prev_node.next;
			new_node.next=next_node;
			prev_node.next=new_node;
			new_node.prev=prev_node;
			next_node.prev=new_node;
		}
		System.out.println("insert After the Giver Node");
	}
	public static void deleteNodeFromPosition(DoublyLinkedListImplementation list, int pos, int data) {
		Node start=list.head;
		Node currNode=start;
		Node prev_Node=null;
		int i=1;
		while(i!=pos) {
			prev_Node=currNode;
			currNode=currNode.next;
			i++;
		}
		Node temp_Node=currNode.next;
		prev_Node.next=temp_Node;
		temp_Node.prev=prev_Node;
	}
	public static void deleteNode(DoublyLinkedListImplementation list,int data) {
		Node start=list.head;
		Node currNode=start;
		Node prev_Node=null;
		while(currNode.data!=data && currNode.next!=null) {
			prev_Node=currNode;
			currNode=currNode.next;
		}
		if(currNode.data==data && currNode.next!=null){
			Node next_Node=currNode.next;
			prev_Node.next=next_Node;
			next_Node.prev=prev_Node;
			System.out.println("Node found And Deleted");
		}
		if(currNode.next==null) {
			System.out.println("Node not found");
		}
	}
	public static void printList(DoublyLinkedListImplementation list) {
		Node start=list.head;
		Node currNode=start;
		System.out.println("Doubly Linked List");
		while(currNode.next!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.println(currNode.data);
		
		System.out.println("Reverse Traversing");
		while(currNode.prev!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.prev;
		}
		System.out.println(currNode.data);
	}
	public static void main(String[] args) {
		DoublyLinkedListImplementation list =new DoublyLinkedListImplementation();
		list.insertFront(list, 1);
		list.insertFront(list, 2);
		list.insertFront(list, 3);
		list.insertFront(list, 4);
		list.insertFront(list, 7);
		list.insertFront(list, 8);
		list.insertFront(list, 9);
		printList(list);
		deleteNode(list, 2);
		printList(list);
		Node node=new Node(5);
		insertAfterGivenNode(node, 6);
	}

}
