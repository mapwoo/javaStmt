package forloop;

/**
 *@file : DooSum.java 
 *@author CJH
 *@date 2016. 3. 10.
 *@story
 */

public class DooSum {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("1번째 방법");
		for (int i = 1; i<= 10; i+=2) {
			sum +=i;
		}
		System.out.println("1부터 10까지 홀수의 합 " +sum);
		System.out.println("2번째 방법");
		for (int i =0; i < 10; i++) {
			
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1부터 10까지 홀수의 합 " + sum);
	}
}
