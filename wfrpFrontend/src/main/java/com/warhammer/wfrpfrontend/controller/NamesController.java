package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.NameGeneratorClient;
import com.warhammer.wfrpfrontend.dto.name.NameDto;
import com.warhammer.wfrpfrontend.dto.name.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class NamesController {
    
    private final NameGeneratorClient client;
    
    @GetMapping("name")
    public String getName() {
        NameDto nameDto = client.getGeneratedIdentity();
        return nameDto.getResults().stream()
                      .map(Result::getName)
                      .map(name -> name.getFirst() + " " + name.getLast())
                      .collect(toSingleton());
    }
    
    private <T> Collector<T, ?, T> toSingleton() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new IllegalStateException();
                    }
                    return list.get(0);
                }
        );
    }
}
