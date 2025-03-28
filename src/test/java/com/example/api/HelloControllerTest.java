package com.example.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser
    public void testHelloEndpointWithAuth() throws Exception {
        mockMvc.perform(get("/api/hello"))
               .andExpect(status().isOk());
    }

    @Test
    public void testHelloEndpointWithoutAuth() throws Exception {
        mockMvc.perform(get("/api/hello"))
               .andExpect(status().isUnauthorized());
    }
}