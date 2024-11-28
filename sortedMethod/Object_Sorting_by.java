package stream_Api.sortedMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Stud {

	private String name;
	private long marks;

	public Stud() {
	}

	public Stud(String name, long marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", marks=" + marks + "]";
	}

}

public class Object_Sorting_by {
	public static void main(String[] args) {
		List<Stud> list = Arrays.asList(new Stud("Dinesh", 74), new Stud("Rohit", 45), new Stud("Amit", 91),
				new Stud("Kapil", 26), new Stud("Sahill", 88));

		
		
// Sorting by name
		List<Stud> sortByName = list.stream().sorted((l1, l2) -> l1.getName().compareTo(l2.getName())).toList();
				


System.out.println("Way1 To Print"+ sortByName);

System.out.println("Way2 To Print Sort By Name : ");
		for (Stud s : sortByName) {
			System.out.println(s);
		}

		System.out.println("Sort by marks....");
		List<Stud> sortByMarks = list.stream().sorted((l1, l2) -> Double.compare(l1.getMarks(), l2.getMarks())).toList();

		for (Stud s : sortByMarks) {
			System.out.println(s);
		}
		
		System.out.println("Sort by marks2....");
		List<Integer>nums=Arrays.asList(17,45,7,8,895,43,21,70);
		Collections.sort(nums);
		System.out.println(nums);
		
	}

}
