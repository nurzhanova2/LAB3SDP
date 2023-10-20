import java.security.SecureRandom;
interface PasswordGenerator {
    String generatePassword();
}

// класс для сложных паролей
class StrongPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+";

        String allChars = upperCase + lowerCase + digits + specialChars;
        StringBuilder password = new StringBuilder();

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 12; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }
}

// класс для простых паролей
class SimplePasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        String allChars = lowerCase + digits;
        StringBuilder password = new StringBuilder();

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }
}

// класс для многозначных паролей
class MultiDigitPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        String digits = "0123456789";
        StringBuilder password = new StringBuilder();

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 16; i++) {
            int index = random.nextInt(digits.length());
            password.append(digits.charAt(index));
        }

        return password.toString();
    }
}

