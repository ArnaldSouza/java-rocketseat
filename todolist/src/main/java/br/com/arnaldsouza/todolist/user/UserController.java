package br.com.arnaldsouza.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificadores: pulic, private, protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    /*
     * String  (texto)
     * Integer (int) Números inteiros
     * Double (double) Número 0.000000
     * Float (float) Número 0.000
     * char (A C)
     * Date (data)
     * void (vazio)
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());
    }

}
