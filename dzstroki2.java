
public class dzstroki2 {


public static void main(String[] args) {

    String stroka = "";     
    int n = 10;  
    char c1 = 'a';
    char c2 = 'b';
    for (int i = 0; i < n; i++)
    {
        if (i == 0 || i % 2 == 0)
        {
            stroka += c1;
        }
        else
        {
            stroka += c2;
        }
    }
    System.out.println("Строка: " + stroka);
}

}
