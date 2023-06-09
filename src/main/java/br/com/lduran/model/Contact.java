package br.com.lduran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contact
{
	private Long id;

	private String name;

	private String email;
	private String phone;
}