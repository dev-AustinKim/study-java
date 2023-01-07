package array;

public class ArrayTree {
	private Object[] aTree;
	private int index;
	public ArrayTree(int TreeSize)
	{
		aTree = new Object[TreeSize];
		index = 1;
	}
	public void makeBT(Object data)
	{
		if(this.index > aTree.length)
		{
			System.out.println("TreeSize Over");
			return;
		}
		aTree[index++] = data;
	}
	public void preorder(int index)
	{
		if(aTree[index] != null)
		{
			System.out.print(aTree[index] + "\t");
			preorder(index*2);
			preorder(index*2+1);
		}
	}
	public void inorder(int index)
	{
		if(aTree[index] != null)
		{
			inorder(index*2);
			System.out.print(aTree[index] + "\t");
			inorder(index*2+1);
		}
	}
	public void postorder(int index)
	{
		if(aTree[index] != null)
		{
			postorder(index*2);
			postorder(index*2+1);
			System.out.print(aTree[index] + "\t");
		}
	}
}

