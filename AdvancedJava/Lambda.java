@FunctionalInterface
interface Sayable{
    String say(String message);
}

public class Lambda {
    public static void main(String[] args) {
        Sayable person =(message) ->{
            String s1 = "Ritik";
            String s2 = s1+ message;
            return s2;

        };
        System.out.println(person.say(" Bhati")); 
      }
}
