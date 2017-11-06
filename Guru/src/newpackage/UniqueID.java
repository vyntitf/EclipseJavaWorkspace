package newpackage;

import java.util.UUID;
import java.sql.Timestamp;
import java.util.Date;
public class UniqueID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testuuid = UUID.randomUUID().toString();
		System.out.println(testuuid);

		 Date date = new Date();
		System.out.println(new Timestamp(date.getTime()));
		
		long miliseconds = System.currentTimeMillis();
		System.out.println(miliseconds);
	}

}
