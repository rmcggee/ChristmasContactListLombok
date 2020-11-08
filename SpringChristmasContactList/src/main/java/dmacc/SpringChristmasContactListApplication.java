package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dmacc.beans.ChristmasListContact;

@SpringBootApplication
public class SpringChristmasContactListApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringChristmasContactListApplication.class, args);
		ChristmasListContact myCLC = new ChristmasListContact();
		
	}

}
