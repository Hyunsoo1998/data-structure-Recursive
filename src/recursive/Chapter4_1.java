package recursive;

//재귀함수 동작 방식에 대한 이해를 위해 먼저 일반적인 메서드 호출을 해보자.
//1부터 100까지 합을 구하는 프로그램을 작성해보자. 아래처럼 반복문을 이용하여 구현할 수 있다.

public class Chapter4_1 {
public static void main(String[]args) {
	System.out.println("결과: " + sum(100));
}
private static int sum(int num) {
	int result = 0 ; 
	for(int i  = 1; i <=num; i++) {
		result += i;
	}
	return result;
}
}
//핵심 로직인 sum메서드의 내부를 살펴보자. 결괏값을 담을 int형 변수 result를 선언하고, 호출하는 쪽에서 넘겨준 
//num 인자의 수만큼 반복하여 result 변수에 더해 주고 있다.
//스택 영역에는 함수가 호출되는 시점에 스택 프레임(stack Frame)이라는 메모리 공간을 할당받아서 함수를 처리하기 위한 정보들인
//지역변수, 파라미터, 호출된 시점으로 돌아갈 반환 주소값을 저장하고있다.
//호출된 하무가 종료되면 할당받았던 스택프레임도 소멸하게 된다.
