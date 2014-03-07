package com.example.seg3;

import jsonReaderAndWriter.JsonReader;
import inflatedViews.*;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class SurveyActivity extends Activity {
	private static LinearLayout mainLayout;

	private static String questionText = "This is a question";
	private static String[] radioButtonQuestions = { "this is question 1",
			"this is question 2", "this is question 3", "this is a question 4" };
	private static String[] checkButtonQuestions = {
			"this is a check button 1", "this is a check button 2",
			"this is a check button 3" };
	private static String[] spinnerQuestions = {
		"this is a check button 1", "this is a check button 2",
		"this is a check button 3", "this is a check button 4",
		"this is a check button 5" };
	private static String[] questionWithSeekBarBoundaries = { "0", "1000" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionary_layout);
		mainLayout = (LinearLayout) findViewById(R.id.LinearLayout1);

		setQuestions();

	}

	public void fillQuestions(String[] questionsData) {
		// fillQuestions will take the data about questions. For now it will
		// take it as
		// [questionType, questionText, questionAnswers[]]
		// the idea is that a question that needs only a EditText as answer
		// should have
		// the following info about it: [open answer,How old are you?]
		// this is what the admin will write and he will only need to fill this
		// information
		// about an open answer text. if the question is with radioButtons or
		// with check boxes
		// he will need to write for a question with radio boxes :
		// [radio boxes, How many vodkas do you drink every week?, less than
		// 2,less than 5, less than 10, more than you can imagine]
		// that way you will have a radio box question with 4 options
		// the last option is to have check boxes and it will be close to radio
		// boxes, for example:
		// [check boxes, which of the following girs have you fucked?, Stacy,
		// Ivana, Hui chan, your mom, your dad]
		// some of the lines above may need to be changed before we give the
		// code for evaluation ヽ༼ຈل͜ຈ༽ﾉ ¯\_(༼ຈل͜ຈ༽)_/¯

		for (int i = 0; i < questionsData.length; i++) {

		}
	}
	public void questionBuilder(){
		
	}

	public void setQuestions() {		
    	
		JsonReader jr = new JsonReader();
		
		Log.v("number","hey "+JsonReader.number);
		Log.v("array",JsonReader.returnedJsonArray.toString());		

	}

	public void setQuestionWithOpenTextView(String questionText, String[] answerText) {
		questionWithOpenTextView questionTextView = new questionWithOpenTextView(
				getApplicationContext(), questionText);
		mainLayout.addView(questionTextView.inflator(questionText));
	}

	public void questionWithRadioButtons(String questionText, String[] answerText) {
		questionWithRadioButtons questionRadioButtons = new questionWithRadioButtons(
				getApplicationContext(), questionText, answerText);
		mainLayout.addView(questionRadioButtons.inflator(
				getApplicationContext(), questionText, answerText));
	}

	public void questionWithCheckButtons(String questionText, String[] answerText) {
		questionWithCheckButtons questionCheckButtons = new questionWithCheckButtons(
				getApplicationContext(), questionText, answerText);
		mainLayout.addView(questionCheckButtons.inflator(
				getApplicationContext(), questionText, answerText));
	}

	public void questionWithSpinner(String questionText, String[] answerText) {
		questionWithSpinner questionWithSpinner = new questionWithSpinner(
				getApplicationContext(), questionText, answerText);
		mainLayout.addView(questionWithSpinner.inflator(
				getApplicationContext(), questionText, answerText));
	}

	public void questionWithSeekBar(String questionText, String[] answerText) {
		questionWithSeekBar questionWithSeekBar = new questionWithSeekBar(
				getApplicationContext(), questionText,
				Integer.parseInt(answerText[0]),
				Integer.parseInt(answerText[1]));
		mainLayout.addView(questionWithSeekBar.inflator(
				getApplicationContext(), questionText,
				Integer.parseInt(answerText[0]),
				Integer.parseInt(answerText[1])));
	}
}