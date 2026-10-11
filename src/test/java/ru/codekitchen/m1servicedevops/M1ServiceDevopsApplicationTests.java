package ru.codekitchen.m1servicedevops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import ru.codekitchen.m1servicedevops.services.GreetingService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class M1ServiceDevopsApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    private final GreetingService greetingService = new GreetingService();

    @Test
    void testHealthzEndpointStatus() throws Exception {
        mockMvc.perform(get("/healthz"))
                .andExpect(status().isOk())
                .andExpect(content().string("OK"));
    }

    @Test
    void testGreetingServiceDefault() {
        String result = greetingService.getGreeting(null);
        assertEquals("Hello, Guest!", result);
    }

    @Test
    void testGreetingServiceCustomName() {
        String result = greetingService.getGreeting("Alice");
        assertEquals("Hello, Alice!", result);
    }

}