package org.redrover;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW11 {
    @Test
    public void testStringUtils(){
        Assert.assertEquals(StringUtils.capitalize(null),null);
        Assert.assertEquals(StringUtils.capitalize(""),"");
        Assert.assertEquals(StringUtils.capitalize("dog"), "Dog");
        Assert.assertEquals(StringUtils.capitalize("dOg"), "DOg");
        Assert.assertEquals(StringUtils.capitalize("'dog'"), "'dog'");
    }
}
