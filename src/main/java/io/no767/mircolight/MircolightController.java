package io.no767.mircolight;

import io.micronaut.http.annotation.*;

@Controller("/mircolight")
public class MircolightController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}