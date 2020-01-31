package ar.com.opendevsolutions.tickets.rest;

import ar.com.opendevsolutions.tickets.model.Client;
import ar.com.opendevsolutions.tickets.service.TicketsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@Api(value="/",produces ="application/json")
public class TicketsRest {

    @Autowired
    TicketsService ticketsService;

    @ApiOperation(value = "Buscar tickets,response = String.class")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "datos solicitantes encontrados"),
            @ApiResponse(code = 400, message = "Error al intentar obtener el recurso"),
            @ApiResponse(code = 401, message = "Sin Autorización"),
            @ApiResponse(code = 403, message = "No tiene permisos para acceder a este recurso"),
            @ApiResponse(code = 404, message = "Error, no existe el recurso")
    })
    @GetMapping(value = "/find" , produces = "application/json")
    public String buscarTickets() {
        return "test";
    }


    @ApiOperation(value = "Se inicializa los datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "datos solicitantes encontrados"),
            @ApiResponse(code = 400, message = "Error al intentar obtener el recurso"),
            @ApiResponse(code = 401, message = "Sin Autorización"),
            @ApiResponse(code = 403, message = "No tiene permisos para acceder a este recurso"),
            @ApiResponse(code = 404, message = "Error, no existe el recurso")
    })
    @GetMapping(value = "/initialize" , produces = "application/json")
    public String inicializarEstado() {
        return "test";
    }

}
