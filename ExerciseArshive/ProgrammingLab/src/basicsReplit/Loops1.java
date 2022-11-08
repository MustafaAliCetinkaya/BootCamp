package basicsReplit;

public class Loops1 {
    public static void main(String[] args) {
        String[] names = {"Ali", "Fatma", "Martin", "Alex", "Nil", "Ezgi", "Joshua", "Moses"};
        //Arrayimin içinde "Mustafa" var mı yok mu bunu öğrenmek için if kalıbıyla tüm elemanları tek tek ele alarak kontrol etmem gerekir.
        //Aşağıdaki if bloğunun kalabalığını döngülerle daha kısa yapabiliyoruz.

  /*      if(names[0].equals("Mustafa")){
            System.out.println("We have this name in the array");
        }
        if(names[1].equals("Mustafa")){
            System.out.println("We have this name in the array");
        }
        if(names[2].equals("Mustafa")){
            System.out.println("We have this name in the array");
        }
        else {
            System.out.println("This array does'nt contain Mustafa");
        }*/
        int index = 0;
        while (index < names.length) {

            if (names[index].equals("Mustafa")) {
                System.out.println("\nWe have this name in the array");
            }
            index++;
        }
        System.out.println("\nThis array does'nt contain Mustafa");//Bunu döngünün içine yazarsak olmayan her durum için bu mesajı tekrar tekrar yazdırır.

    }
}



