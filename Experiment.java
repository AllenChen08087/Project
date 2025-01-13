public class Experiment{
    private static int [] rateTable = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};

    public static int getChargingCost (int startHour, int chargeTime){
            int cost = 0;
            int i = startHour;
            while (i<startHour+chargeTime){
                cost += rateTable[i%24];
                i++;
            }
            
            return cost;
        }
        public static int getChargeStartTime(int chargeTime){
                int startHour = 0;
                for (int i = 0; i<rateTable.length; i++){
                    if (getChargingCost(i, chargeTime) < getChargingCost(startHour, chargeTime)){
                    startHour = i;
                }        
            }
            return startHour;
        }
        
       
    
        public static void main(String[] args) {
            System.out.println(getChargingCost(22,30));
            System.out.println(getChargeStartTime(30));
    }
}
