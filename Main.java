import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] seasons = {"autumn", "winter", "spring", "summer"} ;
        String[] months = {"january","february","march","april","may","june","july","august","september","october","november","december"};
        String[] weaks = {"mon","tue","wed","thu","fri","sat","sun"};
        int[] numbersOfMonths = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        System.out.println(Arrays.toString(seasons));
        System.out.println(Arrays.toString(months));
        System.out.println(Arrays.toString(weaks));
        System.out.println(Arrays.toString(numbersOfMonths));
        System.out.println(seasons[0]);
        System.out.println(months[8]);
    }
}