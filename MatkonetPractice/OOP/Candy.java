package MatkonetPractice.OOP;

public class Candy {
    private String name;
    private double price;
    private boolean sugar;

    private double weight;


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isSugar() {
        return this.sugar;
    }
    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }



    public Candy(String name, double price, boolean sugar, double weight)
    {
        this.name = name;
        this.sugar = sugar;
        this.weight = weight;

        if(price >= 0.5 && price <= 19.9)
        {
            this.price = price;
        }

        else
        {
            this.price = 0.0;
        }
    }

    public Candy(Candy other)
    {
        this.name = other.name;
        this.price = other.price;
        this.sugar = other.sugar;
    }

    public Candy()
    {
        this.name = "";
        this.price = 0.0;
        this.sugar = false;
    }

    public Candy(double price)
    {
        this.name = "GummyGum";
        this.price = price;
        this.sugar = true;
    }

    //האם העצם הבא תקין? נמק!
    // Candy c1 = new Candy(true, 2.5, "Gum");
    //סדר הארגומנטים ביצירת עצם הוא זה שקובע את תקינות שורה זו. אם סדר התכונות של המחלקה הנתונה הוא סדר הפרמטרים של הבנאי הראשון, שורה זו אינו תקינה, משום שסדר הארגומנטים של יצירת עצם זה הוא הפוך מהסדר המבוקש.


    public Candy(String name, boolean sugar)
    {
        this.name = name;
        this.sugar = sugar;
        this.price = 12.5;
    }

    public boolean isLolipop()
    {
        return (this.name == "Lolipop");
    }

    public boolean isChocolate()
    {
        return (this.price > 10 && this.name == "Chocolate");
    }

    public boolean sameAtts(Candy c1)
    {
        return (this.name == c1.name && this.price == c1.price && this.sugar == c1.sugar);
    }

    public void printPriceOfLongestName(Candy c1)
    {
        //פעולה זו מדפיסה את המחיר של הממתק עם השם הארוך יותר בהנחה שהמחירים של שני הממתקים אינם שווים

        if(this.name.length() > c1.name.length())
        {
            System.out.println(this.price);
        }

        else
        {
            System.out.println(c1.price);
        }
    }

    public boolean priceEquals(double d)
    {
        return (this.price == d);
    }

    public double lowerPrice(Candy c1)
    {
        return (Math.min(this.price, c1.price));
    }

}
