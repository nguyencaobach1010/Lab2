package lab1.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] b = {5,7,11,3,9,2,6};
        Scanner s = new Scanner(System.in);
        int choice;

        SimpleSort t = new SimpleSort(b);

        t.bubbleSort();

    }
}
