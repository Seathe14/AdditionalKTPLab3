public class Exercise3 {
    private static boolean checkPerfect(int number)
    {
        int sum = 0; // Переменная, в которую записывается сумма множителей
        for(int i = 1; i<number;i++) // в цикле от 1, до самого числа считаем, сколько множителей имеет число
        {
         if(number%i == 0)
             sum+=i; // если остаток от деления 0, то прибавляем множитель к сумме
        }
        if(sum == number) // сравниваем
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
    }
}
