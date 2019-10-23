package com.sample.code.test.com.service;

import com.sample.code.test.com.model.Response;
import org.json.JSONException;

import java.io.IOException;


public interface StairClimbing

{
    public Response printCombinations(int[] routes, int n) throws IOException, JSONException;
}
