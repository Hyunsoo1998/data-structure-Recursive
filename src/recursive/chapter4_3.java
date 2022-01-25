package recursive;
//팩토리얼은 자연수 n에대하여 1부터 n까지의 자연수를 모두 곱하는것이다. n이 5일경우 5X4X3X2x1 이므로 120이된다.
// 이것을 반복문으로 구현할 수도 있고 재귀 함수로도 구현할 수 있다.

public class chapter4_3 {
public static void main(String[]args) {
	System.out.println("5!  =>" + factorial(5));
	System.out.println("5!  =>" + factorial(6));
	System.out.println("5!  =>" + factorial(7));
	
}
private static int factorial(int num) {
	if(num <=1) {
		return 1;
	}
	return num* factorial(--num);
}
}
//이전에 보았던 sum 함수의 로직과 비슷하게 구현한 것을 볼 수있다.
//기저조건은 if(num<=1)임을 확인할 수 있다.
//팩토리얼은 자연수 1까지만 곱하는 것이므로 1보다 같거나 작은 값이 넘어오는 경우 1을 반환한다.
//기저 조건을 만족하지 않는 경우에는 num을 -1감소시켜 재귀호출을 한다. 기저 조건을 만족할 때 까지 계속 num이 하나씩 감소되며 재귀 호출을 반복한다.