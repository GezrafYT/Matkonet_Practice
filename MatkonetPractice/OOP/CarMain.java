package MatkonetPractice.OOP;

public class CarMain {


    public static void main(String[] args)
    {
        Car car1 = new Car("69420", true, 500);
        Car car2 = new Car("1212", false, 1276);
        Car car3 = new Car("21314", true, 1312);
        Car car4 = new Car("1511", false, 133);
        AllCars temp = new AllCars(4);

        temp.addCar(new Car("1002", true, 1000));

        for(int i =0; i<temp.getCars().length; i++)
        {
            System.out.println(temp.getCars()[i].getLicenseNum());
        }
    }
}
