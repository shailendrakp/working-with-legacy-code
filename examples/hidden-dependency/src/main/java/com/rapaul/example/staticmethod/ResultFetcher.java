package com.rapaul.example.staticmethod;

import java.util.List;

public class ResultFetcher {
	
	public static List<Result> getResultsFor(Patient patient) {
		throw new IllegalStateException("Can not connect to the result database");
	}
	
}