package com.codewars;


public class PersistentBugger {
    public static int persistence(long n) {
        long result = 1;
        int count = 1;
        if(n<10){
            result = n;
            count = 0;
            return count;
        }
        while(n>0){
            long first = n%10;
            result *=first;
            n = (n - first)/10;
            if(result>=10&&n==0){
                n = result;
                result = 1;
                count++;

            }
        }


        System.out.println(result);
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        persistence(25);
    }
}
