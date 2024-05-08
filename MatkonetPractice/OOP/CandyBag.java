package MatkonetPractice.OOP;

public class CandyBag {

    private double maxWeight;
    private Candy[] candies;

    public double getMaxWeight()
    {
        return this.maxWeight;
    }
    public CandyBag(double maxWeight, Candy[] candies)
    {
        this.maxWeight = maxWeight;
        this.candies = candies;
//        this.candies = new Candy[20]; שורה זו עבור אתחול גודל מערך הממתקים ל20, אך לפי השאלה ביקשו ערך פרמטרי לכל תכונה
    }

    public double totalPrice()
    {
        double sum = 0;
        for(int i = 0; i<this.candies.length; i++)
        {
            sum += this.candies[i].getPrice();
        }

        return sum;
    }

    public boolean lessSugarBag()
    {
        int count = 0;

        for(int i = 0; i<this.candies.length; i++)
        {
            if(this.candies[i].isSugar())
            {
                count++;
            }
        }

        return (count < (this.candies.length - count));
    }

    public double sumOfTwo()
    {
        double sum = 0;
        for(int i = 0; i<this.candies.length; i++)
        {
            for(int j = 0; j<this.candies.length; j++)
            {
                if(Math.abs(this.candies[i].getPrice() - this.candies[j].getPrice()) == 1)
                {
                    sum = this.candies[i].getPrice() + this.candies[j].getPrice();
                }

            }
        }

        return sum; //יחזיר 0 אם לא נמצא צמד ממתקים שהפרשיהם הוא 1
    }

    public String maxCandyName()
    {
        int max = 0;
        int count = 0;
        String chosenName = "";
        for(int i = 0; i<this.candies.length; i++)
        {
            count = 0;
            for(int j = 0; j<this.candies.length; j++)
            {
                if(this.candies[i] == this.candies[j])
                {
                    count++;
                    if(count > max)
                    {
                        max = count;
                        chosenName = this.candies[i].getName();
                    }
                }
            }
        }

        return chosenName;
    }

    public static boolean bagWeight(CandyBag cb)
    {
        double sum = 0;

        for(int i = 0; i<cb.candies.length; i++)
        {
            sum += cb.candies[i].getWeight();
        }

        return (sum < cb.getMaxWeight());
    }

    public static double specificPrice(CandyBag cb, String s, double d)
    {
        double sum = 0;

        for(int i = 0; i<cb.candies.length; i++)
        {
            if (cb.candies[i].getName() == "s" && cb.candies[i].getPrice() <= d)
            {
                sum += cb.candies[i].getPrice();
            }
        }

        return sum;

        //סיבוכיות הזמן של פונקציה זו היא O(n) כאשר n הוא גודל לא יודע אשר מייצג את גודל מערך הממתקים של cb. לולאת for בעל מספר איטרציות לא ידוע ותוכן קבוע מהווה סיבוכיות זמן של O(n).

    }

}
