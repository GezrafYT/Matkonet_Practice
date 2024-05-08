package MatkonetPractice;

public class CandyBag {

    private double maxWeight;
    private Candy[] candies;
    public CandyBag(double maxWeight)
    {
        this.maxWeight = maxWeight;
        this.candies = new Candy[20];
    }

    public double totalPrice()
    {
        double sum = 0;
        for(int i = 0; i<this.candies.length; i++)
        {
            sum += this.candies[i].price;
        }

        return sum;
    }

    public boolean lessSugarBag()
    {
        int count = 0;

        for(int i = 0; i<this.candies.length; i++)
        {
            if(this.candies[i].sugar)
            {
                count++;
            }
        }

        return (count < this.candies.length);
    }

    public double sumOfTwo()
    {
        double sum = 0;
        for(int i = 0; i<this.candies.length; i++)
        {
            for(int j = 0; j<this.candies.length; j++)
            {
                if(Math.abs(this.candies[i].price - this.candies[j].price == 1) || Math.abs(this.candies[j].price - this.candies[i].price == 1))
                {
                    sum = this.candies[i].price + this.candies[j].price;
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
                        chosenName = this.candies[i].name;
                    }
                }
            }
        }

        return chosenName;
    }

    public boolean bagWeight(CandyBag cb)
    {
        return (this.maxWeight < cb.maxWeight);
    }


}
