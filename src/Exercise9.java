import java.io.PrintWriter;

public class Exercise9 {
    private static int nextPrime(int number)
    {
        int num = 0; // делитель.
        for(int i = number;;i++) //от переданного в параметр числа проверяем простое ли это число, или последующие
        {
            int counter = 0; //
            for(num = i;num>=1;num--) // считаем количество делителей
            {
                if(i%num == 0){
                    counter+=1;
                }
            }
            if(counter == 2)
            {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
        System.out.println(nextPrime(13));
    }
}
