package nl.spookystoriesinc.view;

import java.util.Observable;
import java.util.Observer;
import nl.spookystoriesinc.spookystories.R;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

public class InventoryViewTile extends View implements Observer {

	
	InventoryViewTile view;
	
	public InventoryViewTile(Context context) {
		super(context);
			init();
			
		
		// TODO Auto-generated constructor stub
	}
	
	public InventoryViewTile(Context context, AttributeSet attrs) {
		super(context, attrs);
			init();
			
		
		// TODO Auto-generated constructor stub
	}
	
	public InventoryViewTile(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
			init();
			
		
		// TODO Auto-generated constructor stub
	}
	
	public void init(){
		
		if(!isInEditMode()) {
		
		view = (InventoryViewTile) findViewById(R.id.inventoryViewTile1);
		view.setBackgroundColor(Color.BLUE);
		view.setOnClickListener(new ClickListener());
		}
	}

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		
	}

	
	public class ClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			view.setBackgroundColor(Color.RED);
			
		}
		
	}

}
