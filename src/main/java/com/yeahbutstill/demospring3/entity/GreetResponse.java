package com.yeahbutstill.demospring3.entity;

import java.util.Objects;

public class GreetResponse {
    private String greet;

    public GreetResponse() {
    }

    public GreetResponse(String greet) {
        this.greet = greet;
    }

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreetResponse that = (GreetResponse) o;

        return Objects.equals(greet, that.greet);
    }

    @Override
    public int hashCode() {
        return greet != null ? greet.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "GreetResponse{" +
                "greet='" + greet + '\'' +
                '}';
    }
}
