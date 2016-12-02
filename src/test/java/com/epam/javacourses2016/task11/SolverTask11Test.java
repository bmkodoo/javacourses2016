package com.epam.javacourses2016.task11;

import junit.framework.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.testng.Assert.*;

public class SolverTask11Test {

    @Test(enabled = false, dataProvider = "listofpeople")
    public void testEmulate(String[] members, String winner) throws Exception {
        SolverTask11 solver=new SolverTask11();
        Assert.assertEquals(solver.emulate(new ArrayList<String>(Arrays.asList(members))),winner);
    }

    @Test(enabled = false, dataProvider = "listofpeople")
    public void testEmulate1(String[] members, String winner) throws Exception {
        SolverTask11 solver=new SolverTask11();
        Assert.assertEquals(solver.emulate(new LinkedList<String>(Arrays.asList(members))),winner);

    }

    /**
     * Удаление происходит, начиная с первого (условие задачи)
     *
     */

@DataProvider(name ="listofpeople")
    private Object[][] peoples(){
    return new Object[][]{
            {new String[]{"a", "b", "c", "d", "e","f"}, "d"},
            {new String[]{"a"}, "a"},
            {new String[]{"Bob", "Rob", "Dan", "Stan", "Ron","Victor", "Don"}, "Victor"},
    };
}
}