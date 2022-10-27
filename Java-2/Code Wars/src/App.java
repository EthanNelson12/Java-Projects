public class App {
   
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int posCount = 0;
        int negSum = 0;
        int array[] = new int[2];
        int emptyArray[] = {};
        for (int i = 0; i < input.length; i++) 
        {
            if(input[i] < 0)
            {
                negSum += input[i];
                
            }
            else if(input[i] > 0)
            {
                posCount++;
            } 
            else 
            {
               return emptyArray;
            }
            
        }
        array[0] = posCount;
        array[1] = negSum;

        return array; //return an array with count of positives and sum of negatives
    }
    public static void main(String[] args) throws Exception 
    {
        int array[] = new int[]
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
       for (int i = 0; i < countPositivesSumNegatives(array).length; i++) 
       {
        System.out.println(countPositivesSumNegatives(array)[i]);
       }
       
       
    }
}
