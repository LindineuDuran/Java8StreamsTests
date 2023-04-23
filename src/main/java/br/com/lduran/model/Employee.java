package br.com.lduran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee
{
	private Integer employeeNumber;
	private String name;
	private Integer departmentId;
}
