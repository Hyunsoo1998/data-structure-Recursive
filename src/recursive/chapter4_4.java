package recursive;

import java.util.Scanner;
/*4.3 피보나치 수열 
 * 첫째 항 또는 둘째 항이 1이며, 뒤에 나오는 항들은 모두 자신의 앞 두 항의 합인 수열이다.
 * 1 1 2 3 이 존재하는 수열에서 다음 5번째 항은 2 +3 = 5가 된다.
 * 
 * 피보나치 수열의 초항과 점화식
 * fn =  0  {fn = 0;}
 * fn =  1  {f1 = 1;}
 * fn = fn-1 + fn-2 {f n>1;}
 * n 이 0 인경우 0을 반환하고 1인 경우 1을 반환한다. n이 1보다 큰 경우 앞 두항의 합을 반환한다.
 * 위 함수식을 토대로 코드로 구현할 수 있다.
 * 사용자로부터 입력값을 받아 피보나치 수열을 모두 출력하는 코드를 구현해보자  	
 
 * */



public class chapter4_4 {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.printf("입력: ");

	int num = scan.nextInt();
	System.out.printf("피보나치 수열: ");

	for (int i=0; i <num;  i++) {
		System.out.printf(fibonacci(i)+ " ");
	}
}
	private static int fibonacci(int n) {
		if(n <=1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
/*피보나치 수열의 기저 조건은 n==0이거나 n==1일 때, n을 반환하도록 함수식이 정의되어 있으므로 이에 맞게
 * n>1인경우 재귀 호출을 통해 자신의 앞 두 항을 구하여 서로 더해 주고 결괏값을 반환한다. 팩토리얼 예제와 다르게
 * 재귀 함수 내에서 두번의 재귀호출이 일어나는 것을 볼 수 있다.
 
 * 
 * 
 * */
