import java.util.Scanner;

public class AdditionProblems {
    private int[] summationArray = {0, 0};
    private int sum = 0;

    public int[] getArray() {
        return summationArray;
    }

    public void printQuestion() {
        System.out.println("How much is " + summationArray[0] + " plus " + summationArray[1] + "?");
    }

    public void setX(int valToBeSet1) {
        summationArray[0] = valToBeSet1;
    }

    public void setY(int valToBeSet2) {
        summationArray[1] = valToBeSet2;
    }

    public double checkAnswer() {
        sum = summationArray[0] + summationArray[1];
        return sum;


    }
}
