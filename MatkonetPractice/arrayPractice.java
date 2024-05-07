public class arrayPractice {


    public static int oddSum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void printReverse(int[] arr)
    {

        for (int i = arr.length - 1; i>=0; i--)
        {
            if(arr[i] % 3 == 0)
            {
                System.out.println(arr[i]);
            }
        }
    }


    public static int heyCount(String[] arr)
    {
        int count = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] == "Hey")
            {
                count++;
            }
        }

        return count;
    }


    public static boolean aFound(char[] arr)
    {
        boolean found = false;

        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] == 'A')
            {
                found = true;
            }
        }

        return found;
    }

    public static int abcCount(char[] arr)
    {
        int count = 0;

        for(int i = 0; i< arr.length; i++)
        {
            if (arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C')
            {
                count++;
            }
        }

        return count;
    }

    public static double calcAvg(double[] arr)
    {
        int count = 0;
        double sum = 0;

        for(int i = 0; i<arr.length; i++)
        {
            count++;
            sum += arr[i];
        }

        if(count != 0)
        {
            return (sum / count);
        }

        return 0;
    }

    public static int biggestNum(int[] arr)
    {
        int max = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean KTimesC(String[] arr, int k, char c)
    {
        int count = 0;

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length(); j++)
            {
                if(arr[i].charAt(j) == c)
                {
                    count++;
                }
            }
        }

        if(count >= k)
        {
            return true;
        }

        return false;
    }

    public static int nToMRange(int[] arr, int n, int m)
    {
        int count = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] >= n && arr[i] <= m)
            {
                count ++;
            }
        }

        return count;
    }

    public static int smallestNumIndex(int[] arr)
    {
        int min = arr[0];
        int smallestNum = 0;
        int savedIndex = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        for(int j = 0; j<arr.length; j++)
        {
            if(arr[j] == min)
            {
                savedIndex = j;
            }

        }

        return savedIndex;

    }

    public static int sumBiggestNums(int[] arr)
    {
        int max = 0;

        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        int max2 = 0;

        for(int j = 0; j<arr.length; j++)
        {
            if(arr[j] > max2 && arr[j] < max)
            {
                max2 = arr[j];
            }
        }

        return (max + max2);
    }

    public static int[] nToMArr(int[] arr, int n, int m)
    {
        int distance = m - n + 1; // המרחק בין n עד m כולל
        int[] new_arr = new int[distance];

        int iterator = 0;
        for(int i = n; i<=m; i++)
        {
            new_arr[iterator] = arr[i];
            iterator++;
        }

        return new_arr;
    }

    public static boolean sumTilK(int[] arr1, int[] arr2, int k)
    {
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < k; i++)
        {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }

        return (sum1 == sum2);
    }



    public static void main(String[] args)
    {

        int[] arr = {2, 3, 7, 3, 2, 9, 0, 10, 13};
//        printReverse(arr);
//        System.out.println(nToMRange(arr, 3, 5));
//        System.out.println(smallestNumIndex(arr));
//        System.out.println(sumBiggestNums(arr));

        int[] arr2 = nToMArr(arr, 0, 5);
        for(int i = 0; i<arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }

//        char[] char_arr = {'A', 'D', 'B', 'B', 'C', 'E', 'P'};
//
//        System.out.println(abcCount(char_arr));
    }
}
