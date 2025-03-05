public class Recursion{

    public Recursion(){};

    public int fibonacci (int n ){
        if (n == 1){
            return 1;
        }
        if (n == 0){
            return 0;
        }

        return fibonacci (n-1) + fibonacci (n-2);
    }
    public int sumArr (int [] arr, int n){
        
        if (n < 0){
            return 0;
        }
        if (n == 0){
            return arr[0];
        }

        return arr[n] + sumArr(arr, n-1);
    }
    public int factorial (int n){
        if ( n == 0){
            return 1;
        }
        return n * factorial (n-1); 
    }
    
    public int sum (int n){
        if (n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Recursion h = new Recursion();
        //System.out.println(h.fibonacci(30));
        int [] array = {1,2,3,4,5};
        //System.out.println(h.sumArr(array, 3));
        //System.out.println(h.factorial(7));
        System.out.println(h.sum(5));
    }
}