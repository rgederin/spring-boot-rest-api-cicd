package com.gederin.api.controller;

import com.gederin.api.TestHelper;
import com.gederin.api.service.CarBrandService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.gederin.api.TestHelper.asJsonString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class CarBrandControllerTest {

    @Mock
    private CarBrandService carBrandService;

    @InjectMocks
    private CarBrandController carBrandController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(carBrandController)
                .build();
    }

    @Test
    void shouldReturnOkResponseForBrandsEndpoint() throws Exception {
        when(carBrandService.getAllCarBrands()).thenReturn(TestHelper.buildCarBrandListDtoTestObject());

        mockMvc.perform(get("/api/v1/brands")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturnOkResponseForBrandByIdEndpoint() throws Exception {
        when(carBrandService.getCarBrandById(1L)).thenReturn(TestHelper.buildCarBrandDtoTestObject());

        mockMvc.perform(get("/api/v1/brand/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturnOkResponseForDeleteBrandByIdEndpoint() throws Exception {
        mockMvc.perform(delete("/api/v1/brand/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturnCreatedResponseForAddNewBrandRepository() throws Exception {
        mockMvc.perform(post("/api/v1/brand")
                .content(asJsonString(TestHelper.buildCarModelDtoTestObject()))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }
}