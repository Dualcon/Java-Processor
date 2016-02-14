package com.wikidreams.processors;

public class App {

	public static void main(String[] args) {
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("Processors: " + processors);
	}

}
