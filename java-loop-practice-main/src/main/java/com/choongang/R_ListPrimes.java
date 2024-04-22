//
// 어려움 나중에 풀어도 됨
//
// package com.choongang;
//
//public class R_ListPrimes {
//    public String listPrimes(int num) {
//        // TODO:2 이상의 자연수를 입력받아 2부터 해당 수까지의 소수(prime number)들을 리턴해야 합니다.
//        //output = listPrimes(18);
//        //System.out.println(output); // --> '2-3-5-7-11-13-17'
//        String str = "2"; //2부터 이기 때문에
//       boolean isPrime = true;
//        for (int i = 3; i <= num; i += 2){
//            for(int j = 3; j <= (int)Math.sqrt(i); j = + 2){
//                if (i % j == 0){
//                    break;
//                }
//            }
//            //break하면 여기로 나옴. 나왔다는건 소수.
//            if (isPrime){
//                str = str + "-" + i;
//            }
//        }
//
//        return str;
//    }
//}
