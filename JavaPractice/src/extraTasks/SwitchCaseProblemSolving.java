package extraTasks;

import java.util.Scanner;

public class SwitchCaseProblemSolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("George Polya, known as the father of modern problem solving, did extensive studies and wrote numerous mathematical papers and three books about problem solving." +
                "\nI'm going to show you his method of problem solving to help step you through these problems." +
                "\n\nPlease select the step you want to learn:");
        System.out.println("Step 1: Understand the problem.\nStep 2:  Devise a plan (Translate).\nStep 3:  Carry out the plan (solve).\nStep 4:  Look back (Check and Interpret).");
        int step = input.nextInt();
        String result;

        switch (step) {
            case 1:
                result = "Sometimes the problem lies in understanding the problem.  If you are unclear as to what needs to be solved, then you are probably going to get the wrong results.  In order to show an understanding of the problem, you, of course, need to read the problem carefully.  Sounds simple enough, but some people jump the gun and try to start solving the problem before they have read the whole problem.  Once the problem is read, you need to list all the components and data that are involved. This is where you will be assigning your variable.";
                break;
            case 2:
                result = "\n" +
                        "When you devise a plan (translate), you come up with a way to solve the problem.  Setting up an equation, drawing a diagram, and making a chart are all ways that you can go about solving your problem.";
                break;
            case 3:
                result = "\n" +
                        "The next step, carry out the plan (solve), is big. This is where you solve the equation you came up with in your 'devise a plan' step.";
                break;
            case 4:
                result = "You may be familiar with the expression 'don't look back'.  In problem solving it is good to look back (check and interpret)..  Basically, check to see if you used all your information and that the answer makes sense.  If your answer does check out, make sure that you write your final answer with the correct labeling.";
                break;

            default:
                result="Your choice is invalid. Please try again";
                    break;
        }
        System.out.println(result);

    }
}
