package forza4.namespace;

public class InputMatr {
	
	public static int[][] inputMatr(int matr[][], int col)
	{
		for(int i=6;i>0; i--)
		{
			if(matr[i][col]==0)
			{
				matr[i][col]=1;
				break;
			}
		}
		return matr;
	}

}
