package com.edu;

import java.util.Arrays;
import java.util.List;

public class lambdademo {
	public static void main(String []args) {
		List<String>names = Arrays.asList("john","alice","bob");
		names.forEach(name->System.out.println(names));
	}

}
