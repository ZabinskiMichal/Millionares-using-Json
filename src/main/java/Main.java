import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question question1 = new Question("Which of the cointries have the biggest population?", "A - Poland", "B - Brasil", "C - India", "D - China", "D");
        Question question2 = new Question("Jak powiedziec który po angielsku?", "A - Który", "B - Bury", "C - Which", "D - Witch", "C");
        ArrayList<Question> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        questions.add(question1);
        questions.add(question2);

        for (Question task : questions) {
            System.out.println(task.getQuestion());

            System.out.println(task.getAnswerA());
            System.out.println(task.getAnswerB());
            System.out.println(task.getAnswerC());
            System.out.println(task.getAnswerD());

            System.out.println();
            System.out.println("Choose correct answer");

            String input = scanner.nextLine();
            input = input.toUpperCase();
            
            if(input.equals(task.getCorrectAnswer())){
                System.out.println("Good choice, you get a point");
                score++;
            }else{
                System.out.println("Fortunately:(");
            }

        }
    }
}