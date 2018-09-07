package com.sirusxm.com.service;

import com.sirusxm.com.model.Response;

import java.io.IOException;
import java.util.List;


public interface StairClimbing

{
    public Response printCombinations(int[] routes,int n) throws IOException;
}
