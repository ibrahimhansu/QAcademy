package week2;
import java.util.Random;

public class Dice {
    public static void main(String[] args){

        System.out.println("rolling the dice");
        Random random = new Random();
        int rolledNumber = random.nextInt(6) + 1;
        int bank= 0;

        while(rolledNumber != 1 && rolledNumber != 2) {
            while(rolledNumber==3){
                System.out.println("nothing, rolling again");
                rolledNumber = random.nextInt(6) + 1;
            }
            if(rolledNumber==1 || rolledNumber==2){
                break;
            }
            else{
                bank =bank+rolledNumber;
                System.out.println("you earned " + rolledNumber);
                System.out.println("rolling again");
                rolledNumber = random.nextInt(6) + 1;
            }
            if(bank>=50){
                bank=50;
                break;
            }
        }
        System.out.println("Last roll:"+rolledNumber+", Game over, total earnings:" + bank);
    }
    }
