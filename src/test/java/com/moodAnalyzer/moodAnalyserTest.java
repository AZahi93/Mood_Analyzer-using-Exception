package com.moodAnalyzer;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class moodAnalyserTest {

	@Test
	public void moodSad() {
		moodAnalyser mood = new moodAnalyser("Sad Mood");
		assertEquals("SAD", mood.moodAnalyse());

	}

	@Test
	public void moodHappy() {
		moodAnalyser mood = new moodAnalyser("Any Mood");
		assertEquals("HAPPY", mood.moodAnalyse());

	}
}