package Cadrastro_Java_Spring.Pessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PessoaController {

    @GetMapping("/boasVindas")
    public String BoasVindas(){
        return "Essa e minha primeira mensagem nessa Rota";
    }


}
