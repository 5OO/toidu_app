package com.vali_it.toidu_app.domain.measure.allowedmeasureunit;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AllowedMeasureUnitMapper {
    AllowedMeasureUnit allowedMeasureUnitDtoToAllowedMeasureUnit(AllowedMeasureUnitDto allowedMeasureUnitDto);

    AllowedMeasureUnitDto allowedMeasureUnitToAllowedMeasureUnitDto(AllowedMeasureUnit allowedMeasureUnit);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAllowedMeasureUnitFromAllowedMeasureUnitDto(AllowedMeasureUnitDto allowedMeasureUnitDto, @MappingTarget AllowedMeasureUnit allowedMeasureUnit);
}
