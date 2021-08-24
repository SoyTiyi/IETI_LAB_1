package edu.eci.project.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import edu.eci.project.data.User;
import edu.eci.project.service.UserService;


@Service
public class UserServiceImpl implements UserService{

    HashMap<AtomicInteger, User> users = new HashMap<AtomicInteger, User>();

    @Override
    public User create(User user) {
        AtomicInteger size = new AtomicInteger(users.size()+1);
        user.setId(size);
        users.put(user.getId(), user);
        return users.get(user.getId());
    }

    @Override
    public User findById(AtomicInteger id) {
        return users.get(id);
    }

    @Override
    public List<User> all() {
        List<User> listUser = new ArrayList<User>();
        for(AtomicInteger key: users.keySet()){
            listUser.add(users.get(key));
        }
        return listUser;
    }

    @Override
    public boolean deleteById(AtomicInteger id) {
        try {
            users.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public User update(User user, AtomicInteger userId) {
        users.replace(userId, users.get(userId), user);
        return users.get(userId);
    }
    
}
