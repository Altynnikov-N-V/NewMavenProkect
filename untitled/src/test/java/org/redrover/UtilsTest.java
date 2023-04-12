package org.redrover;

import org.example.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {
    @Test
    public void testSum() {
        Assert.assertEquals(Utils.sum(3, 4),7);
        }
    }

