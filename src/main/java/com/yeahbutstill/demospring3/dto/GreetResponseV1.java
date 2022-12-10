package com.yeahbutstill.demospring3.dto;

import com.yeahbutstill.demospring3.entity.Person;

import java.util.List;

public record GreetResponseV1(String greet, List<String> favProgrammingLangs, Person person) {
}
