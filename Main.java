
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner system = new Scanner(System.in);
        Scanner syscan = new Scanner(System.in);

        Car car = new Car();
        Rent renter = new Rent();
        Vehicle vehicle = new Vehicle();

        // Car Rental System Starts Here ~
        loop:
        while (true)
        {
            car.showAllCar();
            System.out.println();
            System.out.println("Rent a Car? (y)/(n)");
            Character input = system.next().charAt(0);

            if (input == 'Y' || input == 'y')
            {
                renter.renterInfo();
                car.showAllCar();
                System.out.println();

                System.out.println("Which car do you want to rent? ");
                int select = syscan.nextInt();
                switch (select)
                {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("You selected " + vehicle.carArr[select][0] + vehicle.carArr[select][1] + " is " + vehicle.carArr[select][2]);
                        car.carArr[select][2] = "\t\t Unavailable"; car.carArr[select][3] = "\t\t\t N/A";
                        System.out.println();
                        car.showAllCar();
                        System.out.println();
                        renter.showAllRenter();
                        System.out.println();
                        continue loop;
                    case 5:
                        System.out.println(vehicle.carArr[select][count] + vehicle.carArr[select][1] + " is " + vehicle.carArr[select][2]);
                        System.out.println();
                        continue loop;
                    default:
                    {
                        System.out.println("Index out of bounds.");
                    }
                }
                //renter.showAllRenter();

                break loop;
            }
            else if (input == 'N' || input == 'n')
            {
                System.out.println("Come Again!");
                System.exit(1);
                break loop;
            }
            else
            {
                System.out.println("ERROR: Type (y)/(n) only!");
                System.out.println();
                continue loop;
            }
        }
    }
}