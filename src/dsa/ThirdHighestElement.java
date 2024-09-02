package dsa;

public class ThirdHighestElement {

    public static int getThirdHighestElement(int[] arr)
    {
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] > first)
            {
                third = second;
                second = first;
                first  = arr[i];
            }
            else if(arr[i] > second)
            {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third)
            {
                third = arr[i];
            }
        }
        return  third;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{9,40,3,5,2};
        int thirdHighets = getThirdHighestElement(arr);
        System.out.println("Third Highest "+thirdHighets);
    }

}
