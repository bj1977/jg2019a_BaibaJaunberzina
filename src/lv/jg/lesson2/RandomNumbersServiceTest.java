package lv.jg.lesson2;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGererator = new Random();  //typo "randomGererator"

        int  randomNumber1  = randomGererator.nextInt(101);

        System.out.println("Number1-" + randomNumber1);



        int  randomNumber2  = randomGererator.nextInt(101);

        System.out.println("Number2-" + randomNumber2);


        int  randomNumber3  = randomGererator.nextInt(101);

        System.out.println("Number3-" + randomNumber3);

        int sumNumber = randomNumber1 + randomNumber2 + randomNumber3;
        System.out.println("Randoms Sum is " + sumNumber);
    }
}



