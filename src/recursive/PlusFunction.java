package recursive;

/*재귀함수란?
 *함수가 직접 또는 간접적으로 자신을 호출하는 프로세스이다. 
 *재귀 알고리즘을 이용하면 복잡한 문제들도 간단하게 해결할 수 있다.
 *반복문도 마찬가지지만 재귀함수도 종료지점을 제대로 생각하지 않고 구현을 하면 
 스택오버플로우가 발생할 수 있다.*/

//"Hello World"를 반복출력하는 재귀함수이다.
//n이 0이 될 때 메서드를 끝낸다.
//함수를 호출 할 때마다 n을 1씩 빼줘서 재귀함수를 종료하게 만들어준다.

public class PlusFunction {
public static void main(String[]args) {
	HelloWorld(5); //HelloWorld출력메서드 호출
}
//HelloWorld 출력 메서드 선언.
public static void HelloWorld(int n) {
	// n이 0인 경우 return
	if(n==0)
		return;

System.out.println("HelloWorld"); // HelloWorld출력
HelloWorld(n-1); // 재귀함수 시작


}
}
