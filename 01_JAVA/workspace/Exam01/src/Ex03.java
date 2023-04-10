//20점
public class Ex03 {
	
	public static void main(String[] args) {
		//자바 프로그램으로 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		//의 결과를 계산하는 자바 프로그램을 작성 하세요.
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum += j;
			}
		}
		
		System.out.println("답 :"+sum);
	}
	
}
