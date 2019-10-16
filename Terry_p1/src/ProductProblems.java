import java.util.Scanner;

public class ProductProblems {
        private int[] multiplicationArray = {0, 0};
        private int product = 0;


        public int[] getArray() {
            return multiplicationArray;
        }

        public void printQuestion() {
            System.out.println("How much is " + multiplicationArray[0] + " times " + multiplicationArray[1] + "?");
        }

        public void setX(int valToBeSet1){
            multiplicationArray[0] = valToBeSet1;
        }

        public void setY(int valToBeSet2){
            multiplicationArray[1] = valToBeSet2;
        }


        public void checkAnswer() {
            product = multiplicationArray[0] * multiplicationArray[1];



    }

}
