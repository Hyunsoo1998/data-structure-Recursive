package recursive;

import java.util.Scanner;

public class chapter4_6 {
public static void main(String[]args) {
	System.out.println("원반의 개수를 입력하세요: ");
	Scanner scan = new Scanner(System.in);
	int disks = scan.nextInt();
	
	System.out.println("[결과]");
	topOfHanoi(disks,"A","B","C");
}
public static void topOfHanoi(int disks, String begin , String middle, String end) {
if(disks==1) {
	System.out.println(String.format("1번 원반을 %s기둥으로 옮깁니다.", end));
	return;
}
//첫번째 재귀 호출 topOfHanoi(disks-1, begin ,middle , end)
/*최하단 원반을 제외한 원반들을 출발지점에서 임시지점까지 옮기는 재귀호출이다. 전달인자의 순서를 유의해야한다. 호출될 때 원반을 하나씩 옮겨야 하므로
 * -1만큼 감소를 시키는 disks -1과 시작 지점인 begin을 전달하고 있다. 임시지점을 목표지점으로 두기 때문에 middle을 마지막 인자(목표지점)로 사용하고
 * 남은 end는 임시지점 인자로 넘겨준다.*/
topOfHanoi(disks-1 , begin , end, middle);
System.out.println(String.format("%s번 원반을 %s기둥으로 옮깁니다.", disks,end));
/*두번째 재귀호출 topOfHanoi(disks-1,middle,begin,end)
 * 목표지점에 최하단 원반이 존재하고 나머지 원반들은 임시지점에 쌓여 있는 상황이다. 임시지점에서 목표지점까지
 * 원반들을 옮기는 재귀호출이다. 전달인자의 순서를 유의하며 살펴보자 첫번째 재귀호출과 마찬가지로 호출될 때 원반을 하나씩 옮겨야 하므로
 * -1만큼 감소를 시키는 disks-1 가 있으며 시작 지점은 임시지점이므로 middle을 인자로 전달하고 있다.
 * 목표지점으로 이동 시키기 위해 end를 인자로 사용하고 남은 begin은 임시지점 인자로 넘겨준다.
 * */

topOfHanoi(disks-1, middle, begin, end);
}
}
