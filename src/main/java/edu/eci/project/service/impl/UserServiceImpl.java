package edu.eci.project.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import edu.eci.project.data.User;
import edu.eci.project.service.UserService;


@Service
public class UserServiceImpl implements UserService{

    HashMap<String, User> users = new HashMap<String, User>();

    @Override
    public User create(User user) {
        int intId = users.size()+1;
        user.setId(""+intId);
        users.put(user.getId(), user);
        return users.get(user.getId());
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public List<User> all() {
        List<User> listUser = new ArrayList<User>();
        for(String key: users.keySet()){
            listUser.add(users.get(key));
        }
        return listUser;
    }

    @Override
    public boolean deleteById(String id) {
        try {
            users.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public User update(User user, String userId) {
        user.setId(userId);
        users.replace(userId, users.get(userId), user);
        return users.get(userId);
    }
    
}
