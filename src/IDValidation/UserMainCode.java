package IDValidation;

public class UserMainCode {
	public static String validateIDLocations(String id,String city) {
		if(id.matches("CTS[-]{1}[a-z]{3}[-]{1}[0-9]{4}") && (id.substring(4,7).equals(city.substring(0,3))))
				return "Valid id";
		else {
			return "Invalid id";
		}
}}
