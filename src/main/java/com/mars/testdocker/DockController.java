package com.mars.testdocker;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testedocker")
public class DockController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String msg(){
        return "Mensagem recebida com Sucesso";
    }
}
