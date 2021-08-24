package edu.eci.project.service;

import java.util.List;

import edu.eci.project.data.User;

public interface UserService {
    User create(User user);

    User findById(String id);

    List<User> all();

    boolean deleteById(String id);

    User update(User user, String userId);
}
