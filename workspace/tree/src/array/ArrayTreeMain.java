package array;

public class ArrayTreeMain {
	public static void main(String [] args)
	{
		ArrayTree tree = new ArrayTree(32);
		tree.makeBT('A');
		tree.makeBT('B');
		tree.makeBT('C');
		tree.makeBT('D');
		tree.makeBT('E');
		tree.makeBT('F');
		tree.makeBT('G');
		tree.makeBT('H');
		tree.makeBT(null);
		tree.makeBT('I');
		tree.makeBT('J');
		tree.makeBT(null);
		tree.makeBT(null);
		tree.makeBT(null);
		tree.makeBT('K');
		System.out.print("pro 1");
		System.out.print("\nPreorder :\t");
		tree.preorder(1);
		System.out.print("\nInorder :\t");
		tree.inorder(1);
		System.out.print("\nPostorder :\t");
		tree.postorder(1);
	}
}
