package edu.eci.project.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import edu.eci.project.data.User;

public interface UserService {
    User create(User user);

    User findById(AtomicInteger id);

    List<User> all();

    void deleteById(AtomicInteger id);

    User update(User user, AtomicInteger userId);
}
