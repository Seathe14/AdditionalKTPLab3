public class Exercise1 {
    private static int solutions(int a,int b, int c)
    {
        if(b*b - 4 * a * c > 0) // Если дискриминант больше 0, то два корня
            return 2;
        else if(b*b-4*a*c == 0) // если равно нулю, то один корень
            return 1;
        else return 0; // если меньше 0, то корней нет
    }
    public static void main(String[]args)
    {
        System.out.println(solutions(1,0,-1));
        System.out.println(solutions(1,0,0));
        System.out.println(solutions(1,0,1));
    }
}
