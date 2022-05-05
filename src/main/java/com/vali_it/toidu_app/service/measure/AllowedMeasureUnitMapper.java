package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnit;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AllowedMeasureUnitMapper {
    AllowedMeasureUnit allowedMeasureUnitDtoToAllowedMeasureUnit(AllowedMeasureUnitDto allowedMeasureUnitDto);

    AllowedMeasureUnitDto allowedMeasureUnitToAllowedMeasureUnitDto(AllowedMeasureUnit allowedMeasureUnit);

    List<AllowedMeasureUnitDto> toEntities(List<AllowedMeasureUnit> allowedMeasureUnit);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAllowedMeasureUnitFromAllowedMeasureUnitDto(AllowedMeasureUnitDto allowedMeasureUnitDto, @MappingTarget AllowedMeasureUnit allowedMeasureUnit);
}
