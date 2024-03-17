package hw.string_excertitions;

/*Создать метод, который переворачивает строку
Пример:  hello -> olleh
 */
public class Ex3 {
    public static void main(String[] args) {
        String name = "Ion";
        reverse(name);
    }

    private static void reverse(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }
    }
}
