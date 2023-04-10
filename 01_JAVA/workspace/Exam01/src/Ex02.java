import java.util.Arrays;

//25점
public class Ex02 {
	public static void main(String[] args) {
		//1~50사이 임의의 숫자 6개를 중복되지 않게 출력하는 자바 프로그램을
		//작성 하세요.(단, 배열로 소스를 작성하고, 내림차순으로 출력 하세요.
		
		//1. 1~50사이의 임의의 숫자 6개를 출력하는 배열을 만듬.(중복x)
		//2. 내림차순으로 출력하기
		
		//1.
		int []randNum = new int[6];
		
		for(int i=0;i<randNum.length;i++) {
			randNum[i]=(int)(Math.random()*50+1);
			for(int j = 0; j < i; j++) {
		        if(randNum[i] == randNum[j]){
		            i--; 
		            break; 
		        }
		    }
			
			
			
		}
		System.out.println("정렬 전 : 1~50 임의의 숫자 6개 뽑기");
		System.out.println(Arrays.toString(randNum));
		
		//2.
		for(int i=0;i<randNum.length;i++) {	
			for(int j=0;j<randNum.length-i-1;j++) {
				if(randNum[j]<randNum[j+1]) { //앞뒤를 비교하여 앞자리 수가 크면 자리 교환
					// 부등호 방향 > : ASC (작-큰)
					// 부등호 방향 < : DESC (큰-작)
					int tmp = randNum[j];
					randNum[j] = randNum[j+1];
					randNum[j+1] = tmp;
				}
			}
		}
		System.out.println("정렬 후 : 1~50 임의의 숫자 6개 뽑기");
		System.out.println(Arrays.toString(randNum));
	}
	
	
	
}
