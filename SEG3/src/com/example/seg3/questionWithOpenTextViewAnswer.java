package com.example.seg3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class questionWithOpenTextViewAnswer extends LinearLayout{
	
	public static View inflatedView;
	public static LayoutInflater questionWithOpenTextAnswer;
	TextView question;
	EditText answer;
	LinearLayout mainLayout;
	
	public questionWithOpenTextViewAnswer(Context context, String questionString,
			String answerText) {
		super(context);
	
	
	}

	public View inflator(String questionText, String answer){
		
		questionWithOpenTextAnswer = LayoutInflater.from(getContext());
		
		inflatedView = questionWithOpenTextAnswer.inflate(
				R.layout.question_with_open_text_answer_layout, 
				mainLayout,false);
		
		TextView textView0 = (TextView) inflatedView.findViewById(R.id.textViewForInflation);
		textView0.setText(questionText);
		
		EditText editText0 = (EditText) inflatedView.findViewById(R.id.editTextForInflation);
		editText0.setText(answer);
		
		return inflatedView;
		
	}
}
