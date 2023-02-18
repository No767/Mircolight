package io.no767.mircolight;

import io.micronaut.http.annotation.*;
import io.no767.mircolight.repos.UserRepo;
import io.no767.mircolight.models.User;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.QueryHint;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Slice;
import io.micronaut.data.repository.CrudRepository;
import jakarta.inject.Inject;

@Controller("/mircolight")
public class MircolightController {

    @Inject
    UserRepo userRepo;

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

    @Get(uri="/user", produces="text/plain")
    public String user() {
        return "User Response";
    }

    @Post(uri="/test3", produces="text/plain")
    public String test3() {
        User user = new User();
        user.setName("Test");
        user.setEmail("no");
        userRepo.save(user);
        return "Test Response 3";
    }

    @Get(uri="/test4", produces="text/plain")
    public String test4() {
        User user = userRepo.find("Test");
        return user.getName();
    }
}