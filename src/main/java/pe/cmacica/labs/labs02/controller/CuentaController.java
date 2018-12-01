package pe.cmacica.labs.labs02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.cmacica.labs.labs02.service.ClienteService;
import pe.cmacica.labs.labs02.service.CuentaService;

@Controller
@RequestMapping("/cta")
public class CuentaController {

    @Autowired
    private ClienteService clienteservice;

    @Autowired
    private CuentaService cuentaService;

    @GetMapping("/")
    public HttpEntity<String> getNombres(){

        return ResponseEntity.ok(cuentaService.getAccount(222));
    }
}
