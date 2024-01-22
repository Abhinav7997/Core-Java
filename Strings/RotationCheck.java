public class RotationCheck {
    public static void main(String[] args) {

        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        if (isRotation(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}