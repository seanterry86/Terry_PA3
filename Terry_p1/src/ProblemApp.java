import java.security.SecureRandom;
import java.util.Scanner;

public class ProblemApp {



    public static void main(String[] args){
        SecureRandom number = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        double percentCorrect;
        int i;
        int randResponseOption;
        int probTypeInput;
        int bound;
        int numberRight = 0;
        int checker;
        int[] currentArray;

        System.out.println("Please select difficulty level:");
        System.out.println("   1 = single digit integers only");
        System.out.println("   2 = up to 2-digit integers");
        System.out.println("   3 = up to 3-digit integers");
        System.out.println("   4 = up to 4-digit integers");

        bound = levelOfDifficulty(scnr, number);


        System.out.println("Please select the problem type:");
        System.out.println("1 = addition");
        System.out.println("2 = multiplication");
        System.out.println("3 = subtraction");
        System.out.println("4 = division");
        System.out.println("5 = random problem type");

        probTypeInput = problemType(scnr);




        for (i = 0; i < 10; i++) {

            currentArray = generateQuestion(probTypeInput, bound, number);

            checker = generateResponse(probTypeInput, currentArray, number, scnr);



            if (checker == 1) {
                numberRight++;
            }



        }

        percentCorrect = (numberRight * 100)/ 10.00;

        if (percentCorrect >= 75) {
            System.out.println("Congratulations! you're ready for the next level!");
        }
        else {
            System.out.println("Please ask teacher for extra help");
        }


        System.out.print("AGAIN (Y/N) : ");  // ask the input from user
        String var= scnr.next();
        if(var.equalsIgnoreCase("Y")){// Matches "Y" or "y"
            main(null); // if input is Y then call main again.
        }

    }


    private static int problemType(Scanner scnr) {
        return scnr.nextInt();
    }

    private static int levelOfDifficulty(Scanner scnr, SecureRandom number) {
        int bound = 9;
        int difficultyLevel = scnr.nextInt();

        switch(difficultyLevel) {
            case 1:
                bound = 9;
                break;
            case 2:
                bound = 99;
                break;
            case 3:
                bound = 999;
                break;
            case 4:
                bound = 9999;
                break;

        }
        return bound;
    }

    public static int[] generateQuestion(int typeOfProblem, int bound, SecureRandom number) {
        int x;
        int y;
        int randVal;
        int array[] = {0, 0};
        x = number.nextInt(bound) + 1;
        y = number.nextInt(bound) + 1;
        if (typeOfProblem == 5) {
            randVal = number.nextInt(4) + 1;
            typeOfProblem = randVal;
        }
        switch (typeOfProblem) {
            case 1:
                AdditionProblems prob1 = new AdditionProblems();
                prob1.setX(x);
                prob1.setY(y);
                prob1.printQuestion();
                array = prob1.getArray();
                break;


            case 2:
                ProductProblems prob2 = new ProductProblems();
                prob2.setX(x);
                prob2.setY(y);
                prob2.printQuestion();
                array = prob2.getArray();
                break;


            case 3:
                SubtractionProblems prob3 = new SubtractionProblems();
                prob3.setX(x);
                prob3.setY(y);
                prob3.printQuestion();
                array = prob3.getArray();
                break;


            case 4:
                DivisionProblems prob4 = new DivisionProblems();
                prob4.setX(x);
                prob4.setY(y);
                prob4.printQuestion();
                array = prob4.getArray();
                break;



        }

        return array;
    }

    public static int generateResponse(int typeOfProblem, int[] arrayInput, SecureRandom number, Scanner scnr) {
        double answerInput;
        int randVal;
        double checker;
        int corrIndicator = 0;

        answerInput = scnr.nextDouble();
        if (typeOfProblem == 5) {
            randVal = number.nextInt();
            typeOfProblem = randVal;
        }
        switch (typeOfProblem) {
            case 1:
                checker = (double)arrayInput[0] + arrayInput[1];
                if (checker == answerInput) {
                    corrIndicator = 1;
                    printGoodResponse(number);
                } else {
                    corrIndicator = 0;
                    printBadResponse(number);
                }
                break;

            case 2:
                checker = (double)arrayInput[0] * arrayInput[1];
                if (checker == answerInput) {
                    corrIndicator = 1;
                    printGoodResponse(number);
                } else {
                    corrIndicator = 0;
                    printBadResponse(number);
                }
                break;

            case 3:
                checker = (double)arrayInput[0] - arrayInput[1];
                if (checker == answerInput) {
                    corrIndicator = 1;
                    printGoodResponse(number);
                } else {
                    corrIndicator = 0;
                    printBadResponse(number);
                }
                break;

            case 4:
                checker = (double)arrayInput[0] / (double)arrayInput[1];
                if (checker == answerInput) {
                    corrIndicator = 1;
                    printGoodResponse(number);
                } else {
                    corrIndicator = 0;
                    printBadResponse(number);
                }
                break;




        }
        return corrIndicator;
    }

    private static void printGoodResponse(SecureRandom number) {
        int inputResponseOption = 1;
        inputResponseOption = number.nextInt(4) + 1;
        switch (inputResponseOption) {
            case 1:
                System.out.println("Very good!");
                break;

            case 2:
                System.out.println("Excellent!");
                break;

            case 3:
                System.out.println("Nice Work!");
                break;

            case 4:
                System.out.println("Keep up the good work!");
                break;

        }
    }

    private static void printBadResponse(SecureRandom number) {
        int inputResponseOption = 1;
        inputResponseOption = number.nextInt(4) + 1;
        switch(inputResponseOption) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;

                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;

                case 3:
                    System.out.println("Don't give up!");
                    break;

                case 4:
                    System.out.println("No. Keep trying!");
                    break;
            }
        }
    }



