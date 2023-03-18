import java.util.Map;
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