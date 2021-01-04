package hackerRank;

import java.util.*;

// These challenges can be found on https://www.hackerrank.com/dashboard under the section "Problem Solving"
public class Main {

    //1# Solve Me First challenge
    static int solveMeFirst(int a, int b) {
        return a+b;
    }

    // 2# Simple Array Sum challenge
    static int simpleArraySum(int[] ar) {
        int sum = 0;

        for(int i = 0; i< ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }

    // 3# Compare Triplets challenge
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int bob = 0;
        int alice = 0;

        for(int i = 0; i< a.size(); i++){
            if(a.get(i)>b.get(i)){
                alice++;
            }else if(b.get(i)>a.get(i)){
                bob++;
            }
        }

        List <Integer> points = new ArrayList();
        points.add(alice);
        points.add(bob);

        return points;
    }

    // 4# A Very Big Sum Challenge
    static long aVeryBigSum(long[] ar) {
        long sum = 0L;

        for(int i = 0; i < ar.length;i++){
            sum += ar[i];
        }

        return sum;
    }

    // 5# Diagonal Difference Challenge
    public static int diagonalDifference(List<List<Integer>> arr) {

        int sum1 = 0;
        int sum2 = 0;
        int difference = 0;

        int x = arr.size()-1;
        for(int i = 0; i<arr.size(); i++){
            sum2 += arr.get(i).get(x);
            x--;
        }

        for(int i =0; i< arr.size(); i++){
            sum1 += arr.get(i).get(i);
        }

        if(sum1>sum2){
            difference = sum1-sum2;
        }else{
            difference = sum2-sum1;
        }
        return difference;
    }

    // #6 Stair Case Challenge
    static void staircase(int n) {
        int x = n -1;
        for(int i = 0; i <n; i++){
            for(int j =0; j<n; j++){
                if (j>= x){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
            x--;
        }

    }

    // #7 Sales by Match challenge
    static int count = 0;
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        ArrayList socks = new ArrayList();
        for(int i = 0; i<n; i++){
            socks.add(ar[i]);
        }
        sockCount(socks);

        return count;
    }

    static void sockCount(ArrayList socks){
        for(int i = 0; i<socks.size()-1; i++){
            for(int j = i +1; j<socks.size(); j++){
                if(socks.get(i)== socks.get(j)){
                    i = j+1;
                    j = i;
                    count++;

                }
            }
        }
    }

    // #8 Counting Valleys Challenge
    public static int countingValleys(int steps, String path) {
        int level = 0;
        int count = 0;
        for(int i =0; i < path.length(); i++ ){
            if(path.charAt(i) == 'U' ){
                level++;
            }else{
                level--;
            }
            if(level == 0 && path.charAt(i) == 'U'){
                count++;
            }
        }
        return count;
    }

    //#9 Repeated String Challenge
    static long repeatedString(String s, long n) {
        long count = 0L;
        int j = 0;
        long x = 0L;
        if(n > 1000){
            n = n / 1000;
            x = n;
        }
        for(int i = 0; i< n; i++){
            if(s.charAt(j) == 'a') {
                count++;
            }
            if(j == s.length()-1){
                j = 0;
            }else{
                j++; }
        }
        if(x > 1000){
            count *= 1000;
        }

        return count;
    }
    // #10 Jumping on Clouds Challenge
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for(int i = 0; i< c.length -1; i++){
            if(c[i] == 0)
            {
                i++;
            }
            count++;
        }
        return count;
    }

    // #11 plus Minus Challenge
    static void plusMinus(int[] arr) {
        double pos=0;
        double neg=0;
        double zero=0;
        for(int ar: arr){
            if(ar>0){
                pos++;
            }else if(ar<0){
                neg++;
            }else{
                zero++;
            }
        }
        System.out.println(pos/arr.length);
        System.out.println(neg/arr.length);
        System.out.println(zero/arr.length);
    }

// #12 Min Max Sum Challenge
    static void miniMaxSum(int[] arr) {
        long min = 0;
        long max = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        min = count(min,1,arr.length,arr);
        max = count(max,0,arr.length-1,arr);
        System.out.print(max);
        System.out.print(" ");
        System.out.print(min);
    }

    public static long count(long sum, int minSize,int maxSize,int[]arr){
        for(int i = minSize; i<maxSize; i++){
            sum+= arr[i];
        }
        return sum;
    }

    // #13 Birthday Cake Candles Challenge
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int rem = 0;
        Collections.sort(candles);
        int x = candles.get(candles.size()-1);
                for(int i = candles.size()-1; i>0; i--){
                    int y = candles.get(i);
                    if(x==y){
                        count++;
            }
        }

        int y = candles.get(0);
            if(y == x){
                rem++;
            }

        return count+rem;
    }

    // #14 Rotate Left Challenge
    static int[] rotLeft(int[] a, int d) {
        LinkedList<Integer> left = new LinkedList();
        int[] ar = new int[a.length];
        for(int i = 0; i< a.length;i++){
            left.add(a[i]);
        }

        for(int i =0; i<d;i++){
            int rotate = left.remove(0);
            left.add(rotate);
        }
        int x = 0;
        for(Integer i: left ){
            ar[x] = i;
            x++;
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
       // int[] ar = {1,2,3,4,5};
        ar =rotLeft(ar,13);
        for(int i: ar){
            System.out.print(i + " ");
        }
    }
}
