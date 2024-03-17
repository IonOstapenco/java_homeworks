package hw.string_excertitions;

/*Создать метод, который принимает 2 строки, переводит  их в UPPER CASE и возвращает их конкатенацию
 */
public class Ex1 {
    public static void main(String[] args) {
        String st1 = "Software";
        String st2 = "Developing";
        toUP(st1, st2);

    }

    private static String toUP(String st1, String st2) {
        String st3 = st1.toUpperCase()+st2.toUpperCase();
        System.out.println(st3);
        return st3;
    }
}
