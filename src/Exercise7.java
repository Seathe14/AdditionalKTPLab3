public class Exercise7 {
    private static boolean isKaprekar(int value)
    {
        String temp = Integer.toString(value*value); // Переводим в строку квадрат числа
        int firstPart = 0;
        int secondPart = 0;
        if(temp.length()>1) // Если длина больше одного символа, то первой части присваиваем левую часть
                            // (от середины, всегда получается, что слева меньшая часть, если нечетное число цифр)
        {
            firstPart = Integer.parseInt(temp.substring(0, temp.length() / 2));
            secondPart = Integer.parseInt(temp.substring(temp.length() / 2, temp.length()));
        }
        else // Иначе первой части присваиваем ноль, а второй наше число.
        {
            firstPart = 0;
            secondPart = Integer.parseInt(temp);
        }
        if(firstPart+secondPart == value) // если сумма первой части и второй равна числу, то true
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(9));
        System.out.println(isKaprekar(6));
        System.out.println(isKaprekar(99));
        System.out.println(isKaprekar(297));
    }
}
