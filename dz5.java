// package ru.gb.lesson5;

// import java.util.ArrayDeque;
// import java.util.Deque;
import java.util.Map;
import java.util.Objects;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeMap;

public class dz5{

public static void main(String[] args) {
String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
collectStats(text);
}


static void collectStats(String text) {
    String[] words = text.split(" ");
    Map<Integer, List<String>> stats = new HashMap<>();
    for (String word:words){
        if (stats.containsKey(word.length()))
        {
            List<String> values = stats.get(word.length());
            values.add(word);
            stats.put(word.length(),values);
            
        }
        else {
            List<String> list1 = new ArrayList<String>();
            list1.add(word);
            stats.putIfAbsent(word.length(),list1);
           
        }
        
    }
    Map<Integer, List<String>> sortedMap = new TreeMap<>(stats); 
    sortedMap.entrySet().forEach(System.out::println); 
}

}
// System.out.println(isCorrectParentheses("()")); // true
// System.out.println(isCorrectParentheses("[()")); // false
// System.out.println(isCorrectParentheses("[()]")); // true
// System.out.println(isCorrectParentheses("{}()[]<>")); // true
// System.out.println(isCorrectParentheses("{(]])}{()}")); // false
// System.out.println(isCorrectParentheses("(()]")); // false
// System.out.println(isCorrectParentheses("](")); // false
// System.out.println(isCorrectParentheses("((((")); // false


// // ()()()((((()()(
// // ([)]

// // (((
// }

// // static boolean isCorrectParentheses(String parentheses) {
// // // считаем, что скобочки могут быть только одного типа
// // int counter = 0;
// // char[] chars = parentheses.toCharArray();
// // for (char c : chars) {
// // if (c == '(') {
// // counter++;
// // } else {
// // counter--;
// // }
// //
// // if (counter < 0) {
// // return false;
// // }
// // }
// // return counter == 0;
// // }

// static boolean isCorrectParentheses(String parentheses) {
// char[] chars = parentheses.toCharArray();
// if (chars.length % 2 != 0) {
// return false;
// }

// Map<Character, Character> dict = Map.of(
// '(', ')',
// '[', ']',
// '<', '>',
// '{', '}'
// );

// Deque<Character> symbols = new ArrayDeque<>(); // queue FIFO
// for (char c : chars) {
// if (dict.containsKey(c)) { // c - открывающаяся скобка
// symbols.add(c); // сохраняем
// } else { // c - закрывающаяся
// if (symbols.isEmpty()) {
// return false;
// }

// Character lastSymbol = symbols.pollLast(); // открывающая
// if (!Objects.equals(dict.get(lastSymbol), c)) { // Закрывающаяся для lastSymbol не совпадает с с
// return false;
// }
// }
// }

// return symbols.isEmpty();