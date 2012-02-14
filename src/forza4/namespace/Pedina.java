package forza4.namespace;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class Pedina extends View{

	private ShapeDrawable palla;
	
	public Pedina(Context context,int POSx,int POSy, int raggio) {
		super(context);
		palla= new ShapeDrawable(new OvalShape());
		palla.getPaint().setColor(Color.GREEN);			//deve cambiare in base al giocatore
		palla.setBounds(POSx, POSy, POSx+raggio, POSy+raggio);
		
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		palla.draw(canvas);
	}
}
