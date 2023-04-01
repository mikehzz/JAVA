
public class Ed_05_Calc {

	public static void main(String[] args) {
		
		for(String str:args) {
			System.out.printf("%s\n",str);
		}
		
		if(args.length != 3) {
			System.out.println("param !=3(12 + 14)>");
			System.exit(0);
		}
		int num01 = Integer.parseInt(args[0]);//숫자형 문자열을 숫자로 casting
		String operator = args[1];//연산 기호
		int num02 = Integer.parseInt(args[2]);
		
		System.out.printf("num01 = %d\n",num01);
		System.out.printf("operator = %s\n",operator);
		System.out.printf("num01 = %d\n",num02);
		
		// *는 특별한 의미를 가지고 있는 파라미터로 , 현재 디렉토리에 있는 모든 파일을 파라미터로 받는다.
		// +, -, *, /
		int result = 0;
		switch(operator) {
		case "+":
			result = num01 + num02;
			break;
		case "-":
			result = num01 - num02;
			break;
		case "x":
			result = num01 * num02;
			break;	
		case "/":
			result = num01 / num02;//-->int/int 소수점 표현 안됨
			break;
		default:
			System.out.printf("연산 기호를 확인 하세요.\n");
			break;
		}
		System.out.printf("%d %s %d = %d\n", num01,operator,num02, result);
	}
}
