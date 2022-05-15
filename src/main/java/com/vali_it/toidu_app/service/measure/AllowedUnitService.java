package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnit;
import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnitRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class AllowedUnitService {

    @Resource
    private AllowedMeasureUnitMapper allowedMeasureUnitMapper;
    @Resource
    private AllowedMeasureUnitRepository allowedMeasureUnitRepository;

    //Konvertimis kordaja kätte saamine ingredientId ja measureUnitId kaudu
//    Response JSON
//    {
//        "conversionMultiplier": 1.025
//    }
    public BigDecimal getConversionMultiplier(Integer ingredientId, Integer measureUnitId) {
        return allowedMeasureUnitRepository.findMultiplier(ingredientId, measureUnitId).getConversionMultiplier();
    }

    //
//    private Integer ingredientId;
//    private Integer measureUnitId;
    //Otsib ingredientId järgi sellele vastavad mõõtühikud ja nende id
    // Response JSON
//    {
//        "measureUnit": {
//        "id": 3,
//                "name": "tk"
//    }
//    }
    public List<AllowedMeasureUnitResponse> getMeasureUnitsByIngredientId(Integer ingredientId) {
        List<AllowedMeasureUnit> allowedMeasureUnits = allowedMeasureUnitRepository.findByIngredientId(ingredientId);
        return allowedMeasureUnitMapper.toList(allowedMeasureUnits);
    }

    public AllowedMeasureUnitResponse getFirstMeasureUnitByIngredientId(Integer ingredientId) {
        List<AllowedMeasureUnit> allowedMeasureUnits = allowedMeasureUnitRepository.findByIngredientId(ingredientId);
        Optional<AllowedMeasureUnit> firstAllowedMeasureUnit = allowedMeasureUnits.stream().findFirst();
        AllowedMeasureUnitResponse response = new AllowedMeasureUnitResponse();
        response.setMeasureUnitId(firstAllowedMeasureUnit.get().getMeasureUnit().getId());
        response.setMeasureUnitName(firstAllowedMeasureUnit.get().getMeasureUnit().getName());
        return response;
    }

    public void addAllowedMeasureUnits(AllowedMeasureUnitDto1 allowedMeasureUnitDto1) {
        AllowedMeasureUnit allowedMeasureUnit = allowedMeasureUnitMapper.allowedMeasureUnitDto1ToAllowedMeasureUnit1(allowedMeasureUnitDto1);
        allowedMeasureUnitRepository.save(allowedMeasureUnit);
    }

//    public void addAllowedMeasureUnits(List<AllowedMeasureUnitDto1> allowedMeasureUnitDto1s) {
//        List<AllowedMeasureUnit> allowedMeasureUnits = allowedMeasureUnitMapper.dtosToEntities(allowedMeasureUnitDto1s);
//        allowedMeasureUnitRepository.saveAll(allowedMeasureUnits);
//    }
}
