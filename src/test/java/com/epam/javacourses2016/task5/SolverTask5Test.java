package com.epam.javacourses2016.task5;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SolverTask5Test {

    @Test(enabled = true, dataProvider = "measurements")
    public void testCalcResistance(double[][] measurements, double result) throws Exception {
        SolverTask5 solver = new SolverTask5();
        List<Measurement> listMeasures = getMeasurements(measurements);
        Assert.assertEquals(solver.calcResistance(listMeasures), result);
    }

    public List<Measurement> getMeasurements(double[][] measurements) {
        List<Measurement> list = new ArrayList<>();

        for (double[] measure : measurements) {
            list.add(new Measurement(measure[0], measure[1]));
        }

        return list;
    }

    @DataProvider(name = "measurements")
    public Object[][] measurements() {
        return new Object[][]{
                {new double[][]{{1, 5}, {2, 10}, {3, 15}, {4, 20}}, 5}
        };
    }

}