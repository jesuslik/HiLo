import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String playAgain;
        do {
            // Генерация случайного числа, которое пользоватеь будет угадывать
            int theNumber = (int) (Math.random() * 200 - 100);
            int guess = 0;
            int numberOfTries = 0;
            while (guess != theNumber) {
                numberOfTries++;
                String tries = "\nПотребовалось " + numberOfTries +  " попыток";
                System.out.println("Угадай число от -100 до 100:");
                guess = scan.nextInt();
                if (guess < theNumber)
                    System.out.println(guess + " меньше. Попробуй ещё.");
                else if (guess > theNumber)
                    System.out.println(guess + " больше. Попробуй ещё.");
                else
                    System.out.println("Ты прав! Было загадано число: " + guess + tries);

            } // Конец цикла угадывания while
            System.out.println("Хотите сыграть ещё? (y/n)");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        scan.close();
    }
}
