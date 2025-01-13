import java.util.ArrayList;

public class Twoarray{
    public static int  sum (int [][] array){
        int sum = 0;
        for (int i =0; i < array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static ArrayList<Integer> even (int [][] array){
        ArrayList <Integer> r = new ArrayList<Integer>();
        for (int i =0; i < array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                if (array[i][j]%2 == 0){
                    r.add(array[i][j]);
                }
            }
        }
        return r;
    }
    public static int largest (int [][] array){
        int max = Integer.MIN_VALUE;
        for (int i =0; i < array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                if( array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    public static int smallest (int [][] array){
        int min = Integer.MAX_VALUE;
        for (int i =0; i < array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                if( array[i][j]<min){
                    min = array[i][j];
                }
            }
        }
        return min;
    }
    public static boolean specific (int [][]array, int specific){
        boolean flag = false;
        for (int i =0; i < array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                if( array[i][j] == specific){
                   flag = true;
                }
            }
        }
        return flag;
    }
    public static void transpose(int [][] array){
        int [][] a = new int [array[0].length][array.length];
        for (int i =0; i < a.length;i++){
            for (int j = 0; j< a[i].length;j++){
                a[i][j] = array [j][i];
            }
        }

        //ppppppppppppppprint
        for (int x =0; x < a.length;x++){
            for (int y = 0; y< a[x].length;y++){
                System.out.println(a[x][y]);
            }
        }
    }
    public static void changeIt(int [] arr, int val, String word){
        arr = new int [5];
        val =0;
        word = word.substring(0,5);

        for (int k=0;k<arr.length;k++){
            arr[k] =0;
        }
    }
    public static void start(){
        int [] nums = {1,2,3,4,5};
        int value = 6;
        String name = "blackboard";

        changeIt(nums, value, name);
        for (int k =0; k< nums.length;k++){
            System.out.print(nums[k] + " ");
        }
        System.out.println(value + name);
    }




 public static void main(String[] args) {

    /*int [][] haha = {{1,2,3},{4,5,6},{7,8,9}};
    //System.out.println(even(haha));
    transpose(haha);
    //System.out.println(specific(haha, 9));*/
    start();
 }
}

