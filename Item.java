import java.text.*;
import java.util.*;

public class Item {
	
	public static Object checkEventAvailable(Date date){
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
		String date1=dateFormat.format(date);
		String data[]=new String[100];
		data=date1.split("-");
		int month = Integer.parseInt(data[1]);
		if(month%2==0) {
			Date dateObject=new Date();
			return dateObject;
		}
		else
			return "Not Eligible for BIGBASH Event";
	}
	
	public static Double getAmountWithDiscount(Double amount,Date date) {
		Double discount;
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
		String date1=dateFormat.format(date);
		String data[]=new String[100];
		data=date1.split("-");
		int month = Integer.parseInt(data[1]);
		discount=(amount*month)/100;
		discount=amount-discount;
		return discount;
	}
}