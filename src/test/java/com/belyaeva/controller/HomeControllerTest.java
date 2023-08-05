package com.belyaeva.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/*
@WebMvcTest(HomeController.class) //WebMockTest - имитирует механику Spring MVC, чтобы не запускать сервер
// регистрирует HomeController в SpringMVC, чтобы дать возможность отправлять еу запросы
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk()) //ожидается код ответа 200
                .andExpect(view().name("home")) //ожидается имя представления home
                .andExpect(content().string(containsString("Welcome to..."))); //ожидается наличие строки "Welcome to..."
    }
}*/
