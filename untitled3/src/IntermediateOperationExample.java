


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


    public class IntermediateOperationExample {
        public static void main(String[] args) {
            // 동물들의 이름을 모아둔 리스트
            List<String> animals = Arrays.asList("Tiger", "Lion", "Monkey", "Duck", "Horse", "Cow");

            // 인자값 없는 sort() 호출
            animals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        }
    }


