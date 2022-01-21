package com.trying.resttemplatetest.controllers;

import com.trying.resttemplatetest.models.Post;
import com.trying.resttemplatetest.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with love by mundiaem
 * created on 21/01/2022
 * Time: 19:23
 * ⚡  - RestTemplateTest
 */
@RestController
public class RestControllerMain {
    @Autowired
    private RequestService requestService;

    @RequestMapping(value = "/posts")
    public Post[] getProductList() {

        return requestService.getProductList();
    }
}

