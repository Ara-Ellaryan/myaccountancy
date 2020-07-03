package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.ProductCategoryDto;
import am.ara.mynotebook.entity.accountancy.ProductCategoryEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ProductCategoryMapper extends Mapper<ProductCategoryEntity, ProductCategoryDto> {
}
