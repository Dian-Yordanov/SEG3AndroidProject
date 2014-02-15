package com.example.seg3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class questionary extends Activity {
	LinearLayout mainLayout;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionary_layout);
       mainLayout = (LinearLayout)findViewById(R.id.LinearLayout1);
       String questionText ="This is a question";
       String questionAnswer = "This is an answer";
       questionWithOpenTextViewAnswer question = 
    		   new questionWithOpenTextViewAnswer(getApplicationContext(),
    				   questionText);
       mainLayout.addView(question.inflator(questionText));
    }
    
    
}