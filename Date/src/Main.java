import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//manipulando data, em java. professor nelio alves
		//simpleDateForm
		//ISO 8601 => formato data UTC
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//toda exceção deve ser tratada
		Date y1 = sdf1.parse("25/06/2018");		
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date x1 = new Date();
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(sdf2.format(x1));
	}

}
