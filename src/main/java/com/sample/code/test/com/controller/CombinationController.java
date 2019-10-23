package com.sample.code.test.com.controller;

import com.sample.code.test.com.model.Response;
import com.sample.code.test.com.service.StairClimbing;
import com.sample.code.test.com.utils.StringToIntArrayConverter;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CombinationController
{

    @Autowired
    StairClimbing stairClimbing;
    @Autowired Response response;
    @Autowired
    StringToIntArrayConverter stringToIntArrayConverter;

    @GetMapping(value = "/ladder/step/printCombinations/{numberOfSteps}/{combinations}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get All the combination of steps by providing number of steps and using the iteration provided "
            + "steps only.")
    public ResponseEntity<Response> printCombinations(@PathVariable int numberOfSteps, @PathVariable String combinations) throws Exception {


        int [] stepsCombination =  stringToIntArrayConverter.getIntArray(combinations);
        List<int[]> resp = null;
        try
        {
            response = stairClimbing.printCombinations(stepsCombination,numberOfSteps);
        }
        catch (IOException e)
        {
            e.getMessage();
        }
        return ResponseEntity.ok(response);
    }

}
