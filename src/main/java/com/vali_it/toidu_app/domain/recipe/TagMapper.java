package com.vali_it.toidu_app.domain.recipe;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TagMapper {
    Tag tagDtoToTag(TagDto tagDto);

    TagDto tagToTagDto(Tag tag);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTagFromTagDto(TagDto tagDto, @MappingTarget Tag tag);
}
