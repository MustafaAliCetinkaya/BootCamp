package w3Resources;

public class ForLoop{
    public static void main(String[] args) {
        for (int i=1;i<=2;i++){
            for (int j=1;j<=3;j++){
                for (int k=1;k<=4;k++){
                    System.out.print("*");
                    System.out.print("!");
                }
            }
            System.out.println();
        }

        System.out.println("+----+");
        for (int i=1;i<=3;i++){
            System.out.println("\\          /");
            System.out.println("/          \\");
        }
        System.out.println("+----+");

        int total=25;
        for (int a=1;a<=(total/2);a++){
            total=total-a;
            System.out.println(total+" "+a);
        }
    }

}
