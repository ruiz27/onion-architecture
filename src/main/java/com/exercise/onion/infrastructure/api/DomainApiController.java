package com.exercise.onion.infrastructure.api;

import com.exercise.onion.infrastructure.api.dto.Domain;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-03T16:53:19.490Z[GMT]")
@RestController
public class DomainApiController implements DomainApi {

    private static final Logger log = LoggerFactory.getLogger(DomainApiController.class);

    public ResponseEntity<List<Domain>> domainGet(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "challengeId", required = false) String challengeId) {

        return new ResponseEntity<List<Domain>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> domainPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody List<Domain> body) {
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
