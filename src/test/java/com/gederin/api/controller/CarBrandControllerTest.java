package com.gederin.api.controller;

//
//@ExtendWith(MockitoExtension.class)
//class CarBrandControllerTest {
//
//    @Mock
//    private CarBrandService carBrandService;
//
//    @InjectMocks
//    private CarBrandController carBrandController;
//
//    private MockMvc mockMvc;
//
//    @BeforeEach
//    void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(carBrandController)
//                .build();
//    }
//
//    @Test
//    void shouldReturnOkResponseForBrandsEndpoint() throws Exception {
//        when(carBrandService.getAllCarBrands()).thenReturn(TestHelper.buildCarBrandListDtoTestObject());
//
//        mockMvc.perform(get("/api/v1/brands")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void shouldReturnOkResponseForBrandByIdEndpoint() throws Exception {
//        when(carBrandService.getCarBrandById(1L)).thenReturn(TestHelper.buildCarBrandDtoTestObject());
//
//        mockMvc.perform(get("/api/v1/brand/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void shouldReturnOkResponseForDeleteBrandByIdEndpoint() throws Exception {
//        mockMvc.perform(delete("/api/v1/brand/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void shouldReturnCreatedResponseForAddNewBrandRepository() throws Exception {
//        mockMvc.perform(post("/api/v1/brand")
//                .content(asJsonString(TestHelper.buildCarModelDtoTestObject()))
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isCreated());
//    }
//}