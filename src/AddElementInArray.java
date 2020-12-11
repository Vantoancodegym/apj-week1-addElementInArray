import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] myArray=new int[10];
        for (int i = 0; i < 5; i++) {
            myArray[i]=i+1;
        }
        int x,value;
        System.out.println("enter position you want to add");
        x=input.nextInt();
        System.out.println("enter value");
        value=input.nextInt();
        if (x<0||x>myArray.length-1){
            System.out.println("Out of array length");
        }else {
            System.out.println(Arrays.toString(addElement(myArray,x,value)));
        }
    }
    public static int[] addElement(int[] array,int x,int n){
        for (int i = array.length-1; i >x ; i--) {
            array[i]=array[i-1];
        }
        array[x]=n;
        return array;
    }
}
