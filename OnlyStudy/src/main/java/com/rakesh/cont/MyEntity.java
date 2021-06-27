package com.rakesh.cont;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MyEntity {
	
	int id;
	
	public String name;
	
	public String age;
	
	public String city;
	
	

}
