package com.techlabs.job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JobCandidateTest {

	public static void main(String[] args) {
		ArrayList<JobCandidate> al = new ArrayList<JobCandidate>();
		al.add(new JobCandidate("Ram", "Male", 26));
		al.add(new JobCandidate("Mahesh", "Male", 29));
		al.add(new JobCandidate("Pratik", "Male", 28));
		al.add(new JobCandidate("Kumar", "Male", 25));
		al.add(new JobCandidate("Pavan", "Male", 24));
		System.out.println("Job candidate before sort" + "\n");
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			JobCandidate candidate = (JobCandidate) iterator.next();
			System.out.println(candidate.getName() + "  " + candidate.getGender() + "  " + candidate.getAge());
		}

		System.out.println("\n" + "Job candidate after sort" + "\n");
		Collections.sort(al, new JobCandidateSort());
		/*
		 * Iterator iterator1 = al.iterator(); while (iterator1.hasNext()) {
		 * JobCandidate candidate = (JobCandidate) iterator1.next();
		 * System.out.println(candidate.getName() + "  " + candidate.getGender()
		 * + "  " + candidate.getAge()); }
		 */
		for (JobCandidate can : al) {
			System.out.println(can.getName() + "  " + can.getGender() + "  " + can.getAge());

		}
	}

}
