package set;

import java.util.*;

public class Example01 {
    public static void main(String[] args) {
        Set<String> language = new HashSet<>() {
            {
                add("Java");
                add("C");
                add("Python");
                add("Kotlin");
                add("Javascript");
                add("Dart");
            }
        };
        //  language.get()//순서가 없어서 불가능
        language.add("C#");
        language.contains("C");
        language.remove("Dart");
        language.size();
        //향상되 fo문은 인덱스 없어도 가능
        //for(하나의 요소 : 순회할 객체)
        for (String laguage : language){

        }// 매번 순서가 바뀌지 않음. 한번 넣어두면 그대로 저장됨
    }
}
