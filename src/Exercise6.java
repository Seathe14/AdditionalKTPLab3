import java.util.HashSet;

public class Exercise6 {
    private static boolean same(int [] arr1,int []arr2)
    {
        // Создаем два хэшсета
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i =0;i<arr1.length;i++) // в цикле добавляем уникальные числа массива
        {
            hs.add(arr1[i]);
        }
        // Так же добавляем во второй хэшсет уникальные числа второго массива
        for(int i =0;i<arr2.length;i++)
        {
            hs2.add(arr2[i]);
        }
        // Сравниваем если количество уникальных чисел равно и возвращаем true, если да
        if(hs.size() == hs2.size())
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(same(new int[] {1,3,4,4,4}, new int[] {2,5,7}));
        System.out.println(same(new int[] {9,8,7,6}, new int[] {4,4,3,1}));
        System.out.println(same(new int[] {2}, new int[] {3,3,3,3,3}));
    }
}
