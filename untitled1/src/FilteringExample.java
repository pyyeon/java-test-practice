import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) throws Exception {
        List<String> names = Arrays.asList("김코딩", "이자바", "박해커", "김코딩", "박해커");

        names.stream()
                .distinct() // 중복제거
                .forEach(element -> System.out.println(element));
        System.out.println();
        names.stream()
                .filter(element -> element.startsWith("김"))
                //김씨성을 가진 요소만 필터링
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .distinct()//중복제거
                .filter(element -> element.startsWith("김")) // 김씨 성을 가진 요소만 필터링
                .forEach(element -> System.out.println(element));
    }
}


