package recursive;

public class Chapter4_2_1 {
public static void main(String[]args) {
	System.out.println("결과: " + sum(3));
}
private static int sum(int range) {
	if(range == 1) {
		return range;
	}
	return range + sum(range -1);
}
}
// if(range == 1 ) { return range ; } 코드를 추가함으로써 무한 루프를 피할 수 있게 되었다.
// 기저조건을 만족할 때 까지 재귀호출을 반복하다가 기저 조건을 만나면 return 문을 통해 각 함수의 결괏값을 반환하고있다.
