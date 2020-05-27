public class Exercise5 {
    private static boolean isValidHexCode(String code)
    {
        if(code.length()!=7) // количество символов должно быть 7(6 на число и 1 на #)
            return false;
        if(code.charAt(0) != '#') // если нет символа # в начале, то false
            return false;
        if(code.matches("^#[1-9a-fA-F]+")) // проверяем соответствует ли код данной маске, и возвращаем true, если да
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("CD5C5C"));
    }
}
