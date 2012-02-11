package forza4.namespace;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class Forza4Activity extends Activity
{
    LinearLayout c1;
    LinearLayout c2;
    LinearLayout c3;
    LinearLayout c4;
    LinearLayout c5;
    LinearLayout c6;
    LinearLayout c7;
    LinearLayout[][] matr;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	matr = new LinearLayout[6][7];
    	
    	matr[1][1]=(LinearLayout)findViewById(R.id.cella11);
    	matr[1][2]=(LinearLayout)findViewById(R.id.cella12);
    	matr[1][3]=(LinearLayout)findViewById(R.id.cella13);
    	matr[1][4]=(LinearLayout)findViewById(R.id.cella14);
    	matr[1][5]=(LinearLayout)findViewById(R.id.cella15);
    	matr[1][6]=(LinearLayout)findViewById(R.id.cella16);
    	matr[1][7]=(LinearLayout)findViewById(R.id.cella17);
    	
    	matr[2][1]=(LinearLayout)findViewById(R.id.cella21);
    	matr[2][2]=(LinearLayout)findViewById(R.id.cella22);
    	matr[2][3]=(LinearLayout)findViewById(R.id.cella23);
    	matr[2][4]=(LinearLayout)findViewById(R.id.cella24);
    	matr[2][5]=(LinearLayout)findViewById(R.id.cella25);
    	matr[2][6]=(LinearLayout)findViewById(R.id.cella26);
    	matr[2][7]=(LinearLayout)findViewById(R.id.cella27);
    	
    	matr[3][1]=(LinearLayout)findViewById(R.id.cella31);
    	matr[3][2]=(LinearLayout)findViewById(R.id.cella32);
    	matr[3][3]=(LinearLayout)findViewById(R.id.cella33);
    	matr[3][4]=(LinearLayout)findViewById(R.id.cella34);
    	matr[3][5]=(LinearLayout)findViewById(R.id.cella35);
    	matr[3][6]=(LinearLayout)findViewById(R.id.cella36);
    	matr[3][3]=(LinearLayout)findViewById(R.id.cella37);
    	
    	matr[4][1]=(LinearLayout)findViewById(R.id.cella41);
    	matr[4][2]=(LinearLayout)findViewById(R.id.cella42);
    	matr[4][3]=(LinearLayout)findViewById(R.id.cella43);
    	matr[4][4]=(LinearLayout)findViewById(R.id.cella44);
    	matr[4][5]=(LinearLayout)findViewById(R.id.cella45);
    	matr[4][6]=(LinearLayout)findViewById(R.id.cella46);
    	matr[4][7]=(LinearLayout)findViewById(R.id.cella47);
    	
    	matr[5][1]=(LinearLayout)findViewById(R.id.cella51);
    	matr[5][2]=(LinearLayout)findViewById(R.id.cella52);
    	matr[5][3]=(LinearLayout)findViewById(R.id.cella53);
    	matr[5][4]=(LinearLayout)findViewById(R.id.cella54);
    	matr[5][5]=(LinearLayout)findViewById(R.id.cella55);
    	matr[5][6]=(LinearLayout)findViewById(R.id.cella56);
    	matr[5][7]=(LinearLayout)findViewById(R.id.cella57);
    	
    	matr[6][1]=(LinearLayout)findViewById(R.id.cella51);
    	matr[6][2]=(LinearLayout)findViewById(R.id.cella52);
    	matr[6][3]=(LinearLayout)findViewById(R.id.cella53);
    	matr[6][4]=(LinearLayout)findViewById(R.id.cella54);
    	matr[6][5]=(LinearLayout)findViewById(R.id.cella55);
    	matr[6][6]=(LinearLayout)findViewById(R.id.cella56);
    	matr[6][7]=(LinearLayout)findViewById(R.id.cella67);
    	
    	for(int i=1; i<7; i++)
    	{
    		for(int k=1; k<8; k++)
    			matr[i][k].setBackgroundColor(Color.DKGRAY);
    	}
    	    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        c1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
    }
}