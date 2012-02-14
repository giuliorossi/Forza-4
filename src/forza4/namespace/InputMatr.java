package forza4.namespace;

public class InputMatr {
	
	public static int[][] inputMatr(int matr[][], int col)
	{
		for(int i=5;i>=0; i--)
		{
			if(matr[i][col]==0)
			{
				matr[i][col]=1;			//deve cambiare in base al giocatore
				break;
			}
		}
		return matr;
	}
	
	public static int getCol(int touchx, int raggio)
	{
		int col=0;
		if(0<=touchx&&touchx<raggio)
				col=0;
			else if (raggio<=touchx&&touchx<2*raggio)
				col=1;
			else if (2*raggio<=touchx&&touchx<3*raggio)
				col=2;
			else if (3*raggio<=touchx&&touchx<4*raggio)
				col=3;
			else if (4*raggio<=touchx&&touchx<5*raggio)
				col=4;
			else if (5*raggio<=touchx&&touchx<6*raggio)
				col=5;
			else if (6*raggio<=touchx)
				col=6;
		return col;
	}

}
