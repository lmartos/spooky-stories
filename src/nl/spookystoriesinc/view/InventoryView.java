package nl.spookystoriesinc.view;

import java.util.Observable;
import java.util.Observer;

import nl.spookystoriesinc.spookystories.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class InventoryView extends LinearLayout implements Observer {

	
	
	public InventoryView(Context context) {
		super(context);
		init(context);
		// TODO Auto-generated constructor stub
	}
	
	public InventoryView(Context context, AttributeSet attrs) {
		super(context, attrs);
			init(context);
			
		
		// TODO Auto-generated constructor stub
	}
	public InventoryView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
			init(context);
			
		// TODO Auto-generated constructor stub
	}
	
	

	public void init(Context context){
		if(!isInEditMode()) {
		
			//LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			//inflater.inflate(R.layout.inventory, this);
		
		}
		
	}

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		
	}



}
