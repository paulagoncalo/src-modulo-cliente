package br.com.banco.service;

import br.com.banco.dto.ClienteDTO;
import br.com.banco.exceptions.ClienteNaoEncontradoException;

public interface ClienteService {
    ClienteDTO findByNumeroConta(String numeroConta) throws ClienteNaoEncontradoException;
}
