	import java.util.Scanner;
public class Rent {
	

	    int count = 0;
	    Scanner scan = new Scanner(System.in);
	    String[] renterArr = new String[10];

	    private String fullName;
	    private int phoneNum, cardNum;

	    public String getFullName()
	    {
	        return this.fullName;
	    }

	    public void setFullName(String fullName)
	    {
	        this.fullName = fullName;
	    }

	    public int getPhoneNum()
	    {
	        return this.phoneNum;
	    }

	    public void setPhoneNum(int phoneNum)
	    {
	        this.phoneNum = phoneNum;
	    }

	    public int getCardNum()
	    {
	        return this.cardNum;
	    }

	    public void setCardNum(int cardNum)
	    {
	        this.cardNum = cardNum;
	    }

	    public void showAllRenter()
	    {
	        for (String renter : renterArr)
	        {
	            System.out.print(renter + " ");
	            System.out.println();
	        }

	    }

	    public void renterInfo()
	    {
	        System.out.print("Renter's Full Name: ");
	        String name = scan.nextLine();
	        setFullName(name);

	        System.out.print("Phone Number: ");
	        int phoneNumber = scan.nextInt();
	        setPhoneNum(phoneNumber);

	        System.out.print("Card Number: ");
	        int cardNumber = scan.nextInt();
	        setCardNum(cardNumber);
	        scan.nextLine();

	        renterArr[count] = name + " - " + phoneNumber + " - " + cardNumber;
	        count++;
	        System.out.println();
	        //showAllRenter();
	    }

	}