package streamExerciseFour;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExerciseFour {
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer> evenIntegerSum = integerList.stream().filter(num -> num % 2 == 0).reduce((numOne, numTwo) -> numOne + numTwo);
		evenIntegerSum.ifPresent(System.out::println);
		
	}

}
