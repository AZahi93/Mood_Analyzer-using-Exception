package com.moodAnalyzer;

import java.util.regex.Matcher;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import practice.ParameterisedRegex;


import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad message");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Happy message");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
		}

	}

	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

}
