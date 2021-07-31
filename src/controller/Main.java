package controller;

public class Main {
    public static void main(String[] args) {
        String a = "";
        int count = 0;
        for (int i = 0; i < 500; i++) {
            a+=i;
        }
        System.out.println(a);
        System.out.println("leng"+ a.length());

        char[] result = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (result[i] == '8'){
                count++;
                System.out.println(count);
            }
        }
    }
}
