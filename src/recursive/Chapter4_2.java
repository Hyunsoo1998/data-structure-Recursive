package recursive;

//4_1과같이 반복문을 사용한 코드를 재귀함수로 바꿔보자.

public class Chapter4_2 {
public static void main(String[]args) {
	System.out.println("결과: " +sum(100));
}
private static int sum(int range) {
	return range + sum(range -1);
}

}
//반복문이 제거되고 return문에서 자기 자신을 다시 호출하는것을 볼 수있다. 파라미터로 넘어온 range 를 더하는 동시에
//자기자신을 호출하면서 전달 인자(Argument)로 range를 -1만큼 감소시켜 다시 호출하고있다.
//위 코드를 실행하면 java.lang.StackOverflowError 익셉션이 발생한다.
//자기 자신을 계속호출하면서 무한 루프를 빠져나올 조건을 명시해주지 않았기 때문이다.

/*1.main함수에서 시작되어 재귀함수인 sum 함수를 호출한다
  2.재귀함수도 일반적으로 함수의 형태이므로 자기 자신을 호출하더라도 복사본을 만들어서 새 스택 프레임 메모리 공간을 할당받아 메서드이 상태 및 정보가 저장되는 형태를 가진다.
  3.반복문은 종료 조건이 필수요소 이기 때문에 재귀 함수에서 발생할 수 있는 스택오버플로우 발생률이 적지만
  재귀함수에서 중요한점은 무한정 호출을 막기위한 조건을 명시해주어야한다.
  4. 예외가 발생하지 않도록 재귀를 중지시킬 수 있는 조건이 필요하다. 이것을 기저 조건 이라한다.

*/


