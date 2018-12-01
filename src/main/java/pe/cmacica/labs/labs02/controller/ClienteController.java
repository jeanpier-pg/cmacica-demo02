package pe.cmacica.labs.labs02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.cmacica.labs.labs02.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteservice;

    @GetMapping("/{id}")
    public HttpEntity<String> getNombres(@PathVariable("id") int id){

        return ResponseEntity.ok(clienteservice.getNombre(id));
        //return ResponseEntity.ok("PUBG");
    }

    @GetMapping("/Calcular")
    public HttpEntity<Integer> calcular(@RequestParam ("n1") int n1,@RequestParam("n2") int n2)
    {
        Integer rp = clienteservice.calcular(n1,n2);
        return ResponseEntity.ok(rp);
    }
}
