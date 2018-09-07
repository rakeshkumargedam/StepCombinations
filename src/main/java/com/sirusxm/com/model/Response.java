package com.sirusxm.com.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Response
{
    private int numberOfSteps;
    private List<int[]> printStepCombinations;

    public int getNumberOfSteps()
    {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps)
    {
        this.numberOfSteps = numberOfSteps;
    }

    public List<int[]> getPrintStepCombinations()
    {
        return printStepCombinations;
    }

    public void setPrintStepCombinations(List<int[]> printStepCombinations)
    {
        this.printStepCombinations = printStepCombinations;
    }
}
