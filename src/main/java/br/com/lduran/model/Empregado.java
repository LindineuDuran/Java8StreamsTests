package br.com.lduran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empregado
{
    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;
}
