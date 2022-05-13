package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.allowedmeasureunit.AllowedMeasureUnit;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/unit")
public class AllowedUnitController {

    @Resource
    private AllowedUnitService allowedUnitService;


    @GetMapping("/id")
    @Operation(summary = "leiab measure unit id-d ingredient id kaudu")
    public List<AllowedMeasureUnitResponse> getMeasureUnitsByIngredientId(@RequestParam Integer ingredientId) {
        return allowedUnitService.getMeasureUnitsByIngredientId(ingredientId);
    }

//    @PostMapping("/conversion")
//    @Operation(summary = "leiab conversionmultiplieri id kaudu")
//    public UnitMultiplierResponse getConversionMultiplier(@RequestBody AllowedUnitRequest request) {
//
//        return allowedUnitService.getConversionMultiplier(request);
//    }

    @PostMapping("/measureunits")
    @Operation(summary = "Lisame lubatud measure unitsid ingredientile")
    public void addAllowedMeasureUnits(@RequestBody List<AllowedMeasureUnitDto1> allowedMeasureUnitDto1s) {
        allowedUnitService.addAllowedMeasureUnits(allowedMeasureUnitDto1s);
    }
}
