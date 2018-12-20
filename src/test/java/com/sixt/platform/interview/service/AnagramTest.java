package com.sixt.platform.interview.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

	Anagram anagram;

	@Before
	public void setUp() throws Exception {
		anagram = new Anagram();

	}

	@Test
	public void should_return_true_when_words_are_anagram() {
		Assert.assertTrue(anagram.isAnagram("anagram", "Nagaram"));
	}
}
