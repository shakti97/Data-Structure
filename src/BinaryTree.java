import java.util.logging.Level;

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
	public void inOrderTraversal(Node node) {
		if(node==null) {
			return;
		}
		else {
			inOrderTraversal(node.left);
			System.out.print(node.data+ " ");
			inOrderTraversal(node.right);
		}
	}
	public void preOrderTraversal(Node node) {
		if(node==null) {
			return;
		}
		else {
			System.out.print(node.data+" ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	int treeHeight(Node node) {
		int height;
		if(node==null) {
			return 0;
		}	
		int leftHeight=treeHeight(node.left);
		int rightHeight=treeHeight(node.right);
		if(leftHeight>rightHeight) {
			height=leftHeight+1;
		}else {
			height=rightHeight+1;
		}
		return height;
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
		System.out.println("height "+tree.treeHeight(root));
		System.out.println("Inorder Traversal");
		tree.inOrderTraversal(root);
		System.out.println("\n PreOrder Traversal");
		tree.preOrderTraversal(root);
		System.out.println("\ntree "+tree);
	}

}
