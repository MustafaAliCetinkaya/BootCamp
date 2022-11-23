package replits;
/*Given: Mustafa Ali, Çetinkaya, 37  ===> Output: Name: Mustafa Ali Surname: Çetinkaya Age: 37 */
public class NameSurnameAge {
    public static void main(String[] args) {
        String given="Mustafa Ali, Çetinkaya, 37";
        String name, surname, age;
        name=given.substring(0,given.indexOf(","));
        surname=given.substring(given.indexOf("Ç"),given.indexOf("3")-2);
        age=given.substring(given.length()-2);

        System.out.println("Name: "+name+ " Surname: "+surname+ " Age: "+age);
        System.out.println("***************** By Using Split () Method *****************");
        String[]temp=given.split(",");
        System.out.println("Name: "+temp[0]+ " Surname: "+temp[1]+ " Age: "+temp[2]);



    }
}
