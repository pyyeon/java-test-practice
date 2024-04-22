package javabasic.example06;

public class example06_01 {
    // **기본 문자열 처리 메서드 작성**
//    - **`StringUtil`** 클래스를 생성하세요. 이 클래스는 문자열 처리와 관련된 다양한 기능을 제공하는 유틸리티 메서드를 포함할 것입니다.
//    - 다음 기능을 수행하는 메서드를 **`StringUtil`** 클래스 내에 작성하세요:
//        - **`reverse`**: 하나의 **`String`**을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다.
//        - **`concat`**: 두 개의 **`String`**을 매개변수로 받아 이를 연결한 결과를 반환합니다.
//        - **`contains`**: 하나의 **`String`**과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.
    public static String reverse(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }
        return reverseString;
    }
        public static String concat (String str1, String str2){
            return str1 + str2;
        }
        public static boolean contains ( char c){

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    return true;

                }
            }
            return false;
        }
    //2. **메서드 오버로딩 실습**
//    - **`concat`** 메서드를 오버로딩하여,
//    세 개의 **`String`**을 매개변수로 받아 이를 모두 연결한 결과를 반환하는 버전을 추가하세요.
//    - **`contains`** 메서드를 오버로딩하여,
//    두 개의 **`String`**을 매개변수로 받아 첫 번째 문자열이 두 번째 문자열을 포함하는지 여부를 반환하는 버전을 추가하세요.

    public static boolean contains(String str1, String str2){
        for (int i = 0; i <= str2.length() - str1.length(); i++){
            boolean currentStringisEqual = true;
            for (int j = i; j < i + str1.length(); j++){
                if (str2.charAt(j) != str1.charAt(j-i)){
                    currentStringisEqual = false;
                }
            }
            if (currentStringisEqual) return true;
        }
        return false;
    }


}
