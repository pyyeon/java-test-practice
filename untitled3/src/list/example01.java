
package list;

import java.lang.reflect.Array;
import java.util.ArrayList; //손코딩할 때 꼬고 적어야함
import java.util.Collection;
import java.util.Collections;

public class example01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>() {
            {
                add("oi");
                add("kjl");
                add("jk");
                add("java");
                add("sd");
                add("cbj");
                add("fij");


            }
        };
    //조회
//        int currentNumber = list.get(2);
        //추가
        list.add("dhfj");// 값을 추가 boolean반환
        //삭제
        list.remove(5); //조회와 삭제 동시에
        list.remove("java");
        //순회
        for (String s : list) {
            System.out.println(s); //특별히 인덱스에 접근하는게 아니며 향상된 for
        }
        //크기

}}




