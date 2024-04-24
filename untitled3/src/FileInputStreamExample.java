import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("java.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);//BufferedInputStream이라는 보조 스트림을 사용
            int i = 0;
            while ((i = bufferedInput.read()) != -1){ //더이상 읽어올게 없을 때
                System.out.println((char)i );//하나 읽으면 출력하고. while문으로 돔 but, 버퍼쓰면 임시저장공간에 저장하고나서 출력
            }
            fileInput.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
