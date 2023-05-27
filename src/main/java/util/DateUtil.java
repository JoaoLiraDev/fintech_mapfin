package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public Date parseString(String val) throws ParseException {
		String formato = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		Date data = sdf.parse(val);

		return data;
	}
}
