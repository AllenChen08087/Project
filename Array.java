import java.util.ArrayList;
import java.util.Arrays;

public class Array{
    public static void reverse(int[] arr, int i){
            int w = arr[i-1];
            arr[i-1] = arr[arr.length-i];
            arr[arr.length-i] = w;
        
    }
    public static void swap(int [] arr, int first, int second){
        int w = arr[first];
        arr[first] = arr[second];
        arr[second] = w;
    }

    public static void intPrint(int [] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
    public static void stringPrint(String [] arr){
        for (String i : arr){
            
            System.out.println(i);
        }
    }

    public static double average(int [] arr){
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        return(sum/arr.length);
    }
    public static int target(int [] arr, int targetN){
        int flag = 0;
        for (int i :arr){
            if (targetN == i){
                flag++;
            }
        }
        return(flag);
    }
    public static void moveRight(int [] arr){
        int w = arr[arr.length-1];
        for (int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = w;

    }

    public static void moveLeft(int [] arr){
        if (arr.length > 0){
            int w = arr[0];
            for (int i = 0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = w;
        }
        else {
            return;
        }
        
    }
    public static void arrange(int [] arr){

    }

    public static double median(int [] arr){
        
        Arrays.sort(arr);
        if (arr.length%2==1){
           return arr[(arr.length/2)];
        }
        else{
            return (arr[arr.length/2-1] + arr[arr.length/2])/2.0;
        }
    }
    public static void printS (String [] arr){
        System.out.println(arr[1]);
    } 
    public static ArrayList<Integer> remove(ArrayList<Integer> arr, int value ){
        
        for (int i= 0; i< arr.size();i++){
    	    if (arr.get(i)>value){
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        
        //homework
       /* int [] netherlands = {4,2,6,5,3,8};
        
        moveLeft(netherlands);
        for (int i = 1; i<=netherlands.length/2;i++){
          swap(netherlands, i-1, netherlands.length-i);
        }

        for (int i = 1; i<= netherlands.length/2;i++){
            reverse(netherlands, i);
        }
        
        String [] result = {"sad","asdasd","asds"};
        printS(result);

        System.out.println(median(netherlands));*/
        ArrayList <Integer> r = new ArrayList<Integer>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(100);
        r.add(110);
        r.add(110);
        r.add(110);

        System.out.println(remove(r,50));

        if (!true){

        }
        else if(){
            
        }
    }
}