package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnit;
import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnitRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class AllowedUnitService {
    @Resource
    private AllowedMeasureUnitMapper allowedMeasureUnitMapper;
    @Resource
    private AllowedMeasureUnitRepository allowedMeasureUnitRepository;
    @Resource
    private UnitMultiplierResponse unitMultiplierResponse;

    public List<AllowedMeasureUnitDto> getMeasureUnits(Integer ingredientId) {
        List<AllowedMeasureUnit> allowedMeasureUnits = allowedMeasureUnitRepository
                .findAllowedMeasureUnitByIngredientId(ingredientId);
        return allowedMeasureUnitMapper.toEntities(allowedMeasureUnits);
    }


    public UnitMultiplierResponse getConversionMultiplier(Integer ingredientId, Integer measureUnitId) {
        AllowedMeasureUnit conversionMultiplier = allowedMeasureUnitRepository.findByIngredient_IdAndMeasureUnit_Id(ingredientId, measureUnitId);
        unitMultiplierResponse.setConversionMultiplier(conversionMultiplier.getConversionMultiplier());
        return unitMultiplierResponse;
    }
}
