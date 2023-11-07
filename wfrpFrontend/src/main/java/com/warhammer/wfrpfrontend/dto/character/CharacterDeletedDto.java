package com.warhammer.wfrpfrontend.dto.character;

import org.springframework.http.HttpStatus;

public record CharacterDeletedDto(String deleted, HttpStatus status) {

}
