package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Cliente;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-05T18:00:01.964Z")

@Controller
public class ClienteApiController implements ClienteApi {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ResponsesUtil responsesUtil;

    public ResponseEntity<Cliente> cadastraCliente(@ApiParam(value = ""  )  @Valid @RequestBody Cliente cliente_) {
        
    	try {
    		//Salvar o cliente
    		return clienteService.save(cliente_);
    	} catch(Exception e){
    		return responsesUtil.getInternalErrrorClient(clienteService.FALHA_AO_TENTAR_CADASTRAR_UM_CLIENTE)
    		//Resposta de erro
    	}
    }
}
