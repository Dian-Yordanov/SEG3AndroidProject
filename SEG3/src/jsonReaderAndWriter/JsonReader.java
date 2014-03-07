package jsonReaderAndWriter;

/**
 * Created by Xelnect on 2/19/14.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import android.util.Log;

public class JsonReader {
	public static int number = 0;
	public static ArrayList<String> returnedJsonArray = new ArrayList<String>();
	public static String jsonString = "{\"question number 2\":{\"answerText\":[\"your mother\",\"your father\",\"your uncle\",\"your aunt\"],\"questionText\":\"which memebers of your family have heart problems?\",\"questionType\":\"check boxes\"},\"question number 1\":{\"answerText\":[\"yes\",\"no\"],\"questionText\":\"do you have some problems with your hearth?\",\"questionType\":\"radio button\"}}";
	
	public JsonReader() {
		jsonObjectExtractor(jsonFileReader());
	}

	public static JSONObject jsonFileReader() {
		JSONParser parser = new JSONParser();
		Object objToBeParsedFromFile = null;
		JSONObject jsonObjectFromObj = null;

		
		
		try {
			objToBeParsedFromFile = parser.parse(jsonString);
			 jsonObjectFromObj = (JSONObject) objToBeParsedFromFile;
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// try {
		// objToBeParsedFromFile = parser.parse();
		// // new FileReader("C:\\Users\\Xelnect\\Desktop\\JSonWritten.json"));
		//
		// jsonObjectFromObj = (JSONObject) objToBeParsedFromFile;
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		return jsonObjectFromObj;
	}

	public static ArrayList jsonObjectExtractor(
			JSONObject objToBeParsedFromFile) {

		JSONObject questionNumber = null;
		for (int i = 0; i < objToBeParsedFromFile.size(); i++) {
			String questionNumberIndex = "question number ".concat(Integer
					.toString(i + 1));

			questionNumber = (JSONObject) objToBeParsedFromFile
					.get(questionNumberIndex);
			System.out.println(questionNumber);

			returnedJsonArray.add(readQuestionType(questionNumber));
			returnedJsonArray.add(readQuestionText(questionNumber));
			returnedJsonArray.add(readAnswerText(questionNumber)
					.toString());
			number++;
		}
		
		return returnedJsonArray;

	}

	public static ArrayList readAnswerText(JSONObject obj) {
		JSONArray answerTextJsonArray = (JSONArray) obj.get("answerText");
		ArrayList answerTextArray = new ArrayList();
		Iterator<String> iterator = answerTextJsonArray.iterator();
		while (iterator.hasNext()) {
			answerTextArray.add(iterator.next());
		}
		return answerTextArray;
	}

	public static String readQuestionText(JSONObject obj) {
		String questionText = (String) obj.get("questionText");
		return questionText;
	}

	public static String readQuestionType(JSONObject obj) {
		String questionType = (String) obj.get("questionType");
		return questionType;
	}
}