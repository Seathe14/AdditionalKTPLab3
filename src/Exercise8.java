public class Exercise8 {
    private static String longestZero(String binaryCode)
    {
        if(binaryCode.matches("^[01]+"))
        {
            String maximumAmount = ""; // для подсчета максимальной длины последовательности нулей
            String result = ""; // результирующая строка
            for(int i =0;i<binaryCode.length();i++) // идем по массиву символов в двоичной строке
            {
                for(int j = i+1;j<binaryCode.length();j++) // проверяем следующий символ, если он 0, добавляем к счетчику
                {
                    char ch = binaryCode.charAt(j);
                    if(ch != '0')
                        break;
                    maximumAmount += ch;
                }
                if(maximumAmount.length() > result.length()) // сравниваем длину, чтобы найти максимальную длину последовательности
                    result = maximumAmount;
                maximumAmount="";
            }
            return result;
        }
        return "Not a binary";
    }
    public static void main(String[] args) {
        System.out.println(longestZero("1010011000"));
        System.out.println(longestZero("1000001"));
        System.out.println(longestZero("1000001"));
        System.out.println(longestZero("11111"));
    }
}
