

import java.util.Arrays;




public class dz1 {
//методы,которые надо было дописать

public static boolean isSumBetween10And20(int a, int b) {
return (a+b) >= 10 && (a+b) <= 20;
}

public static void isPositive(int x) {

System.out.println(x >= 0 ? "Positive/n" : "Negative/n");
}

public static void printWordNTimes(String source, int n){
for (int i = 1; i <= n; i++){
System.out.println("[" + i + "]" + " " + source );
}
}

private static boolean isLeapYear(int year) {
if (year % 400 == 0){
return true;
} else if (year % 100 == 0) {
return false;
} else {
return year % 4 == 0;
}
}

private static int[] createArray(int len, int initalValue) {
int arr[] = new int[len];
for (int i = 0; i < arr.length; i++)
{
arr[i] = initalValue;
}
return arr;
}

public static void printArrayInConsole(int[] inputArray) {
for (int i = 0; i < inputArray.length; i++) {
System.out.print(inputArray[i] + " ");
}
System.out.println();
}

//Задание 1

private static void invertArray(int[] arr) {
for (int i = 0; i < arr.length; i++) {
arr[i] = (arr[i] == 1) ? 0 : 1;
}
}


//Задание 2

private static void changeArray(int[] arr) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] < 6) {
arr[i] *= 2;
}
}
}

//Задание 3

private static void fillDiagonal(int[][] arr) {
for (int i = 0; i < arr.length; i++) {
for (int j = 0, z = arr.length - 1; j < arr.length; j++, z--) {
if (i == j || i == z) {
arr[i][j] = 1;
} else {
arr[i][j] = 0;
}
}
}
}

private static void printDiagonal(int[][] arr) {
for (int i = 0; i < arr.length; i++) {
System.out.print("[");
for (int j = 0; j < arr.length; j++) {
System.out.print(arr[i][j] + " ");
}
System.out.print("\b\b]");
System.out.println();
}
System.out.println();
}


public static void main(String[] args) {
System.out.println(isSumBetween10And20(5,7)+ "\n");
isPositive(5);
printWordNTimes("avra",4);
System.out.println(isLeapYear(2016));
printArrayInConsole(createArray(5,5));
System.out.println("Задание 1\n");
int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
System.out.println("Заданный массив:\t\t" + Arrays.toString(arr));
invertArray(arr);
System.out.println("Инвертированный массив:\t" + Arrays.toString(arr) + "\n");

System.out.println("Задание 3.\n");
int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
changeArray(arr3);
System.out.println("Новый массив: " + Arrays.toString(arr3) + "\n");

System.out.println("Задание 4\n");
int x = 6;
int[][] array1 = new int[x][x];
fillDiagonal(array1);
printDiagonal(array1);

}
}