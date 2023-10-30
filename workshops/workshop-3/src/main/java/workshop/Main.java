package workshop;
/*
* 1-Write a Java program to check if the entered number is Armstrong number?
2-Write a Java function to print first 100 numbers in Fibonacci series?
3-Write a Java program gives character counts in a string Ex: Tobeto -> t:2, o:2, b:1, e:1
4-How to check if two Strings are anagrams of each other?
5-How to determine if the string has all unique characters.
6-Write a Java program finds first two amicable pairs. (Output: 1-> 220-284 2: 1184-1210)
7-Write a Java program finds first 10 perfect numbers.
* */

public class Main {
    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        System.out.println("Girilen sayi bir Armstrong sayi mi: " + armstrong.findArmstrongNumber(407));

        Fibonacci fibonacci = new Fibonacci();
        System.out.print("Fibonacci dizisi: ");
        fibonacci.findFirst100FibonacciNumbers(20);

        CharCount charCount = new CharCount();
        System.out.print("Girilen metnin character adetleri: ");
        charCount.characterCount("ToBetO");

        AnagramCheck anagramCheck = new AnagramCheck();
        System.out.println("Girilen metinler anagram mi: " + anagramCheck.anagramFind("tobeto", "tobeto"));

        UniqueChar uniqueChar = new UniqueChar();
        System.out.println("Girilen karakterler essiz mi: "+uniqueChar.isUniqueString("tobe"));

        AmicablePairs amicablePairs = new AmicablePairs();
        System.out.println("Amicable numbers: "+amicablePairs.findAmicable());

        PerfectNumbers perfectNumbers = new PerfectNumbers();
        System.out.print("Perfect numbers: ");
        perfectNumbers.findPerfectNumbers();

    }
}

