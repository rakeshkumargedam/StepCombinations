package com.sirusxm.com.controller;

import com.sirusxm.com.model.Response;
import com.sirusxm.com.service.StairClimbing;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CombinationController
{

    @Autowired
    StairClimbing stairClimbing;
    @Autowired Response response;

    @GetMapping(value = "/ladder/step/printCombinations/{numberOfSteps}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get All the combination of steps by providing number of steps and using either one or two "
            + "steps only.")
    public ResponseEntity<Response> printCombinations(@PathVariable int numberOfSteps) {

        int [] stepsCombination =  {1,2};
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
