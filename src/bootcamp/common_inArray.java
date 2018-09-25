package bootcamp;



public class common_inArray {

    public static void array_common(int[] arr1,int[] arr2)
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println("common is:" + arr1[i]);
                    arr2[j]=' ';
                }
            }
        }
    }

    public static void main(String[] args)
    {

        int[] arr1={1,2,3,2,4,5};
        int[] arr2={2,9,7,1,3,6};
        array_common(arr1,arr2);
    }
}
