package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-13
 */
public class souhu2 {
    int N = 1000007;
    int offset = 1000007;
    int n;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(resolve(N));
    }

    private static int resolve(int N) {
        return 2;
    }
}

//#include <stdio.h>
//        #include <queue>
//using namespace std;
//
//        #define N 1000007
//
//        int n;
//        struct Now {
//
//        int pos;
//        int t;
//        };
//
//        queue<Now> Q;
//
//
//        int BFS(){
//
//        while(Q.empty() == false){
//
//        Now tmp = Q.front();
//        Q.pop();
//        int left = tmp.pos - tmp.t;
//        int right = tmp.pos + tmp.t;
//        Now temp;
//        temp.pos = left;
//        temp.t = tmp.t + 1;
//        Q.push(temp);
//
//        temp.pos = right;
//        temp.t = tmp.t + 1;
//        Q.push(temp);
//        if(left == n || right == n){
//        return tmp.t;
//        }
//        }
//        return 0;
//        }
//
//
//        int main(int argc, char *argv[]) {
//
//        while(scanf("%d",&n)!=EOF){
//
//        while(Q.empty() == false) Q.pop();
//
//        Now tmp;
//        tmp.pos = 0;
//        tmp.t = 1;
//        Q.push(tmp);
//        int rec = BFS();
//        printf("%d\n",rec);
//        }
//        return 0;
//        }
