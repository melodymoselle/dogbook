package dao;

import entities.User;

import java.util.List;

// Interface allows ORM migration
public interface UserDOAInterface {

    public void save(User user);

    public List<User> list();
}
