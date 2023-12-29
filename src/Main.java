import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3,8,7,7,5};
        System.out.println("Summation : " + arraySum(arr));
        System.out.println("Largest : " + showLargest(arr));
        System.out.println("5 is : " + evenOdd(5) + " and 10 is : " + evenOdd(10));
        System.out.println(countEvenOddInArray(arr));
        reverseArray(arr);
        System.out.println(showLowest(arr));
        System.out.println("Palindrome Status : " + chkPalindrome("abcba"));
        System.out.println("Linear Search : " + linearSearch(arr,5));
        System.out.println("Average : " + average(arr));
        System.out.println("Reverse String : " + reverseString("abc"));
        System.out.println(countVowelsAndConsonants("Hello"));
        pyramid();
        System.out.println(chkPrime(7));
        multiplicationTable();
        matrixAddition();
        calculateFactorial(5,1);
        System.out.print("0, 1, " );
        fibonacciSeries(0,1,5);
        System.out.println();
        System.out.println(chkLeapYear(2001));
        //secondLargest(arr);
    }

    public static int arraySum(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        return sum;
    }

    public static int showLargest(int[] array){
        int largest=0;
        for (int i=0;i<array.length;i++){
            if(array[i] > array[largest]){
                largest=i;
            }
        }
        return array[largest];
    }

    public static void secondLargest(int[] a){
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }

    public static String evenOdd(int n){
        if(n%2==0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String countEvenOddInArray(int[] array){
        int totalEven = 0;
        int totalOdd = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                totalEven++;
            } else {
                totalOdd++;
            }
        }
        return "Even : " + totalEven + " Odd : " + totalOdd;
    }

    public static void reverseArray(int[] array){
        for (int i=array.length-1;i>=0;i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int showLowest(int[] array){
        int lowest = 0;
        for (int i=0;i<array.length;i++){
            if(array[i]<array[lowest])
                lowest=i;
        }
        return array[lowest];
    }

    public static boolean chkPalindrome(String str){
        String reverse = "";
        for (int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reverse);
        if(str.equals(reverse)) return true;
        else return false;
    }

    public static boolean linearSearch(int[] array, int n){
        for (int i=0;i<array.length;i++){
            if(n==array[i]){
                return true;
            }
        }
        return false;
    }

    public static int average(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        return sum/array.length;
    }

    public static String reverseString(String str){
        String reverseString = "";
        for (int i=str.length()-1;i>=0;i--){
            reverseString=reverseString+str.charAt(i);
        }
        return reverseString;
    }

    public static String countVowelsAndConsonants(String name){
        int vowels = 0;
        int consonants = 0;
        name = name.toLowerCase();
        System.out.println(name);
        for (int i=0;i<name.length();i++){
            char currentLetter = name.charAt(i);
            if(currentLetter=='a' || currentLetter=='e' || currentLetter=='i' ||
                    currentLetter=='o' || currentLetter=='u'){
                vowels++;
            } else {
                consonants++;
            }
        }
        return "Vowels : " + vowels + " Consonants : " + consonants;
    }

    public static void pyramid(){
        int totalRow = 5;
        for (int i=1;i<=totalRow;i++){
            for (int j=1;j<=totalRow-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static String chkPrime(int n){
        if(n==0 || n==1 || n==2){
            return "0,1,2 are Prime Numbers";
        }

        int half = n/2;
        for (int i=2;i<=half;i++){
            if (n%i == 0){
                return "Not a Prime Numer";
            }
        }
        return "Prime Number";
    }

    public static void multiplicationTable(){
        for (int i=1;i<=10;i++){
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }

    public static void matrixAddition(){
        System.out.println("------------M1---------------");
        int[][] m1 = new int[5][5];
        int[][] m2 = new int[5][5];
        int[][] r = new int[5][5];
        int m1Val = 10;
        int m2Val = 10;

        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                m1Val++;
                m1[i][j] = m1Val;
            }
        }
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------M2---------------");
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                m2Val++;
                m2[i][j] = m2Val;
            }
        }
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------Result---------------");
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void calculateFactorial(int n, int f){
        if(n == 1){
            f = f*n;
            System.out.println(f);
            return;
        }

        f = f*n;
        calculateFactorial(n-1,f);
    }

    public static void fibonacciSeries(int valueOfTermBeforeThePrev, int valueOfPrevTerm, int n){
        if (n==0){
            return;
        }
        int newTermVal = valueOfTermBeforeThePrev + valueOfPrevTerm;
        System.out.print(newTermVal + ", ");
        fibonacciSeries(valueOfPrevTerm,newTermVal,n-1);
    }

    public static String chkLeapYear(int y){
        if ((y%400==0) || (y%4==0 && y%100!=0)){
            return y + " is a leap year";
        } else {
            return y + " is not a leap year";
        }
    }
}