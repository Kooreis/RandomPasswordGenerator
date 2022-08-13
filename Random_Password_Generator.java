```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(generatePassword(length));
    }

    static char[] generatePassword(int len) {
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = capitalChars + smallChars + numbers + symbols;

        Random random = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
}
```