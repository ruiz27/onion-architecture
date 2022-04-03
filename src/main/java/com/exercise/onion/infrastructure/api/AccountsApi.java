
package com.exercise.onion.infrastructure.api;

import com.exercise.onion.domain.dto.DomainRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-03T16:53:19.490Z[GMT]")
@Validated
public interface AccountsApi {

    @Operation(summary = "Returns challenge", description = "", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = DomainRequest.class)))),

            @ApiResponse(responseCode = "400", description = "")})
    @RequestMapping(value = "/domain",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<DomainRequest>> domainGet(@Parameter(in = ParameterIn.QUERY, description = "", schema = @Schema()) @Valid @RequestParam(value = "challengeId", required = false) String challengeId);


    @Operation(summary = "Creates a new challenge.", description = "", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created"),

            @ApiResponse(responseCode = "400", description = "")})
    @RequestMapping(value = "/domain",
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> domainPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody List<DomainRequest> body);

}

