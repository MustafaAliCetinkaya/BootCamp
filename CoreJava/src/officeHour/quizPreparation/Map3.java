package officeHour.quizPreparation;

import java.util.HashMap;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        Map<Character, String> connect = new HashMap<>();
        connect.put('a', "a"); connect.put('c', "C"); connect.put('z', null); connect.put('y', "yz"); connect.put('y', connect.get('c'));
        System.out.print(connect.get('z') + connect.get('y') + connect.get('a'));
    }
}
