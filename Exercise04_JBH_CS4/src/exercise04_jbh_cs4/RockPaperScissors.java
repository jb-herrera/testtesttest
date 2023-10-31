package exercise04_jbh_cs4;

import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
                
                int roundsToWin = 2;
                int humanScore = 0 , computerScore = 0;
                
                int optionMain = 0;
		
                while (optionMain != 3){
                    
                humanScore = 0;
                computerScore = 0;
                
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit application");
                System.out.print("> ");
                
                optionMain = sc.nextInt();
                
                switch(optionMain){
                    case 1:
                        int random;
                        int playerMove;
                        int result = 0;
                        System.out.println("This match will be first to " + roundsToWin + " wins");
                        while(true){
                            random = (int) Math.floor(Math.random()*3) + 1;
                            
                            System.out.println("The computer has selected its move. Select your move:");
                            System.out.println("1. Rock");
                            System.out.println("2. Paper");
                            System.out.println("3. Scissors");
                            System.out.print("> ");
                            
                            playerMove = sc.nextInt();
                            
                            switch (playerMove){
                                case 1:
                                    switch (random){
                                        case 1:
                                            result = rock.compareMoves(rock,rock);
                                            break;
                                        case 2:
                                            result = rock.compareMoves(rock,paper);
                                            break;
                                        case 3:
                                            result = rock.compareMoves(rock,scissors);
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (random){
                                        case 1:
                                            result = rock.compareMoves(paper,rock);
                                            break;
                                        case 2:
                                            result = rock.compareMoves(paper,paper);
                                            break;
                                        case 3:
                                            result = rock.compareMoves(paper,scissors);
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                case 3:
                                    switch (random){
                                        case 1:
                                            result = rock.compareMoves(scissors,rock);
                                            break;
                                        case 2:
                                            result = rock.compareMoves(scissors,paper);
                                            break;
                                        case 3:
                                            result = rock.compareMoves(scissors,scissors);
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid Input");
                                    break;
                            }
                            
                            switch (result){
                                case 0:
                                    switch (playerMove){
                                        case 1:
                                            System.out.println("Player chose Rock, Computer chose Scissors = Player Wins!");
                                            humanScore += 1;
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        case 2:
                                            System.out.println("Player chose Paper, Computer chose Rock = Player Wins!");
                                            humanScore += 1;
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        case 3:
                                            System.out.println("Player chose Scissors, Computer chose Paper = Player Wins!");
                                            humanScore += 1;
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (playerMove){
                                        case 1:
                                            System.out.println("Player chose Rock, Computer chose Paper = Computer Wins!");
                                            computerScore += 1;
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        case 2:
                                            System.out.println("Player chose Paper, Computer chose Scissors = Computer Wins!");
                                            computerScore += 1;
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        case 3:
                                            System.out.println("Player chose Scissors, Computer chose Rock = Computer Wins!");
                                            computerScore += 1;
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (playerMove){
                                        case 1:
                                            System.out.println("Player chose Rock, Computer chose Rock = It's a Draw");
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        case 2:
                                            System.out.println("Player chose Paper, Computer chose Paper = It's a Draw");
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        case 3:
                                            System.out.println("Player chose Scissors, Computer chose Scissors = It's a Draw");
                                            System.out.println("Player: " + humanScore + " <---> " + "Computer: " + computerScore);
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                            }
                            
                            if (humanScore == roundsToWin){
                                System.out.println("Human Wins!");
                                break;
                            } else if (computerScore == roundsToWin){
                                System.out.println("Computer Wins!");
                                break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("How many rounds to win?: ");
                        System.out.print("> ");
                        roundsToWin = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Bye!");
                       break; 
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                }
	}
}
