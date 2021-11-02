package org.ezzat.Springboot.RestApi.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

    @RequestMapping (value = "/")
    public String homepage()
    {
        return "Welcome to my API";
    }
}
