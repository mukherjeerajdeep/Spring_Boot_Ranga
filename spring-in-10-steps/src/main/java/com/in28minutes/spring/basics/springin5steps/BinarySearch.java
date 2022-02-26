package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

	private final SortAlgorithm sortAlgorithm;

	public BinarySearch(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

}
