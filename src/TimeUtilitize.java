import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class TimeUtilitize {
	
		//vehicle add and exit time will be almost similar in this project as its running in 1 session.
		public String getCurrentTime() {
			

			ZonedDateTime istDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

	        DateTimeFormatter formatter = 
	        		DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
	        String formattedDateTime = istDateTime.format(formatter);

	        return formattedDateTime;

		}
	
        
}
