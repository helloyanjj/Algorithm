package company;

public class wangyi1_1 {

    public static void ss(int n, int[] a, int m, int[] q) {
        int[] answer = new int[m];

        for (int i = 0; i < m; i++) {
            int qq = q[i];
            int j = 0;
//            int [] b = new int[n];
//            for (int w=0;w<n;w++){
//                b[w] = a[w];
//            }
            int[] b = a.clone();

            while (qq > b[j]) {
                j++;
                b[j] = b[j - 1] + b[j];

            }
            answer[i] = j + 1;

        }

        for (int i = 0; i < m; i++) {
            System.out.println(answer[i]);

        }


    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        int []a = new int[N];
//        for (int i=0;i<N;i++) {
//            a[i] = scanner.nextInt();
//        }
//
//        int M = scanner.nextInt();
//        int []q = new int[M];
//        for (int i=0;i<M;i++) {
//            q[i] = scanner.nextInt();
//        }
//        wangyi1.ss(N,a,M,q);
        Integer i = 1;
        Integer j = 2;

        System.out.println(i.compareTo(j) < 0);


    }


}
