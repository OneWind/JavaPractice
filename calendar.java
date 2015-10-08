import java.util.Calendar;

public class calendar {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2015, 1, 0, 0, 0, 0);
		System.out.println(c.getTime());
//		long day1 = c.getTimeInMillis();
//		day1 += 24 * 60 * 60;
//		c.setTimeInMillis(day1);
		System.out.println("new hour " + c.get(c.MONTH));
		c.add(c.DATE, 1);
		System.out.println("add 3 days " + c.getTime());
		c.roll(c.DATE, 3);
		System.out.println("roll 3 days " + c.getTime());
		c.set(c.DATE, 1);
		System.out.println("set to 1 " + c.getTime());
	}
	
}