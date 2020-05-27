public class Exercise4 {
    private static String flipEndChars(String text)
    {
        if(text.length()<2) // Если меньше двух, то несовместимо
            return "Incompatible.";
        if(text.charAt(0) == text.charAt(text.length()-1)) // проверяем первый символ и последний
            return "Two's a pair.";
        char[] newString = text.toCharArray(); // создаем новый массив символов(чтобы можно было заменить символы)
        char temp = newString[text.length()-1]; // временной переменной присваиваем последний символ
        newString[text.length()-1] = newString[0]; // последнему элементу присваваем первый
        newString[0] = temp;  // первому последний
        return new String(newString); // возвращаем новую строку
    }
    public static void main(String[] args) {
        System.out.println(flipEndChars("Catc, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("adA"));
        System.out.println(flipEndChars("z"));
        System.out.println(flipEndChars("Rabuga, pintonugS"));
    }
}
