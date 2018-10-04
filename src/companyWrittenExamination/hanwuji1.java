package companyWrittenExamination;

import java.util.Scanner;

public class hanwuji1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time12 = scanner.nextLine();
        System.out.println(resolve(time12));
    }

    private static String resolve(String time12) {
        if (time12.equals("12:00:00AM")) {
            return "00:00:00";
        }

        if (time12.equals("12:00:00PM")) {
            return "12:00:00";
        }




        char []time = time12.toCharArray();
        int len = time.length;
        if (time[len-2] == 'A') {
            return time12.substring(0,len-2);
        } else if (time[len-2] == 'P') {
            int a = Integer.valueOf(time12.substring(0,2));
            a = a + 12;

            return a+time12.substring(2,len-2);


        }
        return null;
    }
}
