public class QuickUnionUF{
	private int[] id;
	public QuickUnionUF(int N)
	{
		id = new int[N];
		for(int i = 0 ; i < N; i++){
			id[i] = i;
		}
	}
	// chase parent pointers until we reach the root
	// depth of i array accesses
	private int root(int i)
	{
		while (i != id[i]) i = id[i];
		return i;
	}
	// check if both have same parent root
	public boolean connected(int p, int q)
	{
		return root(p) == root(q);
	}
	// change root of p to point to root of q
	// depth of p and q accesses
	public void union(int p, int q)
	{
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}