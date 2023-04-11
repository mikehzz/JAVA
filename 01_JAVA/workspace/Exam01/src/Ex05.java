import java.io.*;
import java.util.StringTokenizer;

//20점
public class Ex05 {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\Exam01\\src\\score.txt";
		
		StringBuilder sb = new StringBuilder(100);
		
		//try~with~resource
		try(	FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);) {
				
				//한줄씩 데이터 읽기
				String data = "";
				while((data=br.readLine())!=null) {
					sb.append(data);
				}
				System.out.println("읽은 데이터 : "+sb.toString());
				System.out.println();
				System.out.println("번호\t이동\t국어\t영어\t수학\t총점\t평균");
				System.out.println("----------------------------------------------------");
				
				
				StringTokenizer st = new StringTokenizer(sb.toString(),"|");
				while(st.hasMoreTokens()==true) {
					String oneScore = st.nextToken();
					//System.out.println(oneScore);
					//Alice,80,90,95
					String[] onePersonScore = oneScore.split(",");
					int subTotal = 0; //개인 총점
					
					for(int i=0;i<onePersonScore.length;i++) {
						if(i>=2) {
							subTotal += Integer.valueOf(onePersonScore[i]);
						}
						
						System.out.printf("%s\t",onePersonScore[i]);
					}
					//총점
					
					System.out.printf("%s\t%4.1f",subTotal,(subTotal/3.0));
					
					System.out.println();
				}
		}catch(IOException e) {
			System.out.println("===============");
			System.out.println("=IOException="+e.getMessage());
			System.out.println("===============");
		}
	}
}