package org.example.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class UsersPage {
    private List<User> users;
    private String header;
}
