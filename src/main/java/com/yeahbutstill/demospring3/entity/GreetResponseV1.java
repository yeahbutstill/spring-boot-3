package com.yeahbutstill.demospring3.entity;

import java.util.List;

public record GreetResponseV1(String greet, List<String> favProgrammingLangs, Person person) {
}
