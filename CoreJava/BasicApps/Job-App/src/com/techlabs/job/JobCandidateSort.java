package com.techlabs.job;

import java.util.Comparator;

public class JobCandidateSort implements Comparator<JobCandidate> {

	@Override
	public int compare(JobCandidate candidate1, JobCandidate candidate2) {
		if (candidate1.getAge() == candidate2.getAge())
			return 0;
		else if (candidate1.getAge() > candidate2.getAge())
			return 1;
		else
			return -1;
	}

}
