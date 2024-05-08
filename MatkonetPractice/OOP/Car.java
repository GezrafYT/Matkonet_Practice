package MatkonetPractice.OOP;

public class Car {

    private String licenseNum;
    private boolean hadAccident;
    private int price;

    public Car(String licenseNum, boolean hadAccident, int price)
    {
        this.licenseNum = licenseNum;
        this.hadAccident = hadAccident;
        this.price = price;
    }


    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public boolean isHadAccident() {
        return hadAccident;
    }

    public void setHadAccident(boolean hadAccident) {
        this.hadAccident = hadAccident;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public boolean range(int min, int max)
    {
        if (this.price >= min && this.price <= max)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Car car1 = new Car("69420", true, 500);
        Car car2 = new Car("1212", false, 1276);
        Car car3 = new Car("21314", true, 1312);
        Car car4 = new Car("1511", false, 133);
        AllCars temp = new AllCars(4);

        temp.addCar(new Car("1002", true, 1000));

        for(int i = 0; i<temp.getCars().length; i++)
        {
            System.out.println(temp.getCars()[i].getLicenseNum());
        }
    }
}
