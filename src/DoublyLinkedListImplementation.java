
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
		if(start.prev!=null) {
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
	
	public static void main(String[] args) {

	}

}
