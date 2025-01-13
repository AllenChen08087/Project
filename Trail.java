public class Trail{
    private static int [] markers = {100,150,105,120,90,80,50,75,75,70,80,90,100};
    public static boolean isLevelTrailSegment (int start, int end){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = start ; i<= end; i++){
            if (markers[i] < min){
                min = markers[i];
            }
            else if (markers[i] > max){
                max = markers [i];
            }
        }
        return (max-min) <= 10;
    }

    public static boolean isDifficult(){
        int count = 0;
        for (int i = 0; i< markers.length-2; i++){
            if (Math.abs(markers[i]-markers[i+1])>=30){
                count ++;
            }
        }
        return count >= 3;
    }
        
       
    
    public static void main(String[] args) {
        System.out.println(isLevelTrailSegment(7,10));
        System.out.println(isDifficult());
    }
}
