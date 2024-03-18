package hw.string_excertitions;

/*Создать метод, который переворачивает строку
Пример:  hello -> olleh
 */
public class Ex3 {
    public static void main(String[] args) {
        String name = new String("hello");
        reverse(name);

        System.out.println(reverse(name));
    }

    private static String reverse(String name) {
        char[] bukvy = new char[name.length()];
        int bukvyIndex = 0;

        for (int i = name.length() - 1; i >= 0; i--) {
            bukvy[bukvyIndex] = name.charAt(i);
            bukvyIndex++;
        }
        String reverse = "";
        for (int i = 0; i < name.length(); i++) {
            reverse = reverse + bukvy[i];
        }
        return reverse;
    }
}
