package Reviews;

public class CappuccinoBuyer {

    public static void main(String[] args) {
        int month = 12;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";

            case 9:  monthString = "September";

            case 10: monthString = "October";

            default: monthString = "Invalid month";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";



        }
        System.out.println(monthString);


    }

}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:
						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"
 */
