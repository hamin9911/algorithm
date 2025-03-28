package Beakjoon;

import java.time.ZoneId;


public class LocalDate {
    public static void main(String[] args){
        java.time.LocalDate today = java.time.LocalDate.now(ZoneId.of("Asia/Seoul"));

        System.out.println(today);



    }
}
