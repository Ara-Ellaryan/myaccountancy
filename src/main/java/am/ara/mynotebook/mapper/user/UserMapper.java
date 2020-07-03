package am.ara.mynotebook.mapper.user;

import am.ara.mynotebook.dto.user.UserDto;
import am.ara.mynotebook.entity.user.UserEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserMapper extends Mapper<UserEntity, UserDto> {
}
