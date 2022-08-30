package company;

import java.util.Scanner;

public class zhaohangxinyongka1 {
    public static void ss(String s) {
        char[] array = s.toCharArray();
        int n = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] == 'C' && array[j + 1] == 'D') {
                    char t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    n++;
                }
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ss(s);


    }

}

