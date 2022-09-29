package btvn;

import assignment5.News;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        News n = new News();
        Scanner sc = new Scanner(System.in);
        n.RateList = new int[]{9, 8, 10};
        System.out.println(n.AverageRate);
    }
}
