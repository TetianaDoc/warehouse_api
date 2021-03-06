package com.gmail.doctatyana1.warehouse_api.http.dto;

import static com.gmail.doctatyana1.warehouse_api.http.dto.ApiRestController.VERSION;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Tests for {@link ApiRestController}.
 */
@ExtendWith(MockitoExtension.class)
class ApiRestControllerTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private MockMvc mockMvc;

    @InjectMocks
    private ApiRestController apiRestController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(apiRestController)
                .build();
    }

    @Test
    void shouldReturnsVersion() throws Exception {
        mockMvc.perform(get("/api/v1/version"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(OBJECT_MAPPER.writeValueAsString(new VersionResponse(VERSION))));
    }

    @Test
    void shouldReturnsNotFoundForVersion() throws Exception {
        mockMvc.perform(get("/api/v1/version1"))
                .andExpect(status().isNotFound());
    }
}
