import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class dz3 {
    public static List<Integer> removeOddNumbers(List<Integer> list) {
        list.removeIf(i -> i % 2 != 0);
        return list;
    }

   
    public static void deleteNumbers(List<String> source) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            try {
                int element = Integer.parseInt(source.get(i));
                if (true) {
                    source.remove(i);
                    i--;
                }
            } catch (NumberFormatException e) {
                stringList.add(source.get(i));
            }
        }
        System.out.println(stringList);
    }

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        list.removeIf(i -> i % 2 != 0);
        System.out.println(removeOddNumbers(list));
        ArrayList<String> list1 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        deleteNumbers(list1);
        
    }

}