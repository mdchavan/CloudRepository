package com.company.employeetest;

import java.util.List;

import com.company.employee.DiskLoader;
import com.company.employee.ILoader;

public class DiskLoaderTest {

	public static void main(String[] args) throws Exception {
		List<String> list;
		ILoader loadFile = new DiskLoader();
		list = loadFile.load();
		for (String lists : list) {
			System.out.println(lists);
		}
	}

}
