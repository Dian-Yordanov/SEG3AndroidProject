package com.example.seg3;

import inflatedViews.questionWithOpenTextView;
import inflatedViews.questionWithRadioButtons;
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
       String[] radioButtonQuestions ={"this is question 1", 
    		   "this is question 2", "this is question 3","this is a question 4"};
       
       questionWithOpenTextView questionTextView = 
    		   new questionWithOpenTextView(getApplicationContext(),
    				   questionText);
       mainLayout.addView(questionTextView.inflator(questionText));
       
       questionWithRadioButtons questionRadioButtons = 
    		   new questionWithRadioButtons(getApplicationContext(),
    				   questionText, radioButtonQuestions);
       mainLayout.addView(questionRadioButtons.inflator(getApplicationContext(),
    		   questionText, radioButtonQuestions));
    }
    
    
}