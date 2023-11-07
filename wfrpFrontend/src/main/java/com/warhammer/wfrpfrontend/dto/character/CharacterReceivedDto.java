package com.warhammer.wfrpfrontend.dto.character;

import org.springframework.http.HttpStatus;

public record CharacterReceivedDto(String name, HttpStatus status) {

}
