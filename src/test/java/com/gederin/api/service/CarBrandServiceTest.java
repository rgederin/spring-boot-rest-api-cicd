package com.gederin.api.service;

//
//@ExtendWith(MockitoExtension.class)
//class CarBrandServiceTest {
//
//    private final CarBrandMapper carBrandMapper = Mappers.getMapper(CarBrandMapper.class);
//
//    private final CarModelMapper carModelMapper = Mappers.getMapper(CarModelMapper.class);
//
//    @Mock
//    private CarBrandRepository carBrandRepository;
//
//    private CarBrandService carBrandService;
//
//    @BeforeEach
//    void setUp() {
//        carBrandService = new CarBrandService(carBrandRepository, carBrandMapper);
//    }
//
//    @Test
//    void shouldReturnListOfCarBrandsDto() {
//        when(carBrandRepository.findAll()).thenReturn(buildCarBrandListTestObject());
//
//        assertThat(carBrandService.getAllCarBrands(), notNullValue());
//        assertThat(carBrandService.getAllCarBrands().size(), is(2));
//    }
//
//    @Test
//    void shouldReturnCarBrandDtoById() {
//        when(carBrandRepository.findById(1L)).thenReturn(Optional.of(buildCarBrandTestObject()));
//
//        CarBrandDto carBrandDto = carBrandService.getCarBrandById(1L);
//
//        assertCarBrandDto(carBrandDto);
//    }
//
//    @Test
//    public void shouldAddNewCarBrand (){
//        when(carBrandRepository.save(any())).thenReturn(buildCarBrandTestObject());
//
//        assertCarBrandDto(carBrandService.createCarBrand(buildCarBrandDtoTestObject()));
//    }
//
//    @Test
//    void shouldDeleteCarBrandById() {
//        carBrandRepository.deleteById(1L);
//
//        verify(carBrandRepository, times(1)).deleteById(1L);
//    }
//
//    private void assertCarBrandDto(CarBrandDto carBrandDto) {
//        assertThat(carBrandDto, notNullValue());
//        assertThat(carBrandDto.getName(), is(NAME));
//        assertThat(carBrandDto.getCountry(), is(COUNTRY));
//        assertThat(carBrandDto.getDescription(), is(DESCRIPTION));
//    }
//}