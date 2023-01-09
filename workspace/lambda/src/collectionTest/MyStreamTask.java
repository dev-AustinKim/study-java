package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreamTask {
	public static void main(String[] args) {
		//     10~1까지 ArrayList에 담고 출력
		ArrayList<Integer> num = new ArrayList<Integer>();
		IntStream.range(1, 11).map(d -> 11-d).forEach(num::add);
		System.out.print(num + " ");
		System.out.println();
		//     1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> num2 = new ArrayList<Integer>();

		IntStream.rangeClosed(1, 10).forEach(num2::add);
		System.out.println(num2);
		//     ABCDEF를 각 문자별로 출력
		"ABCDEF".chars().forEach(d -> System.out.print((char)d));

		//     1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter(d -> d%2!=0).forEach(num3::add);
		System.out.println(num3);

		//      A~F까지 중 D제외하고 ArrayList에 담고 출력
		ArrayList<String> alpha = new ArrayList<String>();
		



		//      5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()


		//      1~100까지 중 홀수만 ArrayList에 담고 출력


		//      Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력

		
//		한글을 정수로 변경
		String hangle = "공일이삼사오육칠팔구";
		String str = "공일이삼";
		str.chars().map(hangle::indexOf).forEach(System.out::print);
		
//		정수를 한글로 변경
		String hangle2 = "공일이삼사오육칠팔구";
		String str2 = "0123";
		str2.chars().map(c -> c - 48).forEach(i -> System.out.println(hangle.charAt(i)));
		
	}
}