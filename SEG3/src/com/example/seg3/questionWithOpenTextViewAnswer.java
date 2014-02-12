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
	
	public questionWithOpenTextViewAnswer(Context context) {
		super(context);
		
	}

	public View inflator(View view, String questionText, String answer){
		questionWithOpenTextAnswer = LayoutInflater.from(getContext());
		return inflatedView = questionWithOpenTextAnswer.inflate(R.layout.question_with_open_text_answer_layout, 
				mainLayout,false);
		
	}
}
