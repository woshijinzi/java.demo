package com.zerten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.annotation.Annotation;

public class CheckUtilsTest {
    @Test
    public void testIntEquals() {
        Assert.assertEquals(CheckUtils.equals(2,2),true);
    }
}
