
public class Car implements Vechinfo {

	
	    String[][] carArr =  {
	            {"  Car Model ", "Car Brand ", "Availability ", "Rental Fee: "},
	            {"1 Mini Cooper ", "BMW ", "Available ", "$500 "},
	            {"2 Ferrari F40 ", "Ferrari S.p.A. ", "Available ", "$1950 "},
	            {"3 Tesla Model X ", "Tesla, Inc. ", "Available ", "$2300 "},
	            {"4 Gallardo ", "Lamborghini ", "Available ", "$850"},
	            {"5 Toyota GR Supra ", "Toyota ", "Unavailable ", "N/A"}
	    };

	    @Override
	    public void showAllCar()
	    {
	        for (int row = 0; row < carArr.length; row++)
	        {
	            for (int col = 0; col < carArr[row].length; col++)
	            {
	                System.out.print(carArr[row][col]);
	            }
	            System.out.println();
	        }
	    }
	} 
