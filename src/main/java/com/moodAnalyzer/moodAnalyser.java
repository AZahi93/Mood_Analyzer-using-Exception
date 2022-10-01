package com.moodAnalyzer;

public class moodAnalyser {

	private String message;

	public moodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String moodAnalyse() {

		String words[] = message.split(" ");
		if (words[3].equalsIgnoreCase("sad"))
			return "SAD";
		return "HAPPY";
	}
}
