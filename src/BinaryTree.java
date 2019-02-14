class Node{
	int data;
	Node left, right;
	public Node(int item){
		data=item;
		left=right=null;
	}
}
public class BinaryTree {
//	Node root;
//	BinaryTree(int data){
//		root= new Node(data);
//	}
//	BinaryTree(){ 
//		root= null;
//	}
	static Node head;
	Node insert(Node node, int data) {
		if(node==null) {
			return (new Node(data));
		}
		else {
			if(data<=node.data) {
				node.left=insert(node.left,data);
			} else {
				node.right=insert(node.right,data);
			}
		}
		return node;
	}
	int minValue(Node node) {
		Node current= node;
		while(current.left!=null) {
			current=current.left;
		}
		return current.data;
	}
	int maxValue(Node node) {
		Node current=node;
		while(current.right!=null) {
			current=current.right;
		}
		return current.data;
	}
	public Node levelOrderTraversal(Node node) {
		Node current=node;
		Node LeftNode=null;
		Node RightNode=null;
		while(current!=null) {
			LeftNode=current.left;
			RightNode=current.right;
		}
	}
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree();
//		tree.root=new Node(100);
//		tree.root.left=new Node(30);
//		tree.root.right= new Node(70);
//		tree.root.left.left=new Node(10);
//		tree.root.left.right=new Node(40);
//		tree.root.right.left=new Node(60);
//		tree.root.right.right= new Node(80);
//		System.out.println("Implemented Binary Tree");
		Node root=null;
		root=tree.insert(root,4);
		tree.insert(root,9);
		tree.insert(root,11);
		tree.insert(root,5);
		tree.insert(root,1);
		tree.insert(root,2);
		System.out.println("minimum value of BST is " +tree.minValue(root));
		System.out.println("maximum value of BST is "+tree.maxValue(root));
		System.out.println("tree "+tree);
	}

}
