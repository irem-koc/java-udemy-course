package QuizConsoleApp;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "what is your name", "irem", "irem", "geri", "seri", "feri");
        questions[1] = new Question(2, "what is your age", "22", "33", "22", "11", "111");
        questions[2] = new Question(3, "what is your job", "developer", "d", "gersi", "sersi", "fesri");
        questions[3] = new Question(4, "what is your height", "168", "168", "111", "122", "122");
        questions[4] = new Question(5, "what is your weight", "59", "22", "122", "59", "222");
    }

    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println("Question no: " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println( question.getOption1());
            System.out.println( question.getOption2());
            System.out.println( question.getOption3());
            System.out.println( question.getOption4());
            Scanner scanner = new Scanner(System.in);
            selections[i]=scanner.nextLine();
            i++;
//            System.out.println(question.getOption1()); //with only this line we got java.lang.NullPointerException because questins is the reference so we should intialize the object
        }
        for (String selection : selections) {
            System.out.println(selection);
        }
    }
    public void printScore(){
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            String selection = selections[i];
            if(question.getAnswer().equals(selection)){
                score++;
            }
        }
        System.out.println(score+" is the score");
    }
}
