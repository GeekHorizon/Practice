package com.dasolute.practice.compare;

import java.util.Comparator;

public class ComparatorInterface implements Comparator<Compare> {

	public int compare(Compare o1, Compare o2) {
		return o2.getIndex() - o1.getIndex();
	}

}
