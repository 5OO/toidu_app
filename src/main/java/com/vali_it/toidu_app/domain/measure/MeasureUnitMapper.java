package com.vali_it.toidu_app.domain.measure;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface MeasureUnitMapper {
    MeasureUnit measureUnitDtoToMeasureUnit(MeasureUnitDto measureUnitDto);

    MeasureUnitDto measureUnitToMeasureUnitDto(MeasureUnit measureUnit);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateMeasureUnitFromMeasureUnitDto(MeasureUnitDto measureUnitDto, @MappingTarget MeasureUnit measureUnit);
}
