package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account A = new Account("abc123","Mui",50);
        Account B = new Account("bcd456","Ha",10);
        A.credit(20);
        A.debit(80);
        A.tranferTo(B,20);
        A.print();
        B.print();

    }
}
