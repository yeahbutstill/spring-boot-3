package com.yeahbutstill.demospring3.dao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDao {

    private static final List<UserDetails> APPLICATION_USERS = Arrays.asList(
            new User(
                    "lerlps_dg@gilahormat.com",
                    "sangatrahasia",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_DG"))
            ),
            new User(
                    "lerlps_kadiv@gilahormat.com",
                    "sangatrahasia",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_KADIV"))
            ),
            new User(
                    "lerlps_katim@gilahormat.com",
                    "sangatrahasia",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_KATIM"))
            ),
            new User(
                    "lerlps_user@gilahormat.com",
                    "sangatrahasia",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_PELAKSANA"))
            )
    );

    public UserDetails findUserByEmail(String email) {

        return APPLICATION_USERS
                .stream()
                .filter(u -> u.getUsername().equals(email))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("No monkey user was found"));

    }

}
