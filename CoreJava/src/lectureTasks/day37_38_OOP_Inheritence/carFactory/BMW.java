package lectureTasks.day37_38_OOP_Inheritence.carFactory;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " "+ model +" is breaking down");
    }

    public void racing(){
        System.out.println(brand + " "+ model +" is a racing car");
    }


    public void start(){
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }


}

/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */
