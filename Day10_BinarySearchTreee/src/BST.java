
public class BST {
	Node root;

	public BST() {

		this.root = null;
	}

	public void insert(int data) {

		if (root == null) {
			root = new Node(data);
		} else
			insert(data, root);
	}

	private void insert(int data, Node currentNode) {

		if (data < currentNode.getData()) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(new Node(data));
				return;
			}
			insert(data, currentNode.getLeft());
		} else {
			if (data > currentNode.getData()) {
				if (currentNode.getRight() == null) {
					currentNode.setRight(new Node(data));
					return;
				}
				insert(data, currentNode.getRight());
			}
		}

	}
	public void delete(int value)
	{
		deleteValue(value,root);
		
	}
	private Node deleteValue(int value,Node currentRoot)
	{
		if(currentRoot==null)
		{
			return null;
		}
		else if(value < currentRoot.getData())
		{
			currentRoot.left=deleteValue(value, currentRoot.getLeft());
		}
		else if(value > currentRoot.getData())
		{
			currentRoot.right=deleteValue(value, currentRoot.getRight());
		}
		else
		{
			if(currentRoot.getLeft()==null && currentRoot.getRight()==null)
			{
				return null;
			}
			else if(currentRoot.getLeft()==null)
			{
				return currentRoot.getRight();
			}
			else if(currentRoot.getRight()==null)
			{
				return currentRoot.getLeft();
			}
			else
			{
				Node temp=max(currentRoot.getLeft());
				currentRoot.setData(temp.getData());
				currentRoot.left=deleteValue(temp.getData(), currentRoot.getLeft());
				
			}
		}
		return currentRoot;
	}
	private Node  max(Node curNode)
	{
		Node trav=curNode;
		if(curNode != null)
		{
		
			while(trav.getRight() !=null)
			{
				trav=trav.getRight();
			}
		}
		return trav;
	}
	public Node BinarySearch(int value) {
		Node currentnode = BinarySearch(value, root);
		return currentnode;
	}

	public Node BinarySearch(int key, Node currentRoot) {

		if(currentRoot != null) {
			if (currentRoot.getData() == key)
				return currentRoot;
			if (key < currentRoot.getData())
				return currentRoot = BinarySearch(key, currentRoot.getLeft());
			else
				return currentRoot = BinarySearch(key,  currentRoot.getRight());
		}
		return null;

	}

	public void getSmallerValue() {

		System.out.println();
		if (root != null) {
			Node trav = root;
			while(trav.getLeft() !=null)
			{
				
				trav = trav.getLeft();
			
			}
			System.out.println("smallest value in BST is :" + trav.getData());

		} else {
			System.out.println("BST is empty!!");
		}

	}

	public void getLargestValue() {
		System.out.println();
		if(root != null) {
			Node trav=root;
			while(trav.getRight() !=null)
			{
				trav=trav.getRight();
			}
			System.out.println("Largest value in BST is :"+trav.getData());
		}
		else
		{
			System.out.println("BST is empty!!");
		}
		
	}

	/*
	 * public void printToPath(int value) { String str = printToPath(value,root);
	 * if(str !=null) { System.out.print(str); } System.out.println(); } private
	 * String printToPath(int value, Node currentRoot) { String str=" ";
	 * if(currentRoot !=null) { str= str+currentRoot.getData()+"\t"; if(value ==
	 * currentRoot.getData()) {
	 * 
	 * return str; } else if(value > currentRoot.getData()) return
	 * printToPath(value, currentRoot.getRight()); else return printToPath(value,
	 * currentRoot.getLeft());
	 * 
	 * } return null; }
	 */
	public void inorder() {
		inorder(root);
	}

	private void inorder(Node currentRoot) {

		if (currentRoot != null) {

			inorder(currentRoot.getLeft());
			System.out.print(currentRoot.getData() + "\t");
			inorder(currentRoot.getRight());
		}
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node currentRoot) {
		if (currentRoot != null) {
			System.out.print(currentRoot.getData() + "\t");
			preorder(currentRoot.getLeft());
			preorder(currentRoot.getRight());
		}
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node CurrentRoot) {
		if (CurrentRoot != null) {
			postorder(CurrentRoot.getLeft());
			postorder(CurrentRoot.getRight());
			System.out.print(CurrentRoot.getData() + "\t");
		}
	}

	
	
	

}
