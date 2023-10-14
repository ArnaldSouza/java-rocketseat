package br.com.arnaldsouza.todolist.user;

import lombok.Data;

@Data //essa notation automaticamente coloca os getters e setters
public class UserModel {

    private String username;
    //@getter
    //@setter
    private String name;
    private String password;

    //getters e setters
    //get -> buscar informação dentro de um atributo
    //set -> inserir/definir o valor de um atributo
}
