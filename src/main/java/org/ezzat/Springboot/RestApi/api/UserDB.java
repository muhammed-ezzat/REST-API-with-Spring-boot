package org.ezzat.Springboot.RestApi.api;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
/*
@Repository
public class UserDB {

    private static List<User> DB=new ArrayList<>();

    public int insertUser(String name)
    {
        UUID id= UUID.randomUUID();
        DB.add(new User(id,name));
        return 1;
    }

    public List<User> selectAllUsers()
    {
        return DB;
    }

    public Optional<User> selectPersonByID(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    public int deleteUer(UUID id)
    {
        Optional<User> person=selectPersonByID(id);
        if (person.isEmpty())
            return 0;
        DB.remove(person.get());
        return 1;
    }
    public int updataUserById(UUID id, String name)
    {
        return selectPersonByID(id)
                .map(person1 -> {
                    int indexOfPersonDelete = DB.indexOf(person1);
                    DB.set(indexOfPersonDelete, new User(id, name));
                    return 1;
                }).orElse(0);
    }

}
*/