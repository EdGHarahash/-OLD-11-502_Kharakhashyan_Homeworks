package ru.itis.inform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FareySequenceGeneratorArrayImpl line = new FareySequenceGeneratorArrayImpl();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        line.generate(n);
        line.print();
    }
}
