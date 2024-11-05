class Exam {
    private String message;
    private double price;
    private boolean status;

    public Exam() {
        this.message = "Good luck";
    }

    public Exam(String period, String level) {
    }

    public double getPrice() {
        return price;
    }

    public boolean isFinished() {
        return status;
    }
}

class Midterm extends Exam {
    
    public Midterm() {
        super(); 
        System.out.println("Exam has started.");
    }
}

class Essay extends Midterm {
}

class Quiz {
}


class QuizEssay extends Quiz {
   
}


public class Main {
    public static void main(String[] args) {
      
        Midterm midterm = new Midterm();
        Essay essay = new Essay();
        Quiz quiz = new Quiz();
        QuizEssay quizEssay = new QuizEssay();
    }
}