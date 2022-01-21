package Day8;

public class SwitchStatementChallenge {
    static public void main(String[]arg){
        int option=4;
        switch (option){
            case 1:{
                System.out.println("You are happy!");
                break;
            }
            case 2:{
                System.out.println("You are sad!");
                break;
            }
            case 3: {
                System.out.println("You are angry!");
                break;
            }
            case 4: {
                System.out.println("You are suprised!");
                break;
            }
            default:
                System.out.println("Unknown emotion!");
            }
        }


    }

