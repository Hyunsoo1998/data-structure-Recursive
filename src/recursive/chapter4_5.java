package recursive;

import java.util.Scanner;
//4.4 하노이의 탑	
	
public class chapter4_5 {
public static void main(String[]args) {
	System.out.println("원반의 개수를 입력해주세요: ");
	Scanner scan  =  new Scanner(System.in);
	int disks = scan.nextInt();
	
	System.out.println("[결과]");
	topOfHanoi(disks, "A" , "B" , "C");	
}

public static void topOfHanoi(int disks, String begin, String middle, String end) {
	if(disks == 1) {
		System.out.println(String.format("1번 원반을 %s 기둥으로 옮깁니다. " ,end));
	}else {
		System.out.println(String.format("%s개 이상의 원반을 구할 수 없습니다.",disks));
	}
}
}
/*Scanner 를 통해 원반의 개수를 입력받아 동작하는 코드이다. topOfHanoi 메서드를 살펴보면 4개의 파라미터를 받는다.
 *disks:원반의 개수  
 begin:시작점
 middle:임시지점(중간기둥) 
 end:목표지점 
 * 원반이 1개일 경우는 특별한 알고리즘 없이 동작할 수 있으므로 disks==1일 때, end로 이동시키면된다.
 
만약에 2개이상의 원반이 들어온 경우는 disks 개수만큼 출력을 해주어 원반을 구할 수 없다는 메세지를 띄워준다.
topOfHanoi메서드를 확장하여 다음 2개 이상 및 3개 이상인 하노이의 탑도 구해보자.
*/