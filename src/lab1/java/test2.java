package lab1.java;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        a[0] = 1;
        a[1] = 1;
        for (int i = 0; i < a.length; i++) {
            if (i < 2) {
                System.out.print(1 + " ");
            } else if (i >= 2) {
                a[i] = a[i-1] + a[i-2];
                System.out.print(a[i] + " ");
            }
        }
    }
}
//    public static int baiTap(){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int a = 1;
//        int b = 1;
//
//        for( int i = 1; i <= num; i++){
//            if( i <= 2){
//
//            }else if( i > 2 ){
//               int sum = (a+b);
//                a = b;
//                b = sum;
//                System.out.print(sum + " ");
//            }
//        }
//        return num;
//    }

