import java.util.Scanner;
public class rockPaperScissors
{
    public String Game(){
    Scanner userInput = new Scanner(System.in);
    String winLose = "t"; // w = win l= loss t = tie
    String input = "null";
    
    int random=0;
    String playerInput= "o";//userInput.nextLine();
    int player=0;
    boolean valid = false;
    
    boolean playRock = false;
    boolean playPaper = false;
    boolean playScissors= false;
    boolean playSpock= false;
    boolean playLizard= false;
    boolean end = false;
    int dataCheck = 0;
    while ( valid == false){
    playerInput = userInput.nextLine();
    playerInput.toLowerCase();
     playRock = playerInput.contains("rock");
     playPaper = playerInput.contains("paper");
     playScissors = playerInput.contains("scissors");
     playSpock = playerInput.contains("spock");
     playLizard = playerInput.contains("lizard");
     end = playerInput.contains("end");
     dataCheck = 0;
     if (end == true){
        System.out.println("You have left the game");
        winLose = "e";
        return winLose;
        }
     
    if (playRock == true){
    player = 0;
    valid = true;
    dataCheck++;
    } if (playPaper == true){
    player = 1;
    valid = true;
    dataCheck++;
    }
        if (playScissors == true){
    player = 2;
    valid = true;
    dataCheck++;
    } 
     if (playSpock == true){
    player = 3;
    valid = true;
    dataCheck++;
    } 
     if (playLizard == true){
    player = 4;
    valid = true;
    dataCheck++; 
    } 
    if (dataCheck <= 2) {
    System.out.println("you have not entred a valid move try again");
    valid = false;
    } else {if (dataCheck == 0 ) {
    System.out.println("you have not entred a valid move try again");
    valid = false;
    }
}
}
    
    random = (int) (Math.random()*5);
    // 0 rock, 1 paper, 2 scissors, 3 spock, 4 lizard
    switch (player) {
        case (0):
        switch (random){
            case(0):
                   System.out.println("YOU:Rock    Game:Rock \nyou have tied with the Game no score has been effected");
                    winLose = "t";
                break;
                case(1):
                    System.out.println("YOU:Rock    Game:Paper \nPaper Covers Rock\n You have lost agaisnt the game. The computer has gained a point");
                    winLose = "l";
                break;
                case(2):
                    System.out.println("YOU:Rock    Game:Scissors \nRock Smashes Scissors\nYou have won agaisnt the Game. You have gained a point");
                    winLose = "w";
                break;
                case(3):
                    System.out.println("YOU:Rock    Game:Spock \nRock Gets Vaporizes by Spock\n You have lost agaisnt the Game. The computer has gained a point");
                    winLose = "l";
                break;
                case(4):
                    System.out.println("YOU:Rock    Game:Lizard \nRock Smashes Lizard\n You have won agaisnt the Game. You have gained a point");
                    winLose = "w";
                    break;
                     default:
            System.out.println("I do not know how you got here or if you can get here but\ngame ended in a tie");
            winLose = "t";
    }
                    break;

    
    // 0 rock, 1 paper, 2 scissors, 3 spock, 4 lizard
    case(1):
        switch (random) {
            case 0: 
                System.out.println("YOU:Paper    Game:Rock \nPaper Covers Rock\nYou have won agaisnt the Game. You have gained a point");
                winLose = "w";
            break;
            case 1:
                System.out.println("YOU:Paper    Game:Paper \nyou have tied with the computer no score has been effected");
                winLose = "t";
                break;
            case 2:
                System.out.println("YOU:Paper    Game:Scissors \nScissors Cuts Paper\nYou have lost agaisnt the Game. The computer has gained a point");
                winLose = "l";
            break;
            case 3:
                System.out.println("YOU:Paper    Game:Spock \nPaper Disproves Spock\nYou have won agaisnt the Game. You have gained a point");
                winLose = "w";
            break;
            case 4:
                System.out.println("YOU:Paper    Game:Lizard \nLizard Eats Paper\n You have lost agaisnt the Game. The computer has gained a point");
                winLose = "l";
            break;
            default:
            System.out.println("I do not know how you got here or if you can get here but\ngame ended in a tie");
            winLose = "t";
    }
     break;
     case (2):
          switch (random) {
                case (0):
                        System.out.println("YOU:Scissors    Game:Rock \nRock Smashes Scissors \nYou have lost agaisnt the Game. The computer has gained a point");
                        winLose = "l";
                break;
                case(1):
                    System.out.println("YOU:Scissors    Game:Paper \nScissors Cuts paper\nYou have won agaisnt the Game. You have gained a point");
                    winLose = "w";
                break;
                case(2):
                    System.out.println("YOU:Scissors    Game:Scissors \nYou have tied with the computer no score has been effected");
                    winLose = "t";
                    break;
                case(3):
                    System.out.println("YOU:Scissors    Game:Spock \nSpock Smashes Scissors\nYou have lost agaisnt the Game. The computer has gained a point");
                    winLose = "l";
                break;
                case(4):
                    System.out.println("YOU:Scissors    Game:Lizard \nScissors Cuts Lizard\nYou have won agaisnt the Game. You have gained a point");
                    winLose = "w";
                break;
                default:
            System.out.println("I do not know how you got here or if you can get here but\ngame ended in a tie");
            winLose = "t";
    }
        break;
        case(3):
        switch (random) {
                case(0):
                    System.out.println("YOU:Spock   Game:Rock \nSpock Vaporizes Rock\nYou have won agaisnt the Game. You have gained a point");
                    winLose = "w";
                break;
                case(1):
                    System.out.println("YOU:Spock    Game:Paper \nPaper Disproves Spock\nYou have lost agaisnt the Game. The Game has gained a point");
                    winLose = "l";
                case(2):
                    System.out.println("YOU:Spock    Game:Scissors \nSpock Smashes Scissors\n You have won agaisnt the Game. You have gained a point");
                    winLose = "w";
                break;
                case(3):
                    System.out.println("YOU:Spock    Game:Spock \nYou have tied with the computer no score has been effected");
                    winLose = "t";
               break;
               case(4):
                    System.out.println("YOU:Spock    Game:Lizard \nLizard Posisons Spock\nYou have lost agaisnt the Game. The Game has gained a point");
                    winLose = "l";
                    break;
            default:
            System.out.println("I do not know how you got here or if you can get here but\ngame ended in a tie");
            winLose = "t";
    
    
    }
            break;
            case(4):
     switch (random) {
                 case(0):
                    System.out.println("YOU:Lizard   Game:Rock \nYou have lost agaisnt the Game. The Game has gained a point");
                    winLose = "l";
                break;
                case(1):
                    System.out.println("YOU:Lizard    Game:Paper \nLizard Eats Paper\nYou have lost agaisnt the Game. The Game has gained a point");
                    winLose = "w";
                break;
                case(2):
                    System.out.println("YOU:Lizard    Game:Scissors \nScissors cuts Lizard\n You have won agaisnt the Game. You have gained a point");
                    winLose = "l";
                break;
                case(3):
                    System.out.println("YOU:Lizard    Game:Spock \nLizard Posisons Spock\n Scissors Cuts Lizard\nYou have won agaisnt the Game. You have gained a point");
                    winLose = "w";
                break;
                case(4):
                    System.out.println("YOU:Lizard    Game:Lizard \nYou have tied with the computer no score has been effected");
                    winLose = "t";
                    break;
    
    }
    break;
    }
    return winLose;
    }
    
    
    public rockPaperScissors()
    {
        
     System.out.println("Welcome to rock paper scissors lizard spock based off of big bang theory\n in this verson of rock paper scissors therules go as followed");
     System.out.println("Scissors cuts paper, paper covers rock, rock smashes lizard, lizard kills spock, spock smashes scissors, scissors kills lizard, lizard eats paper, and paper disproves spock");
     System.out.println("enter what you want to play with exect spelling (upper/lowercase doesnt matter) type end to stop program\n now type what you want to play");
     int win=0;
     int lose=0;
     
    while (win < 100){
    String stringCheck = Game();
    boolean winlose = stringCheck.contains("w");
    boolean end = stringCheck.contains("e");
    if (winlose == true){
    win++;
    } else{
    lose++;}
    if(end == true){
    System.out.println("You have won "+win+" and you have lost"+lose);
    System.exit(0);
    }
    }
    Game();
}
    }

