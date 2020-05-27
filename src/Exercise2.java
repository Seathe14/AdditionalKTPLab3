public class Exercise2 {
    private static int findZip(String text)
    {
        int count = 0; // чтобы посчитать количество раз, когда встречается слово zip
        int Index = 0; // индекс, по которому мы идем
        int lastIndex = 0; // результирующий индекс
        while((Index = text.indexOf("zip",Index)) != -1)
        {
            lastIndex = Index;
            count++;
            Index++;
        }
        if(count>=2)
            return lastIndex;
        else return -1;
    }
    public static void main(String[] args)
    {
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
        System.out.println(findZip("all zip files are compressed and zipped"));
    }
}
