package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnit;
import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnitRepository;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AllowedUnitService {

    @Resource
    private AllowedMeasureUnitMapper allowedMeasureUnitMapper;
    @Resource
    private AllowedMeasureUnitRepository allowedMeasureUnitRepository;
    @Resource
    private UnitMultiplierResponse unitMultiplierResponse;


 //Otsib ingredientId järgi sellele vastavad mõõtühikud ja nende id
 // Response JSON
//    {
//        "measureUnit": {
//        "id": 3,
//                "name": "tk"
//    }
//    }
    public List<AllowedMeasureUnitDto> getMeasureUnits(AllowedUnitRequest request) {
        List<AllowedMeasureUnit> allowedMeasureUnits = allowedMeasureUnitRepository
                .findAllowedMeasureUnitByIngredientId(request.getIngredientId());
        return allowedMeasureUnitMapper.toEntities(allowedMeasureUnits);
    }

//Konvertimis kordaja kätte saamine ingredientId ja measureUnitId kaudu
//    Response JSON
//    {
//        "conversionMultiplier": 1.025
//    }
    public UnitMultiplierResponse getConversionMultiplier(AllowedUnitRequest request) {
        AllowedMeasureUnit conversionMultiplier =
                allowedMeasureUnitRepository.findMultiplier(request.getIngredientId(), request.getMeasureUnitId()); //otsib repositorist
        unitMultiplierResponse.setConversionMultiplier(conversionMultiplier.getConversionMultiplier()); //setib UnitMultiplierResponses olevale conversionMultiplierile eelnevalt realt saadud väärtuse
        return unitMultiplierResponse;
    }


    public List<MeasureUnitDto> getMeasureUnitsByIngredientId(Integer ingredeintId) {
        List<AllowedMeasureUnit> allowedMeasureUnits = allowedMeasureUnitRepository.getById(ingredeintId);
        return null;
    }
}
