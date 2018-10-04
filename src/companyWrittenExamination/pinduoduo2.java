
package companyWrittenExamination;



import java.util.Scanner;



public class pinduoduo2 {

    public static void main(String[] args) {

        int a[][]=new int[100][100];

        int n;

        Scanner in=new Scanner(System.in);

        n=in.nextInt();

        int m = in.nextInt();
        m = m+1;

        //跳过这行换行符

        in.nextLine();

        for(int i=1;i<=n;i++){

            String strLine = in.nextLine();

            Scanner s = new Scanner(strLine);

            int j=0;

            while(s.hasNextInt()){

                a[i][j++]=s.nextInt()+1;

            }

        }

        //输出


//        for( int i=1;i<=n;i++){
//
//            int j=0;
//
//            while(a[i][j] !=0 )
////                    ||a[i][j] ==1||a[i][j] ==2||a[i][j] ==3||a[i][j] ==4||a[i][j] ==5||a[i][j] ==6||a[i][j] ==7||a[i][j] ==8||a[i][j] ==9 )
//
//                System.out.print(a[i][j++]+"  ");
//
//            System.out.println();
//
//        }
        int j=0;
        int max = 0;
        int aaaaaamax = 0;
        int lie = 0;
        int bb[] = new int[1000000000];
        while( a[m][j] !=0 )
        bb[j] = a[m][j++];
//        int bb[] = new int[j];
//        for (int i=0;i<j;i++){
//            bb[i] = a[m][i];
//        }
        for (int i=1;i<=n;i++) {

        }

        for(int i=1;i<=n;i++){
            for (int p=0;p<j;p++){
                if(i==m){
                    continue;
                }
                for(int k=1;k<=n;k++){
                    if(bb[p]==a[i][k]){
                        aaaaaamax++;
                        if(max<aaaaaamax){
                            max = aaaaaamax;
                            lie = i;
                        }

                    }
                }


            }

        }
        System.out.println(lie-1);



    }



}
