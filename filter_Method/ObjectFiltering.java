package stream_Api.filter_Method;

import java.util.Arrays;
import java.util.List;

class Student {

	private int id;
	private String name;
	private String city;

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return " id = " + id + ", name = " + name + ", city = " + city;
	}

}

public class ObjectFiltering {
	public static void main(String[] args) {

		List<Student> student = Arrays.asList(new Student(100, "Shubham", "Pune"),
				new Student(101, "Rahul", "Baramati"), new Student(104, "Mamta", "Mumbai"));

		List<Student> filteredList = student.stream().filter(stud -> stud.getName().startsWith("R")).toList();

		System.out.println("Using Simple Sysout : " + filteredList);

		System.out.println("Using For Each Loop : ");
		for (Student students : filteredList) {
			System.out.println(students);
		}
	}
}
