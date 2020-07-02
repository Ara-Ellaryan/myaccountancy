package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.ProductCategoryDto;
import am.ara.myaccountancy.entity.accountancy.ProductCategoryEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ProductCategoryMapper extends Mapper<ProductCategoryEntity, ProductCategoryDto> {
}
