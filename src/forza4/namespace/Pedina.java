package forza4.namespace;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class Pedina extends View{

	private ShapeDrawable palla;
	
	public Pedina(Context context,int POSx,int POSy, int raggio, int gio) {
		super(context);
		palla= new ShapeDrawable(new OvalShape());
		if(gio==1)
			palla.getPaint().setColor(Color.GREEN);
		else if(gio==2)
			palla.getPaint().setColor(Color.YELLOW);
		palla.setBounds(POSx, POSy, POSx+raggio, POSy+raggio);
		
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		palla.draw(canvas);
	}
}
