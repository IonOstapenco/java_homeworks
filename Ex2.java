package hw.string_excertitions;

/*Создать метод, который принимает StringBuilder и удаляет из него все гласные буквы
 */
public class Ex2 {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("indigenous");
        //st1.append(" O");
        //System.out.println(st1.append(" O"));
        //System.out.println(st1.reverse());
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) == 'A' || st1.charAt(i) == 'a' ||
                    st1.charAt(i) == 'E' || st1.charAt(i) == 'e' ||
                    st1.charAt(i) == 'I' || st1.charAt(i) == 'i' ||
                    st1.charAt(i) == 'O' || st1.charAt(i) == 'o' ||
                    st1.charAt(i) == 'U' || st1.charAt(i) == 'u') {
                //continue;
            } else {
                System.out.print(st1.charAt(i));
            }
        }


    }
}
