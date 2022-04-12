package com.github.ricardobaumann.helloazure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Result get() {
        return new Result(UUID.randomUUID().toString(), "name");
    }

    @PostMapping
    public Result post(@RequestBody TestCommand testCommand) {
        return new Result(UUID.randomUUID().toString(), testCommand.getName());
    }

}
