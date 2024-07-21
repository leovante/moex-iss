package ru.exdata.moex.controllers;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.validation.Validated;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import ru.exdata.moex.dto.RequestParamSecuritiesTrades;
import ru.exdata.moex.handler.SecuritiesTradesHandler;

@Validated
@RequiredArgsConstructor
@Controller("/iss/engines/stock/markets/shares/securities")
public class SecuritiesTradesRouter {

    private final SecuritiesTradesHandler securitiesTradesService;

    @Get("/{security}/trades")
    @Produces(MediaType.APPLICATION_JSON_STREAM)
    @Status(HttpStatus.OK)
    public Flux<Object[]> getSecuritiesTrades(@Valid @RequestBean RequestParamSecuritiesTrades request) {
        return securitiesTradesService.fetch(request);
    }

}