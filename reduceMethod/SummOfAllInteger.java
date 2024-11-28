package stream_Api.reduceMethod;

import java.util.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SummOfAllInteger {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 45, 76, 32, 6, 9);

		Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
		System.out.println("1st Way Sum : " + sum + "\n 2nd Way : " + sum.get());

		long sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("2nd Way Sum : " + sum1); 

		Optional<Integer> squareSum = numbers.stream().map(i -> i * i).reduce((a, b) -> a + b);
		System.out.println("1st Way SumSquare : " + squareSum + "\n 2nd Way : " + squareSum.get());

		Optional<Integer> squareSum1 = numbers.stream().map(i -> i * i).reduce((a, b) -> a + b);
		System.out.println("2nd Way SumSquare : " + squareSum1);

		
		
		
		Optional<Integer> evenSum = numbers.stream().filter(i -> i % 2 == 0).reduce((a, b) -> a + b);
		System.out.println("1st Even Sum : " + evenSum + "\n 2nd Way : " + evenSum.get());
		
		double evenSum1 = numbers.stream().filter(i -> i % 2 == 0).reduce(0,(a, b) -> a + b);
		System.out.println("1st Even Sum : " + evenSum1);

		List <Integer>evenSum2 = numbers.stream().filter(i -> i % 2 == 0).toList();
		System.out.println("1st Even Sum : " + evenSum2 );
		
	}
}
