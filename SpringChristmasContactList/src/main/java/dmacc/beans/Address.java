package dmacc.beans;


import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;


}
