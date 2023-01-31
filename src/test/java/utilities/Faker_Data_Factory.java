package utilities;

import java.util.Locale;

import com.github.javafaker.Faker;

public class Faker_Data_Factory {

	public static final Faker faker = new Faker(new Locale("en-IND"));

	public static String first_name() {
		return faker.name().firstName();
	}

	public static String get_salutation() {
		return faker.options().option("Mr.", "Ms.", "Mrs.", "Dr.", "Prof.");
	}
	
	public static String title() {
		return faker.options().option("Mr","Ms","Mrs");
	}
	
	public static String middle_name() {
		return faker.name().nameWithMiddle();
	}
	
	public static String last_name() {
		return faker.name().lastName();
	}
	
	public static String gender() {
		return faker.options().option("Female" ,"Male");
	}
	
	public static String employment_status() {
		return faker.options().option("Full-time","Part-time","Unemployed");
	}
	
	public static String age_mmddyy(){
		return faker.date().birthday(18, 56).toString();
	}
	
	public static String marital_status() {
		return faker.options().option("Single","Married","Divorced","Widowed");
	}
	
	public static String number_of_dependents() {
		return ""+faker.number().randomNumber(1, false);
	}
	
	public static String user_name() {
		return faker.name().username();
	}
	
	public static String email_id() {
		return faker.internet().emailAddress();
	}
	
	public static String password() {
		return faker.regexify("[a-zA-Z0-9@]{8}");
	}

}
