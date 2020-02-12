import java.io.*;
import java.text.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
		Date date1;
		System.out.println("Enter Purchased Date");
		String date=in.readLine();
		date1=dateFormat.parse(date);
		System.out.println("Enter the product amount");
		Double amount=Double.parseDouble(in.readLine());
		Item item=new Item();
		if(item.checkEventAvailable(date1) instanceof Date) {
			System.out.println("The discounted amount is "+item.getAmountWithDiscount(amount, date1));
		}
		else
			System.out.println(item.checkEventAvailable(date1));
	}
}