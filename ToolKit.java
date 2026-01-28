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
