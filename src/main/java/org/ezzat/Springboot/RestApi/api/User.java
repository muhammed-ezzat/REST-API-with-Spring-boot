package org.ezzat.Springboot.RestApi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class User
{
    @Id
    private String  id;
    private String name;

    public User(@JsonProperty("id")String id, @JsonProperty("name") String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(UUID id, String newname)
    {
        name=newname;
    }


}
