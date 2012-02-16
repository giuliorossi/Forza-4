package forza4.namespace;


import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Forza4Activity extends Activity {
    /** Called when the activity is first created. */
	Pedina ped;
	int winX, winY, y, col, touchx, raggio;
	int matr[][];					//=new int [6][7];
	FrameLayout griglia;
	boolean gio,win;
	
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        win=false;					//
        matr=  new int [6][7];		//
        griglia = (FrameLayout)findViewById(R.id.frameLayout1);
        winX = getWindowManager().getDefaultDisplay().getWidth();
        winY = getWindowManager().getDefaultDisplay().getHeight();
        if(winX/7>winY/6)
        	raggio=(int)winY/6;
        else
        	raggio=winX/7;
        //Log.d("raggio", Integer.toString(raggio));
        griglia.setOnTouchListener(new OnTouchListener()
        {
        	public boolean onTouch(View v, MotionEvent event)
   			{
        		int eventaction = event.getAction();
        		switch (eventaction)
        		{
        		case MotionEvent.ACTION_UP:
        		{
        			if(!win)
        			{
        				touchx=(int)event.getX();
            			//Log.d("touchx", Integer.toString(touchx));
            			col=InputMatr.getCol(touchx, raggio);
            			//Log.d("Colonna sel.", Integer.toString(col));
            			if (matr[0][col]==0)
            				gio=!gio;
            			matr=InputMatr.inputMatr(matr,col,gio);
               			PrintG.printG(matr, raggio, Forza4Activity.this, griglia);
               			win=CheckWin.checkWin(matr, Forza4Activity.this);
        			}
        			else
        				Toast.makeText(Forza4Activity.this, "Hanno vinto", Toast.LENGTH_SHORT).show();
        		}
        			break;
        		}
        		return true;
        		
   			}
       });
       
       
	}
}