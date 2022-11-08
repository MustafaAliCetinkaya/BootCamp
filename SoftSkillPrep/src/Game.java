import java.util.Scanner;

public class Game {
    Student student;
    Lessons lessons;
    Scanner scan = new Scanner(System.in);

    public void login() {
        System.out.println("Welcome to Softskill exercise!");
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        System.out.print("Please enter your batch number: ");
        String batchNumber = scan.next();
        System.out.println();

        student = new Student(name);
        start();
    }

        public void start () {
            while (true) {
                System.out.println("=============================================");
                System.out.println();
                System.out.println("Please select the topic that you want to study: ");
                System.out.println("1. Softskill Keywords");
                System.out.println("2. SDLC");
                System.out.println("3. Software Testing Intro");
                System.out.println("4. White-Black_Gray Box Testing");
                System.out.println("5. Testing Level:Unit,Integration,System,UAT");
                System.out.println("6. Software Method: Waterfall,Agile");
                System.out.println("7. Agile-Scrum,Sprint,PI,ST,US,AC,PB");
                System.out.println("8. Grooming Meeting,Point Estimation");
                System.out.println("9. Sprint Planning");
                System.out.println("10. Daily Stand-up ,Retro Meeting");
                System.out.println("11. Exit");
                System.out.println();
                System.out.print("Your choice: ");
                int topicNumber = scan.nextInt();
                while (topicNumber < 1 || topicNumber >11 ) {
                    System.out.println("Invalid entry.Please try again.");
                    topicNumber = scan.nextInt();
                }
                switch (topicNumber) {
                    case 1:
                        lessons = new day1(student);
                        break;

                    case 2:
                        lessons = new day2(student);
                        break;
                    case 3:
                        lessons = new day3(student);
                        break;
                    case 4:
                        lessons = new day4(student);
                        break;
                    case 5:
                        lessons = new day5(student);
                        break;
                    case 6:
                        lessons = new day6(student);
                        break;
                    case 7:
                        lessons = new day7(student);
                        break;
                    case 8:
                        lessons = new day8(student);
                        break;
                    case 9:
                        lessons = new day9(student);
                        break;
                    case 10:
                        lessons = new day10(student);
                        break;

                    case 11:
                        System.out.println("Nice job "+ student.getName()+"! Come back to study soon!");
                        System.exit(0);
                        break;
                    default:lessons = new day1(student);
                }
                if (!lessons.getLesson()){
                    System.out.println("Exercise is over!");
                break;
                }




            }
        }


    }

