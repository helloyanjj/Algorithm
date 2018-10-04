package jianzhiOffer;



public class tihuankongge {
    public static void main(String[] args) {

        System.out.println(resolve("We Are Happy."));
    }

    public static StringBuffer resolve(String string) {
        StringBuffer str = new StringBuffer(string);
        int len = string.length();
        char[] a = string.toCharArray();
        for (int i=0;i<len;i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i,i+1, "%20");
            }
        }

        return str;
    }
}
