import java.util.Scanner;

public class SubtractionProblems {
        private int[] subtractionArray = {0, 0};


        public int[] getArray() {
            return subtractionArray;
        }

        public void printQuestion() {
            System.out.println("How much is " + subtractionArray[0] + " minus " + subtractionArray[1] + "?");
        }

        public void setX(int valToBeSet1){
            subtractionArray[0] = valToBeSet1;
        }

        public void setY(int valToBeSet2){
            subtractionArray[1] = valToBeSet2;
        }

    }

