package com.example.seg3;

public class dataReciever {
	int numberOfQuestions = 7;
	String wholeQuestionData = "[radio button ## do you have some problems with your hearth? ## yes ## no]###[radio button ## did anyone of your family had hearth problems? ## yes ## no]###[check boxes ## which memebers of your family have heart problems? ## your mother ## your father ## your uncle ## your aunt]###[text field ## weekly, how often do you get high blood presure?]###[text field ## weekly, how often do you get low blood predure?]###[check boxes ## which of the following is right for you? ## you eat more than 3000 calories daily ## you eat a lot of sugar and sweet products ## you drunk more than one cup of alcochol containing drinks every day]###[radio button ## have you had any surgeries that have affected your cardio system? ## yes ## no]";
	
	String[] questionData = new String[7];
	String questionType;
	String questionText;
	String questionAnswer;
	String questionAnswerDifferentOption [] = new String[4];
	
	public dataReciever(String wholeQuestionData) {
		
	}
	
	public void divideWholeQuestionData(String wholeQuestionData, int numberOfQuestions){
		
		for(int i=0;i<numberOfQuestions;i++){
			if(wholeQuestionData.matches("(]###[)")){
				
			}
			
		}
		
	}
}
