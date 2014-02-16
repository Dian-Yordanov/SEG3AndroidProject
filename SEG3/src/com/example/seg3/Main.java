package com.example.seg3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main extends Activity {
	LinearLayout layoutForCentering;
	Button withAppointment;
	Button withoutAppointment;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        withAppointment = (Button) findViewById(R.id.withAppointment);
        withoutAppointment = (Button) findViewById(R.id.withoutAppointment);
        layoutForCentering = (LinearLayout) findViewById(R.id.LayoutForMiddle);
        
        
       
    }
    
    public void gotoWithAppointmentView(View view) {
		Intent i = new Intent(Main.this,withAppointment.class);
		startActivity(i);
	}
    public void gotoWithoutAppointmentView(View view) {
		Intent i = new Intent(Main.this,withoutAppointment.class);
		startActivity(i);
	}
    
}
