# Processors
Java - Get number of processors.


## App.java


package com.wikidreams.processors;

public class App {

	public static void main(String[] args) {
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("Processors: " + processors);
	}

}


Produced by [Wiki Dreams.github.io](https://WikiDreams.github.io/).