import java.util.Scanner;
public class ToolKit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<size; i++){
            numbers[i]=(int)(Math.random()*101);
        }
    }
    
}
public static int maxValue (int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length(); i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

public static int minValue (int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length(); i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

