package stream_Api.filter_Method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Odd_Even_Number {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 334, 13, 67, 43, 80, 34, 67);

		List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> filteredList2 = list.stream().filter(i -> i % 2 != 0).toList();
		System.out.println("Even Numbers : " + filteredList);
		System.out.println("--------------------------------------");
		System.out.println("Odd Numbers : " + filteredList2);

		// Select the students having marks greater than 35

		List<Integer> passedStudent = list.stream().filter(i -> i > 35).toList();
		System.out.println("Passed Students : " + passedStudent);
		
		

		// Adding =5 marks to failed students
		List<Integer> GracePassedStudent = list.stream().filter(i -> i < 35).map(i -> i + 5).toList();
			System.out.println("Grace : "+ GracePassedStudent);
			
			
			List<Integer> failedStudent = list.stream().filter(i -> i < 35).toList();
			System.out.println("Failed Students : " + passedStudent);
			
			List<Integer> graceStudent=failedStudent.stream().map(i->i+5).toList();
			System.out.println("Grace2 : "+graceStudent);
			
		
	}

}
