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
	
	private static String[] questionsData={
	""	
	};
	
	private static String[] questions = new String[10];
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
       
       setQuestions();

    }
    
    public void fillQuestions(String[] questionsData){
    	//fillQuestions will take the data about questions. For now it will take it as
    	//[questionType, questionText, questionAnswers[]]
    	//the idea is that a question that needs only a EditText as answer should have 
    	//the following info about it: [open answer,How old are you?]
    	//this is what the admin will write and he will only need to fill this information 
    	//about an open answer text. if the question is with radioButtons or with check boxes
    	//he will need to write for a question with radio boxes :
    	//[radio boxes, How many vodkas do you drink every week?, less than 2,less than 5, less than 10, more than you can imagine]
    	//that way you will have a radio box question with 4 options
    	//the last option is to have check boxes and it will be close to radio boxes, for example:
    	//[check boxes, which of the following girs have you fucked?, Stacy, Ivana, Hui chan, your mom, your dad]
    	//some of the lines above may need to be changed before we give the code for evaluation ヽ༼ຈل͜ຈ༽ﾉ   ¯\_(༼ຈل͜ຈ༽)_/¯
    	
    	for(int i=0; i<questionsData.length;i++){
    		
    	}
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