// package chapter3;
//
// import java.util.Arrays;
// import java.util.List;
// import java.util.function.Consumer;
// import java.util.function.Predicate;
// import java.util.stream.IntStream;
//
// class MyStr {
//     private Long count;
//     private String str;
//
//     public MyStr(Long count, String str) {
//         this.count = count;
//         this.str = str;
//     }
// }
//
// // public Integer getLowCharNums(String str){
//
// // }
//
// public class Test7 {
//
//
//     public static void main(String[] args) {
//
//         Consumer<MyStr> s1 =
//                  String str -> {
//             long count = str.chars().filter(ch -> ch > 97).count();
//             MyStr mystr = new MyStr(count, str);
//             return mystr;
//             //  str.chars().filter(ch -> ch > 97);
//         };
//
//                 // Predicate<Integer> s = str -> str > 1;
//
//         String s = "";
//         IntStream t = s.chars().filter(ch -> ch > 97);
//
//         List<String> str1 = Arrays.asList("abc", "ab", "AAAAAAAAA", "ACBaaa", "aaaa");
//         List<String> str2 = Arrays.asList();
//
//
//
//         str1.stream().map(str -> {
//
//                 }
//         ).max();
//
//
//     }
//
// }
