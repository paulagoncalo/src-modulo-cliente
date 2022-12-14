package br.com.banco.controller;

import br.com.banco.dto.ClienteDTO;
import br.com.banco.exceptions.ClienteNaoEncontradoException;
import br.com.banco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/consulta/{numeroConta}")
    public ResponseEntity<ClienteDTO> consultarPorNumeroConta(@PathVariable String numeroConta) throws ClienteNaoEncontradoException {
        return ResponseEntity.ok(clienteService.findByNumeroConta(numeroConta));
    }
}
