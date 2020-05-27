public class Exercise10 {
    private static boolean rightTriangle(int x,int y, int z)
    {
        if(x*x+y*y == z*z) // сумма квадратов катетов должна равняться сумме квадрата гипотенузы.
            return true;
        else if(x*x + z*z == y*y)
            return true;
        else if(z*z + y*y == x*x)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(rightTriangle(3,4,5));
        System.out.println(rightTriangle(145,105,100));
        System.out.println(rightTriangle(70,130,110));
        System.out.println(rightTriangle(6,8,10));
    }
}
