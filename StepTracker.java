public class StepTracker{
    private int min_step;
    private int total_step;
    private int days;
    private int activeD;
    public StepTracker(int min_step){
        this.min_step = min_step;
        this.total_step = 0;
        this.days = 0;
        this.activeD=0;
    }
    public int activeDays(){
        return (this.activeD);
    }
    public void addDailySteps(int amount){
        this.days++;
        this.total_step+=amount;
        if(amount >= this.min_step){
            this.activeD++;
        }
    }
    public double averageSteps(){
        if (this.days == 0){
            return 0.0;
        }
        else{
            return (double)this.total_step/this.days;
        }
    }
    
    
    public static void main(String[] args){

        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        
    }
   
}

    