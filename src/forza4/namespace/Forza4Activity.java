package forza4.namespace;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;

public class Forza4Activity extends Activity {
    /** Called when the activity is first created. */
	Pedina ped;
	int winX, winY, y, col, touchx, raggio;
	int matr[][]=new int [6][7];
	FrameLayout griglia;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        griglia = (FrameLayout)findViewById(R.id.frameLayout1);
        winX = getWindowManager().getDefaultDisplay().getWidth();
        winY=getWindowManager().getDefaultDisplay().getHeight();
        if(winX/7>winY/6)
        	raggio=(int)winY/6;
        else
        	raggio=winX/7;

        griglia.setOnTouchListener(new OnTouchListener()
        {
        	public boolean onTouch(View v, MotionEvent event)
   			{
        		int eventaction = event.getAction();
        		switch (eventaction)
        		{
        		case MotionEvent.ACTION_DOWN:
        		{
        			break;
        		}
        		case MotionEvent.ACTION_UP:
        		{
        			touchx=(int)event.getX();
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
        			Log.d("Colonna sel.", Integer.toString(col));
        			inputMatr(matr, col);
           			printG(matr, raggio, Forza4Activity.this, griglia);
        		}
        			break;
        		}
        		return true;
        		
   			}
       });
       
       
	}
	public void printG (int matr[][], int raggio, Context context, FrameLayout fl)
	{
		for(int i=0; i<6; i++)
		{
			for(int k=0; k<7; k++)
			{
				if(matr[i][k]!=0)
				{
					ped=new Pedina(context, k*raggio, i*raggio, raggio);
					fl.addView(ped);
				}
			}
		}
	}
	public static int[][] inputMatr(int matr[][], int col)
	{
		for(int i=5;i>=0; i--)
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