// Реализовать консольное приложение, которое:

// Принимает от пользователя строку вида text~num

// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.

// Если введено print~num, выводит строку из позиции num в связном списке.

// Если введено exit, завершаем программу

// Пример:
// string~4
// num~3
// print~3
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dz4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            try {
                String s = sc.nextLine();
                if (s.equals("exit")){
                    System.exit (1);
                }
                String[] splited = s.split("~");
                int index = Integer.parseInt(splited[1]);
                if (splited[0].equals("print")) {
                    System.out.println(list.get(index));
                }
                // System.out.println(Arrays.toString(splited));
                else {
                    while (list.size() <= index) {
                        list.add(null);
                    }
                    list.set(index, splited[0]);
                }
                System.out.println(list);
            }
            catch(ArrayIndexOutOfBoundsException  e){
                System.out.println("не понял");
            }

            }
        }
    }

