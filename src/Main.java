public class Main {
    public static void main(String[] args) {
        System.out.println(permission(13, 25));
        System.out.println(permission(46, -4));
        System.out.println(permission(23, 11));
        System.out.println(permission(18, -20));
        System.out.println(permission(10, 5));
        System.out.println();
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), -4));
        System.out.println(permission(generateRandomAge(), 11));
        System.out.println(permission(generateRandomAge(), -20));
        System.out.println(permission(generateRandomAge(), 5));
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return ((int) (Math.random() * 100));
    }
}