package forza4.namespace;


import android.app.Activity;
import android.os.Bundle;
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
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
        			touchx=(int)event.getX();
        			//Log.d("touchx", Integer.toString(touchx));
        			col=InputMatr.getCol(touchx, raggio);
        			//Log.d("Colonna sel.", Integer.toString(col));
        			matr=InputMatr.inputMatr(matr,col);
           			PrintG.printG(matr, raggio, Forza4Activity.this, griglia);
        		}
        			break;
        		}
        		return true;
        		
   			}
       });
       
       
	}
}