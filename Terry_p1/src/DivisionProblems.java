import java.util.Scanner;

public class DivisionProblems {
        private int[] divisionArray = {0, 0};
        private int quotient = 0;


        public int[] getArray() {
            return divisionArray;
        }

        public void printQuestion() {
            System.out.println("How much is " + divisionArray[0] + " divided by " + divisionArray[1] + "?");
        }

        public void setX(int valToBeSet1){
            divisionArray[0] = valToBeSet1;
        }

        public void setY(int valToBeSet2){
            divisionArray[1] = valToBeSet2;
        }


    }
