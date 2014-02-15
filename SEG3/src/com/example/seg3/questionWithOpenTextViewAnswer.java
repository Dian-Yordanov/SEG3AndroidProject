package com.example.seg3;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class questionWithOpenTextViewAnswer extends LinearLayout{
	
	public static View inflatedView;
	public static LayoutInflater questionWithOpenTextAnswer;
	TextView question;
	EditText answer;
	LinearLayout mainLayout;
	
	public questionWithOpenTextViewAnswer(Context context, String questionString) {
		super(context);
	
	
	}

	public View inflator(String questionText){
		
		questionWithOpenTextAnswer = LayoutInflater.from(getContext());
		
		inflatedView = questionWithOpenTextAnswer.inflate(
				R.layout.question_with_open_text_answer_layout, 
				mainLayout,false);
		
	
		
		setQuestion(questionText);
		setAnswer();
		
		
		
		return inflatedView;
		
	}
	
	public void setQuestion(String questionText){
		TextView textView0 = (TextView) inflatedView.findViewById(
				R.id.textViewForInflation);
		textView0.setText(questionText, BufferType.SPANNABLE);
		
		Spannable s = (Spannable) textView0.getText();
		ForegroundColorSpan fcs = new ForegroundColorSpan(Color.BLUE);
				
		AssetManager mngr = getContext().getAssets();
		Typeface face=Typeface.createFromAsset(mngr,"fonts/Roboto-Regular.ttf");
		textView0.setTypeface(face);
		
		s.setSpan(fcs, 0, questionText.length(),
				Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		
	}
	public void setAnswer(){
		EditText editText0 = (EditText) inflatedView.findViewById(
				R.id.editTextForInflation);
		
		AssetManager mngr = getContext().getAssets();
		Typeface face=Typeface.createFromAsset(mngr,"fonts/Roboto-Regular.ttf");
		editText0.setTypeface(face);

	}
	
}

