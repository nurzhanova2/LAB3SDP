public class PasswordUtility {
    public static void main(String[] args) {
        PasswordGenerator strongGenerator = new StrongPasswordGenerator();
        PasswordGenerator simpleGenerator = new SimplePasswordGenerator();
        PasswordGenerator multiDigitGenerator = new MultiDigitPasswordGenerator();
        // добавленный генератор

        String strongPassword = strongGenerator.generatePassword();
        String simplePassword = simpleGenerator.generatePassword();
        String multiDigitPassword = multiDigitGenerator.generatePassword();
        // генерация многозначного пароля

        System.out.println("StrongPassword: " + strongPassword);
        System.out.println("Simple password: " + simplePassword);
        System.out.println("MultiDigit Password: " + multiDigitPassword);
        // вывод многозначного пароля
    }
}