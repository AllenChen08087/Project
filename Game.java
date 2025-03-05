import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    private ArrayList<String> players = new ArrayList<String>(); 
    private ArrayList<String> questions = new ArrayList<String>();
    // private ArrayList<String> responses = new ArrayList<String>();
    private String currentQ;


    public Game() { 
    }

    public void addPlayer(String name) {
        players.add(name); 
    }


    public void enterPlayerName(int playerNum){
        for (int i =0; i<playerNum; i++){
            System.out.println("Input Player Name: ");
            String q = scanner.nextLine();
            players.add(q);
        }
    }

    public void displayPlayerName(){
        System.out.println("Here are the players:");
        for (int i =0; i<players.size();i++){
            System.out.println((i + 1) + ". " +players.get(i));
        }
    }

    public void getQuestions() {
        boolean flag = true;
        String ans;

        while (flag == true){
            System.out.println("Enter a question now or enter no if you don't want to");
            ans = scanner.nextLine();
            if (ans.toLowerCase().equals("no")){
                for (int i =0; i<50;i++){
                    System.out.println("不要偷看別人的題目 (=￣ω￣=)");
                }
                flag = false;
            }
            else{
                questions.add(ans);
            }

        }
    }

    public void getQuestionP(){
        for(int i =0; i<players.size();i++){
            System.out.println(players.get(i) + " please enter your questions");
            getQuestions();
        }
    }

    public void displayQuestions() {
        System.out.println("Here are the questions:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }

    public void askQuestion(){
        if (questions.isEmpty()) {
            System.out.println("No more Questions!");
            return;
        }
        int ran = (int)(Math.random() * questions.size());
        currentQ = questions.get(ran);
        questions.remove(ran);
}


    public boolean checkResponse(String s){
        for (int i = 0; i < players.size(); i++){
            if (s.toLowerCase().equals (players.get(i).toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public void getResponse(){
        
        String answ;
        ArrayList <String> responses = new ArrayList<String>();

        for (int i = 0; i < players.size(); i++){
            System.out.println("It's " + players.get(i) + "'s turn!");
            System.out.println("The question is: " + currentQ);
            System.out.println("Enter your answer! (Player's name) ");
            answ = scanner.nextLine();
            while (!checkResponse (answ)){
                
                System.out.println("Invalid Response! Enter your answer again! (Player's name) ");
                answ = scanner.nextLine();
            }
            for (int k = 0; k<50; k++){
                System.out.println("不要偷看別人的答案 |'O'|");
            }

            responses.add(answ);

        }
        displayResponse(responses);
    }

    private void displayResponse(ArrayList <String> responses){
        boolean flag = false;
        for (int i = 0; i<players.size();i++){
            double counter = 0.0;
            for (int j =0; j<responses.size();j++){
                if (responses.get(j).toLowerCase().equals(players.get(i).toLowerCase())){
                    counter ++;
                }
            }
            if (counter / players.size() >= 0.75){
                System.out.println("The player who gets the most votes is " + players.get(i));
                flag = true;
            }
            

        }
        if (flag == false){
            System.out.println ("No player has more than 75% of votes");
        }
        

    }
    public int getQuestionSize(){
        return questions.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        Game likely = new Game();
        System.out.println("How many players are there?");
        int num = scanner.nextInt();
        likely.enterPlayerName(num);
        likely.displayPlayerName();
        likely.getQuestionP();
        
        for (int i = likely.getQuestionSize(); i>0; i--){
            likely.askQuestion();
            likely.getResponse();
            
            
        }
            
       
          
      

    }
}