package com.example.seg3;

import inflatedViews.questionWithCheckButtons;
import inflatedViews.questionWithOpenTextView;
import inflatedViews.questionWithRadioButtons;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class withoutAppointment extends Activity {
	private static LinearLayout layoutForInflationWA;
	
	
	private static String questionText ="This is a question";
	private static String[] radioButtonQuestions ={"this is question 1", 
 		   "this is question 2", "this is question 3","this is a question 4"};
	private static String[] checkButtonQuestions ={"this is a check button 1", 
		   "this is a check button 2", "this is a check button 3"};
    
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.without_appointment);
        layoutForInflationWA = (LinearLayout)findViewById(R.id.LinearLayoutForInflationWA);
        
        setQuestions();
        
    }
    public void setQuestions(){

        setQuestionWithOpenTextView();
        questionWithRadioButtons();
        questionWithCheckButtons();
        setQuestionWithOpenTextView();
        questionWithRadioButtons();
        questionWithCheckButtons();
        setQuestionWithOpenTextView();
        questionWithRadioButtons();
        questionWithCheckButtons();
      
    }
    public void setQuestionWithOpenTextView(){
    	 questionWithOpenTextView questionTextView = 
      		   new questionWithOpenTextView(getApplicationContext(),
      				   questionText);
    	 layoutForInflationWA.addView(questionTextView.inflator(questionText));
    }
    public  void  questionWithRadioButtons(){
    	  questionWithRadioButtons questionRadioButtons = 
       		   new questionWithRadioButtons(getApplicationContext(),
       				   questionText, radioButtonQuestions);
    	  layoutForInflationWA.addView(questionRadioButtons.inflator(getApplicationContext(),
       		   questionText, radioButtonQuestions));
    }
    public void  questionWithCheckButtons(){
  	  questionWithCheckButtons questionCheckButtons = 
      		   new  questionWithCheckButtons(getApplicationContext(),
      				   questionText, radioButtonQuestions);
  	layoutForInflationWA.addView(questionCheckButtons.inflator(getApplicationContext(),
      		   questionText, checkButtonQuestions));
    }
    
}