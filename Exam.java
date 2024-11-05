public class Exam {
    private String message;
    private String studentPeriod;
    private String studentLevel;
    private double price;
    private boolean isFinished;
    
    // Default Constructor
    Exam() {
        this.message = "Good luck";
    }
    
    // Overloaded Constructor
    Exam(String period, String level) {
        this.studentPeriod = period;
        this.studentLevel = level;
    }
    
    // Method to set the price and return it
    public double setPrice(double price) {
        this.price = price;
        return this.price;
    }
    
    // Method to set the finished status and return it
    public boolean setIsFinished(boolean finish) {
        this.isFinished = finish;
        return this.isFinished;
    }

    public static void main(String[] args) {
        // Create an instance of Quiz to see the output
        Quiz quiz = new Quiz();
        boolean studentStatus = false;
        double tuitionFee = 10000;

        // Setting values using setters
        quiz.setIsFinished(studentStatus);
        quiz.setPrice(tuitionFee);
    }
}

class Midterm extends Exam {
    // Constructor that calls the parent class constructor
    Midterm() {
        super();
        System.out.println("Exam has started.");
    }
}

class Essay extends Midterm {
    // Constructor that calls the parent class constructor
    Essay() {
        super();
        System.out.println("Essay has started.");
    }
}

class Quiz extends Essay {
    // Constructor that calls the parent class constructor
    Quiz() {
        super();
        System.out.println("Quiz has started.");
    }
}
