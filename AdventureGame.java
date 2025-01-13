import java.util.Scanner;
public class AdventureGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //SETTING
        boolean flag1 = false;
        int flag3 = 1;
        boolean key = false;
        boolean nuclearbomb = false;
        boolean knife = false;
        boolean base = false;
        boolean firstf = false;
        boolean secondf = false;
        int staybase = 1;
        int stayfirst = 1;
        int staysec = 1;
        int baserooms = 1;
        int secrooms = 1;
        boolean leave = false;
        boolean tinue = false;
        boolean bigkey = false;
        



        //INTRO
        System.out.println("what's your name?");
        String name = sc.nextLine();
        System.out.println("Welcome to the game, "+name + '\n');
        System.out.println("You wake up in a strange bedroom, and you hear lots of weird sounds ");
        System.out.println("Press (1) to keep sleeping, Press (2) to wake up");
        int f1= sc.nextInt();
        
        //Wake up
        if (f1 == 1){
            flag1 = false;
            System.out.println("While you are sleeping...");
            gameOver();
        }
        else if (f1 == 2){
            flag1 = true;
        }


        //BEDROOMEXPLORE
        if (flag1 == true){
            System.out.println("You see a door, do you want to (1) open the door or (2) explore the room?");
            int flag2 = sc.nextInt();
            if (flag2 == 1){
                System.out.println("The door is locked, explore the room? Press (2)");
                flag2 = sc.nextInt();
            }
            if (flag2 == 2){
                System.out.println("You see 3 drawers, press (1) to open the first one, (2) for the second one, (3) for third");
                flag3 = sc.nextInt();
            }
            
            
            //DRAWERS
            while(true){
                if (flag3==1){
                    System.out.println("You see a key, pick up? (You can only keep one item at a time)");
                    System.out.println("Press (1) to pick up, (2) to not");
                    int flagk = sc.nextInt();
                    if (flagk == 1){
                        key = true;
                        nuclearbomb = false;
                        knife = false;
                        break;
                    }else if (flagk ==2){
                        System.out.println("Open another drawer? Press the number");
                        flag3 = sc.nextInt();
                    }

                }
                if (flag3==2){
                    System.out.println("You see a nuclearbomb, pick up? (You can only keep one item at a time)");
                    System.out.println("Press (1) to pick up, (2) to not");
                    int flagn = sc.nextInt();
                    if (flagn == 1){
                        key = false;
                        nuclearbomb = true;
                        knife = false;
                        break;
                    }else if (flagn ==2){
                        System.out.println("Open another drawer? Press the number");
                        flag3 = sc.nextInt();
                    }

                }
                if (flag3==3){
                    System.out.println("You see a knife, pick up? (You can only keep one item at a time)");
                    System.out.println("Press (1) to pick up, (2) to not");
                    int flagkn = sc.nextInt();
                    if (flagkn == 1){
                        key = false;
                        nuclearbomb = false;
                        knife = true;
                        break;
                    }else if (flagkn ==2){
                        System.out.println("Open another drawer? Press the number");
                        flag3 = sc.nextInt();
                    }

                }

                
            }
            //OPENDOOR
            System.out.println("You go back to the door...");
            if (key == true && knife == false && nuclearbomb == false){
                System.out.println("Press (1) to use the key");
                int openk = sc.nextInt();
                if (openk == 1){
                    System.out.println("Oops... the key doesn't work");
                    System.out.println("The noise wake the monster up...");
                    gameOver();
                }
            }
            if (key == false && knife == false && nuclearbomb == true){
                System.out.println("Press (1) to use the nuclearbomb");
                int usen = sc.nextInt();
                if (usen == 1){
                    System.out.println("You successfully open the door, but...");
                    System.out.println("The nuclearbomb kill you as well");
                    nuclearExplosion();
                }
            }
            if (key == false && knife == true && nuclearbomb == false){
                System.out.println("Press (1) to use the knife");
                int usen = sc.nextInt();
                if (usen == 1){
                    System.out.println("You successfully destory (open) the door, but...");
                    System.out.println("The noise wake the monster up as well...");
                    
                }
            }

            //Killing Monster

            System.out.println("Your knife turns into a golden sword");
            System.out.println("Press (1) to kill the monster");
            int killmonster = sc.nextInt();
            System.out.println("The monster is dead...");
            System.out.println("          _____");
            System.out.println("         /     \\");
            System.out.println("        /       \\");
            System.out.println("       |  x   x  |");
            System.out.println("       |    ^    |");
            System.out.println("       |  \\___/  |");
            System.out.println("       \\_________/");
            System.out.println("      /           \\");
            System.out.println("     /  /|     |\\  \\");
            System.out.println("    /  / |     | \\  \\");
            System.out.println("   /  /  |     |  \\  \\");
            System.out.println("  /  /   |     |   \\  \\");
            System.out.println(" /  /    |     |    \\  \\");
            System.out.println("/__/     |_____|     \\__\\");
            System.out.println("        /       \\");
            System.out.println("       /         \\");
            System.out.println("      /           \\");


            //Part2

            System.out.println("You are now at the lobby, the door is locked...");
            System.out.println("Your sword is destroyed when you fight against the monster...");
            System.out.println("Press (0) to explore the basement, press (1) to explore first floor, and press (2) for second floor!");
            int floor = sc.nextInt();
            if (floor == 0){
                base = true;
            }
            else if (floor == 1){
                firstf = true;
            }
            else if (floor == 2){
                secondf = true;
            }
            while (leave == false){
                if (floor == 0){
                    base = true;
                    firstf = false;
                    secondf = false;
                }
                else if (floor == 1){
                    firstf = true;
                    base = false;
                    secondf = false;
                }
                else if (floor == 2){
                    secondf = true;
                    firstf= false;
                    base = false;
                }
    
                
                if (base == true && firstf==false && secondf == false){
                    System.out.println("You see 3 rooms in the basement...");
                    System.out.println("Press (1) to stay here and explore rooms, Press (2) if you want to explore other floors...");
                    staybase = sc.nextInt();
                    if (staybase == 1){
                        System.out.println("Press (1) to explore the first room, (2) for the second room, (3) for the third, (4) to go back");
                        baserooms = sc.nextInt();
                        if (baserooms == 1){
                            System.out.println("You wake another monster up...");
                            gameOver();
                            leave = true;
                        }
                        else if (baserooms == 2){
                            System.out.println("You activate a nuclear bomb by accident...");
                            nuclearExplosion();
                            leave = true;
                        }
                        else if (baserooms == 3){
                            System.out.println("You see a math homework on the desk...");
                            System.out.println("log (x+90) = 2, what is x?");
                            int answer = sc.nextInt();
                            if (answer == 10){
                                System.out.println("thank you for solving the math problem for me!!!!");
                                System.out.println("You escape this strange house and finish this game!!! Congrats");
                                thank();
                                leave = true;
                                
                            }
                            else{
                                System.out.println("You are wrong!!!");
                                System.out.println("I summon another monster to kill you");
                                gameOver();
                                leave = true;
                            }

                        }
                        else if (baserooms == 4){
                            System.out.println("Press (0) to explore the basement, press (1) to explore first floor, and press (2) for second floor!");
                            floor = sc.nextInt();
                        }
                    }
                    else if(staybase == 2){
                        System.out.println("Press (0) to explore the basement, press (1) to explore first floor, and press (2) for second floor!");
                        floor = sc.nextInt();
                    } 
                }
                if (base == false && firstf==true && secondf == false){
                    System.out.println("You see 1 room in the firstfloor...");
                    System.out.println("Press (1) to stay here and explore the only room, Press (2) if you want to explore other floors...");
                    stayfirst = sc.nextInt();
                    if (stayfirst == 1){
                        System.out.println("You see a big big big key one the floor, press (1) to pick up or (2) to explore other floors...");
                        int pickkey = sc.nextInt();
                        if (pickkey == 1){
                            bigkey = true;
                            leave = true;
                            tinue = true;
                        }
                        else if (pickkey == 2){
                            System.out.println("Press (0) to explore the basement, press (1) to explore first floor, and press (2) for second floor!");
                            floor = sc.nextInt();
                        }
                    }
                    else if(stayfirst == 2){
                        System.out.println("Press (0) to explore the basement, press (1) to explore first floor, and press (2) for second floor!");
                        floor = sc.nextInt();
                    } 
                }
                if (base == false && firstf==false && secondf == true){
                    System.out.println("You see 2 rooms in the second floor...");
                    System.out.println("Press (1) to stay here and explore the rooms, Press (2) if you want to explore other floors...");
                    staysec = sc.nextInt();
                    if (staysec == 1){
                        System.out.println("there is a trap on the second floor and you don't notice it...");
                        System.out.println("You fall from the second floor and die...");
                        System.out.println("Game over... Thank you for playing");
                        leave = true;
                    }
                    else if(staysec == 2){
                        System.out.println("Press (0) to explore the basement, press (1) to explore first floor, and press (2) for second floor!");
                        floor = sc.nextInt();
                    } 
                }
            }
                

            if (tinue == true){
                System.out.println("You go back to the door and open the door");
                System.out.println("You succesfully open the door and escape");
                System.out.println("THE END... THANK YOU FOR PLAYING");
                thank();
            }


        }
    }

    public static void gameOver() {
        System.out.println("The monster kills you... Game Over! Thank you for playing!");
        System.out.println("          _____");
        System.out.println("         /     \\");
        System.out.println("        /       \\");
        System.out.println("       |  >   <  |");
        System.out.println("       |    ^    |");
        System.out.println("       |  \\___/  |");
        System.out.println("       \\_________/");
        System.out.println("      /           \\");
        System.out.println("     /  /|     |\\  \\");
        System.out.println("    /  / |     | \\  \\");
        System.out.println("   /  /  |     |  \\  \\");
        System.out.println("  /  /   |     |   \\  \\");
        System.out.println(" /  /    |     |    \\  \\");
        System.out.println("/__/     |_____|     \\__\\");
        System.out.println("        /       \\");
        System.out.println("       /         \\");
        System.out.println("      /           \\");
        System.out.println("笑死");
        System.exit(0);
    }
    public static void nuclearExplosion() {
        System.out.println("The nuclear bomb explodes... Game Over!");
        System.out.println("      _ . - ' ' ' ' ' ' ' ' ' ' - . _ ");
        System.out.println("     . ' `   _ . . . . . . . . . _   ` ' . ");
        System.out.println("     /  _.-'`              _.-'`   \\  ");
        System.out.println("     |       _.- ' ' ' ' ' ' -._       |  ");
        System.out.println("     \\  _.-'`                  `'-._  / ");
        System.out.println("         '                         `'");
        System.out.println("          \\   \\            /   / ");
        System.out.println("          \\   \\          /   / ");
        System.out.println("          \\   `\\      /'   / ");
        System.out.println("           `\\   `\\  /'   /' ");
        System.out.println("             `\\_ . . . _/'");
        System.out.println("                 ` | | ` ");
        System.out.println("                  | | | ");
        System.out.println("                  | | | ");
        System.out.println("                  | | | ");
        System.out.println("                 |  |  | ");
        System.out.println("                 |  |  | ");
        System.out.println("                 |  |  | ");
        System.out.println("                 |  |  | ");
        System.out.println("                |   |   | ");
        System.out.println("                |   |   | ");
        System.out.println("                |   |   | ");
        System.out.println("                |   |   | ");
        System.out.println("                |   |   | ");
        System.out.println("                |   |   | ");
        System.out.println("                |   |   | ");
        System.out.println("                 |  |  | ");
        System.exit(0);
       
    }
    public static void thank() {
        System.out.println("  _______ _                 _     ");
        System.out.println(" |__   __| |               | |    ");
        System.out.println("    | |  | |__   __ _ _ __ | | __ ");
        System.out.println("    | |  | '_ \\ / _` | '_ \\| |/ / ");
        System.out.println("    | |  | | | | (_| | | | |   <  ");
        System.out.println("    |_|  |_| |_|\\__,_|_| |_|_|\\_\\ ");
        System.exit(0);
    }
}