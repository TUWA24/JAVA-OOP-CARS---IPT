
public class Vehicle extends Car {

	
	    String[][] carArr =  {
	            {"  Car Model ", "\t\t\t Car Brand ", "\t\t\t Availability ", "\t\t\t Rental Fee: "},
	            {"1 Mini Cooper ", "\t\t\t BMW        ", "\t\t Available ", "\t\t\t\t $500 "},
	            {"2 Ferrari F40 ", "\t\t\t Ferrari      ", "\t\t Available ", "\t\t\t\t $1950 "},
	            {"3 Tesla Model X", "\t\t\t Tesla        ", "\t\t Available ", "\t\t\t\t $2300 "},
	            {"4 Gallardo ", "\t\t\t\t Lamborghini ", "\t\t Available ", "\t\t\t\t $850"},
	            {"5 Toyota GR Supra ", "\t\t Toyota ", "\t\t\t Unavailable ", "\t\t\t N/A"}
	    };
	    String[][] rentedCar = {
	            {"Null", "Null", "Null", "Null"}
	    };

	    @Override
	    public void showAllCar()
	    {
	        for (String[] car : carArr)
	        {
	            for (String AllCar : car)
	            {
	                System.out.print(AllCar);
	            }
	            System.out.println();
	        }
	    }
	}