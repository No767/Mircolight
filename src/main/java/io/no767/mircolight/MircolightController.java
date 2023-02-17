package io.no767.mircolight;

import io.micronaut.http.annotation.*;

@Controller("/mircolight")
public class MircolightController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }

    @Get(uri="/test", produces="text/plain")
    public String test() {
        return "Test Response";
    }

    @Get(uri="/test2", produces="text/plain")
    public String test2() {
        return "Test Response 2";
    }

    @Get(uri="/test3", produces="text/plain")
    public String test3() {
        return "Test Response 3";
    }
}