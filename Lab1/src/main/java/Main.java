

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        String []strs = {"hello!how are you","Hey","Lab 1"};

        System.out.println("Массив рядків ");
        System.out.println(Arrays.toString(strs));
        System.out.println("Середня довжина рядків : " + Main.averageLengthOfString(strs));
        System.out.println("Рядки,які менші за середню довжину : " + Arrays.toString(  Main.strWithLengthLessThanAvg(strs)));
        System.out.println("Рядки,які більші за середню довжину : " + Arrays.toString(Main.strWithLengthGreaterThanAvg(strs)));


    }

    //метод , який знаходить рядки з меншою довжиною за середню
    public static String[] strWithLengthLessThanAvg(String[] str) {
        List<String> result= new ArrayList<>();
        for (int i = 0; i <str.length; i++) {
            if (str[i].length()<averageLengthOfString(str)){ //провіряємо чи даний рядок має меншу довжину за середню
                result.add(str[i]);//додаємо у ліст
            }
        }

        String[] resultArray = new String[result.size()];
        return result.toArray(resultArray);//повертаємо масив


    }

    public static String[] strWithLengthGreaterThanAvg(String[] str) {
        List<String> result= new ArrayList<>();
        for (int i = 0; i <str.length; i++) {
            if (str[i].length()>averageLengthOfString(str)){//провіряємо чи даний рядок має більшу  довжину за середню
                result.add(str[i]);
            }
        }
        String[] resultArray = new String[result.size()];
        return result.toArray(resultArray);
    }

    //метод вираховує середню довжину всіх рядків массиву
    public  static int averageLengthOfString(String[] str) {

        int countOfStrings=str.length;//вираховуємо кількість рядків
        int generalSum = 0;
        for (int i = 0; i < str.length; i++) {
            generalSum = generalSum + str[i].length();//додаємо довжини всіх рядків
        }
        return generalSum / countOfStrings;//повертаємо середню довжину

    }



}
