package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreamTask {
	public static void main(String[] args) {
		//     10~1���� ArrayList�� ��� ���
		ArrayList<Integer> num = new ArrayList<Integer>();
		IntStream.range(1, 11).map(d -> 11-d).forEach(num::add);
		System.out.print(num + " ");
		System.out.println();
		//     1~10���� ArrayList�� ��� ���
		ArrayList<Integer> num2 = new ArrayList<Integer>();

		IntStream.rangeClosed(1, 10).forEach(num2::add);
		System.out.println(num2);
		//     ABCDEF�� �� ���ں��� ���
		"ABCDEF".chars().forEach(d -> System.out.print((char)d));

		//     1~100���� �� Ȧ���� ArrayList�� ��� ���
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter(d -> d%2!=0).forEach(num3::add);
		System.out.println(num3);

		//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
		ArrayList<String> alpha = new ArrayList<String>();
		



		//      5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()


		//      1~100���� �� Ȧ���� ArrayList�� ��� ���


		//      Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���

		
//		�ѱ��� ������ ����
		String hangle = "�����̻�����ĥ�ȱ�";
		String str = "�����̻�";
		str.chars().map(hangle::indexOf).forEach(System.out::print);
		
//		������ �ѱ۷� ����
		String hangle2 = "�����̻�����ĥ�ȱ�";
		String str2 = "0123";
		str2.chars().map(c -> c - 48).forEach(i -> System.out.println(hangle.charAt(i)));
		
	}
}