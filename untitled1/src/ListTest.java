import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<Integer> filteredList = filter(list);
        System.out.println("-".repeat(40));
        System.out.println(filteredList);
        }

        private static List<Integer> streamFilter(List<Integer> list){
       return  list.stream()
                .filter(integer -> {
                    System.out.println("숫자를 필터링합니다. integer : " + integer);
                return  integer %3 ==0;
                        //필터 만났을때 바로 일 안함.다 안 돔. 알아서 최적화해서 최소로만 진행. 범위를 줄여줌.
                })
                .map(integer -> integer * 10)
                .limit(3)
                .collect(Collectors.toList());
        }
        private  static  List<Integer> filter(List<Integer> list){
        List<Integer> result = new ArrayList<>();

        int count = 0;
        for (Integer integer : list){
            System.out.println("숫자를 필터링합니다. integer : " + integer);
        if (integer % 3 == 0){
            if (count < 3){
                result.add(integer * 10);
                count++;
            }
        }
        }
            return result;
        }
    }

