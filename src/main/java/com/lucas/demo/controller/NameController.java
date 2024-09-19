package com.lucas.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class NameController {

    @PostMapping("/sort")
    public List<String> sortNames(@RequestBody List<String> names) {
        if (names == null || names.isEmpty()) {
            return List.of();
        }

        String[] namesArray = names.toArray(new String[0]);
        Arrays.sort(namesArray);
        return Arrays.asList(namesArray);
    }
}
