import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static void main(String[] args) {
        print1To255();
        printOdd1To255();
        printSum();
        iterateArray();
        findMax();
        getAvg();
        createOddArray();
        greaterThanY(3);
        sqValues();
        eliminateNegatives();
        maxMinAvg();
        shiftingArrays();
    }

    public static void print1To255() {
        for(int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public static void printOdd1To255() {
        for(int i = 1; i <= 255; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + String.valueOf(i) + " Sum: " + String.valueOf(sum));
        }
    }

    public static void iterateArray() {
        int[] arr = {1, 3, 5, 7, 9, 13};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void findMax() {
        int[] arr = {-3, 5, -2};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void getAvg() {
        int[] arr = {1,3,5,7};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }

    public static void createOddArray() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++) {
            if(i % 2 != 0) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }

    public static void greaterThanY(int Y) {
        int[] arr = {1,3,5,7};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > Y) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void sqValues() {
        int[] arr = {1, 5, 10, -2};
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void eliminateNegatives() {
        int[] arr = {1,-5,10,-2};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void maxMinAvg() {
        int[] arr = {1,5,10,-2};
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum / arr.length;
        newArr.add(max);
        newArr.add(min);
        newArr.add(avg);    
        System.out.println(newArr);
    }

    public static void shiftingArrays() {
        int[] arr  = {1,5,10,7,-2};
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}