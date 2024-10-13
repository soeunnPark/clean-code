package com.org.example;

public class CopyChars {

	public static void copyChars(char a1[], char a2[]) {
		for(int i = 0; i<a1.length; i++) {
			a2[i] = a1[i];
		}
	}

	public static void copyChars2(char source[], char destination[]) {
		for(int i = 0; i<source.length; i++) {
			destination[i] = source[i];
		}
	}
}
