package com.sample.code.test.com.service.impl;

import com.sample.code.test.com.model.Response;
import com.sample.code.test.com.service.StairClimbing;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StairClimbingImpl implements StairClimbing
{
    @Autowired
    Response response;

    /**
     *
     * @param routes
     * @param numberOfStep
     * @return
     * @throws IOException
     */
    @Override
    public Response printCombinations(int[] routes,int numberOfStep) throws IOException, JSONException {
        // create the combination stack.
        // Longest possible combination is 1 step each time.

        int [] combinations = new int[numberOfStep];
        int combLength = 0;
        List<int[]> results = new ArrayList<>();
        recurseRoute(numberOfStep,routes,combinations,combLength,results);
        response.setPrintStepCombinations(results);
        response.setNumberOfSteps(results.size());
        return response;
    }

    private static void recurseRoute( int remaining,  int[] strides,
             int[] combination,  int comblength,  List<int[]> results) {
        if (remaining < 0) {
            // this combination takes us too far.
            return;
        }
        if (remaining == 0) {
            // this combination is just right.
            results.add(Arrays.copyOf(combination, comblength));
            return;
        }
        // need to go further.
        for (int s : strides) {
            combination[comblength] = s;
            recurseRoute(remaining - s, strides, combination, comblength + 1, results);
        }

    }
}
