import java.util.Scanner;
public class ToolKit {
    public static void main(String[] args) {
        int optionNum;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<size; i++){
            numbers[i]=(int)(Math.random()*101);
        }
        do{
            System.out.println("--Options--");
            System.out.println("1- Minimum Value\n" + "2- Maximum Value\n" + "3- Avarage\n" 
             + "4- Sum Of Odd And Even Numbers\n" + "5- Exit" );
            System.out.print("Chose Option: ");
            optionNum = sc.nextInt();
            if( optionNum == 1){
               System.out.println("The min value of this list is: " + minValue(numbers));
            }
            else if(optionNum == 2){
                System.out.println("The max value of this list is: " + maxValue(numbers));
            }
            else if(optionNum == 3){
                System.out.println("The avarage of this list is: " + average(numbers));
            }
            else if( optionNum == 4 ){
                sumOfNums(numbers);
            }
            
        }while(optionNum != 5);

        System.out.print( "Code Ended");
        sc.close();
        
    }
    
}
public static int maxValue (int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

public static int minValue (int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}
public static int average(int[] arr){
        int size=arr.length;
        int sum=0;
        for(int i=0; i<size; i++){
            sum+=arr[i];
        }
        int avg=(sum/size);
        return avg;
}

public void sumOfNums(int[] nums) {
    int sumOfOdds;
    int sumOfEvens;

     for (int i = 0; i < nums.length; i++) {
         if (i % 2 == 0) {
             sumOfEvens += nums[i];
        } else {
            sumOfOdds += nums[i];
        }
    }
    System.out.println("Sum of evens: " + sumOfEvens);
    System.out.println("Sum of odds: " + sumOfOdds);
}

       
