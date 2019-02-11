class Node{
	int key;
	Node left, right;
	public Node(int item){
		key=item;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(int key){
		root= new Node(key);
	}
	BinaryTree(){
		root= null;
	}
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree();
		tree.root=new Node(100);
		tree.root.left=new Node(30);
		tree.root.right= new Node(70);
		tree.root.left.left=new Node(10);
		tree.root.left.right=new Node(40);
		tree.root.right.left=new Node(60);
		tree.root.right.right= new Node(80);
		System.out.println("Implemented Binary Tree");
	}

}
