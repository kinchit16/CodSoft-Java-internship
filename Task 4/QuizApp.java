import java.util.*;

class Question {
    String text;
    List<String> options;
    String correctAnswer;

    Question(String text, List<String> options, String correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    String getText() { return text; }
    List<String> getOptions() { return options; }
    String getCorrectAnswer() { return correctAnswer; }
}

public class QuizApp {
    public static void main(String[] args) {
        List<Question> quizQuestions = new ArrayList<>();
        quizQuestions.add(new Question("What is the capital of France?", Arrays.asList("Paris", "London", "Berlin", "Madrid"), "Paris"));
        // Add more questions

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question q : quizQuestions) {
            System.out.println("Question: " + q.getText());
            for (String option : q.getOptions()) {
                System.out.println(option);
            }

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                    scanner.nextLine(); // Force input to proceed
                }
            }, 10000); // 10 seconds

            String userAnswer = scanner.nextLine();
            timer.cancel();

            if (userAnswer.equals(q.getCorrectAnswer())) {
                score++;
            }
        }

        System.out.println("Quiz Over!");
        System.out.println("Your Score: " + score + "/" + quizQuestions.size());
        for (Question q : quizQuestions) {
            System.out.println("Question: " + q.getText() + " - Correct: " + q.getCorrectAnswer());
        }
    }
}