package MatkonetPractice.OOP;

public class FlashlightMain {

    public static void threeFlashlights(Flashlight[] arr, double total)
    {
        boolean flag = true;
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j< arr.length - 1; j++)
            {
                if ((arr[i].getPrice() + arr[j].getPrice() + arr[j+1].getPrice()) == total && flag)
                {
                    System.out.println(arr[i].getModel());
                    System.out.println(arr[j].getModel());
                    System.out.println(arr[j+1].getModel());

                    flag = false;
                }
            }
        }
    }

    public static void main(String[] args)
    {
//        Flashlight f1 = new Flashlight("n", 12);
//        Flashlight f2 = new Flashlight("i", 48);
//        Flashlight f3 = new Flashlight("g", 39);
//        Flashlight f4 = new Flashlight("e", 78);
//        Flashlight f5 = new Flashlight("r", 25);
//        Flashlight[] arr = {f1, f2, f3, f4, f5};
//
//        threeFlashlights(arr, 100);
    }
}
