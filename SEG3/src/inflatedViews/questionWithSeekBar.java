package inflatedViews;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import com.example.seg3.R;

public class questionWithSeekBar extends LinearLayout {

	public static View inflatedViewSeekBar;
	public static LayoutInflater questionWithSeekBarAnswer;
	TextView question;
	LinearLayout mainLayout;

	public questionWithSeekBar(Context context, String questionString) {
		super(context);

	}

	public View inflator(String questionText) {

		questionWithSeekBarAnswer = LayoutInflater.from(getContext());

		inflatedViewSeekBar = questionWithSeekBarAnswer.inflate(
				R.layout.question_with_seek_bar, mainLayout,
				false);

		setQuestionTextView(questionText);

		return inflatedViewSeekBar;

	}

	public void setQuestionTextView(String questionText) {
		TextView textView0 = (TextView) inflatedViewSeekBar
				.findViewById(R.id.textView1ForInflationSeekBar);
		textView0.setText(questionText, BufferType.SPANNABLE);

		Spannable s = (Spannable) textView0.getText();
		ForegroundColorSpan fcs = new ForegroundColorSpan(Color.BLUE);

		AssetManager mngr = getContext().getAssets();
		Typeface face = Typeface.createFromAsset(mngr,
				"fonts/Roboto-Regular.ttf");
		textView0.setTypeface(face);

		s.setSpan(fcs, 0, questionText.length(),
				Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

	}

	public void setAnswerTextView() {
	

	}

}
