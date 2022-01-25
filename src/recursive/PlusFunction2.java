package recursive;

public class PlusFunction2 {

	public static void main(String[] args) {
	
		int N = 5;
		System.out.println("1부터 "+N+"까지의 합계: " +PlusPlus(5));
		//PlusPlus출력 메서드 호출
	
	}
	// PlusPlus출력 메서드 선언
	public static int PlusPlus(int n) {
		//n이 0인 경우 return
		if(n==0) 
			return 0;
		return n += PlusPlus(n-1); //재귀함수 시작
	}

}
