package br.com.banco.service;

import br.com.banco.dto.ClienteDTO;
import br.com.banco.exceptions.ClienteNaoEncontradoException;
import br.com.banco.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteDTO findByNumeroConta(String numeroConta) throws ClienteNaoEncontradoException {
        var entity = clienteRepository.findByNumeroConta(Long.valueOf(numeroConta)).orElseThrow(() -> new ClienteNaoEncontradoException("Cliente não encontrado"));
        var clienteDto = ClienteDTO.builder().build();
        BeanUtils.copyProperties(entity, clienteDto);

        return clienteDto;
    }
}
