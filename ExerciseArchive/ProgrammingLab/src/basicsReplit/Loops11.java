package basicsReplit;

public class Loops11 {
    public static void main(String[] args) {
        String [] array={"ayşe", "fatma", "hayriye", "haydi","ayşe", "çifte", "telliye", "hayriye", "ayşe", "başı", "dönmez", "elliye", "ayşe",};
        String empty="";//Boş stringe yukarıda tekrar eden isimleri birer defa yazdıracağız.

        for (int i=0;i<array.length;i++){
            if (!empty.contains(array[i])){//Baştaki ünlem işaretiyle içermiyorsa şartı koşarız. Her elemandan birer tane bulunacak şekilde elemanları yazdırı.
                int howMuch=1;
                for(int j=i+1;j<array.length;j++){//i+1 demek ayşeden başlayıp ayşeyi kendisinden sonrakilerle karşılaştırmak demektir.
                    if(array[i].equals(array[j])){
                        howMuch++;
                    }
                }
                System.out.println(array[i]+"\t: "+"is written "+howMuch+" times");
                empty+=array[i];
            }
        }
    }
}
