package MatkonetPractice.OOP;

public class AllCars {

    private Car[] cars;
    private int num;


    public AllCars(int max)
    {
        this.cars = new Car[max];
        this.num = 0;
    }


    public Car[] getCars()
    {
        return this.cars;
    }
    public boolean addCar(Car car)
    {
        if (this.num < this.cars.length)
        {
            this.cars[this.num] = car;
            this.num++;

            return true;
        }

        return false;

    }

    public void print(int min, int max)
    {
        for(int i = 0; i<this.cars.length; i++)
        {
            if(!this.cars[i].isHadAccident() && this.cars[i].range(min, max))
            {
                System.out.println(this.cars[i].getLicenseNum());
            }
        }
    }


}
