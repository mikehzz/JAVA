import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//20점
public class Ex05 {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\Exam01\\src\\score.txt";
		String[] arr=null;
		try {
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

		

		
	}
}
