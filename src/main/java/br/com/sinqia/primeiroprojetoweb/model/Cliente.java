package br.com.sinqia.primeiroprojetoweb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

@Data
//@AllArgsConstructor
public class Cliente {


    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Integer idade;

    public Cliente(String nome, String cpf, String email, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }

    public static void main(String[] args) {
        System.out.println(new Cliente("Isabella", "06043845644", "isabellarsbarra@gmail.com",28));
    }
}
