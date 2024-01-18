public class PersonAge {

    static String getPersonAge(int age){
        if(age > 13 && age < 19)
            return "teen";
        else if(age < 13)
            return "kid";
        else
            return "adult";

    }

    public static void main(String[] args) {

        System.out.println(getPersonAge(13));
    }
}
