package com.example.seg3;

import inflatedViews.questionWithOpenTextView;
import inflatedViews.questionWithRadioButtons;
import inflatedViews.questionWithCheckButtons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class questionary extends Activity {
	private static LinearLayout mainLayout;
	private static String questionText ="This is a question";
	private static String questionAnswer = "This is an answer";
	private static String[] radioButtonQuestions ={"this is question 1", 
 		   "this is question 2", "this is question 3","this is a question 4"};
	private static String[] checkButtonQuestions ={"this is a check button 1", 
		   "this is a check button 2", "this is a check button 3"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionary_layout);
       mainLayout = (LinearLayout)findViewById(R.id.LinearLayout1);
       
       
       setQuestionWithOpenTextView();
       questionWithRadioButtons();
       questionWithCheckButtons();
     
    }
    public void setQuestionWithOpenTextView(){
    	 questionWithOpenTextView questionTextView = 
      		   new questionWithOpenTextView(getApplicationContext(),
      				   questionText);
         mainLayout.addView(questionTextView.inflator(questionText));
    }
    public  void  questionWithRadioButtons(){
    	  questionWithRadioButtons questionRadioButtons = 
       		   new questionWithRadioButtons(getApplicationContext(),
       				   questionText, radioButtonQuestions);
          mainLayout.addView(questionRadioButtons.inflator(getApplicationContext(),
       		   questionText, radioButtonQuestions));
    }
    public void  questionWithCheckButtons(){
  	  questionWithCheckButtons questionCheckButtons = 
      		   new  questionWithCheckButtons(getApplicationContext(),
      				   questionText, radioButtonQuestions);
         mainLayout.addView(questionCheckButtons.inflator(getApplicationContext(),
      		   questionText, checkButtonQuestions));
    }
    
    
}