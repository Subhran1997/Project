package com.mavenprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {

		public static void main(String []args) {
			ArrayList<Integer> marks=new ArrayList<Integer>() ;
			marks.add(0);
			marks.add(3);
			marks.add(12);
			marks.add(18);
			marks.add(22);
			marks.add(28);
			System.out.println(marks);
			List<Integer> updateMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
			//List<Integer> updateMarks=marks.stream().filter(i->i>=22).collect(Collectors.toList());
			System.out.println(updateMarks);
	
	}

}
