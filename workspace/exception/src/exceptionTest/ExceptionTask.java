package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է¹ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		
		
//		�� ����. ����´�.
//		Scanner sc = new Scanner(System.in);
//		int i = 0; // �迭�� ���ش�.
//		String num = null;
//		int [] arData = new int[5];
//		

//		try {
//			while(true) {
//				System.out.println("������ �Է��ϼ���.");
//				num = sc.next();
//				if(num.equals("q")) {System.out.println("q �Է�. ������."); break;}
//				arData[i] = Integer.parseInt(num);
//				i++;
//			}
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� �ʰ��Ͽ����ϴ�. ���ݱ����� �迭�� ��� ���ڴ�");
//			for (int j = 0; j < arData.length; j++) {
//				System.out.print(arData[j] + " ");
//			}
//		} catch(NumberFormatException e) {
//			System.out.println("���� �������� �Է����ּ���.");
//		}
		
//		����� ����
	      Scanner sc = new Scanner(System.in);
	      int[] arData = new int[5];
	      String temp = null;
	      
	      for(int i=0;; i++) {
	         System.out.print(i + 1 + "��° ����[q: ������]: ");
	         temp = sc.next();
	         temp = temp.toLowerCase(); // �Է¹��� ���ڸ� temp�� �׻� �ҹ��ڷ� ���� �ϴ� ��.
	         if(temp.equals("q")) {
	            break;
	         }
	         
	         try {
	            arData[i] = Integer.parseInt(temp);
	            
	         } catch (NumberFormatException e) {
	            System.out.println("������ �Է����ּ���.");
	            i--;
	            
	         } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("5���� ������ �Է��� �����մϴ�.");
	            for (int j = 0; j < arData.length; j++) {
	               System.out.print(arData[j] + " ");
	            }
	            break;
	            
	         } catch (Exception e) {
	            System.out.println("�ٽ� �õ����ּ���.");
	            i--;
	         }
	      }
	   
	}
}
