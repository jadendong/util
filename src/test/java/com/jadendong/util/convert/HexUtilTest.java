package com.jadendong.util.convert;

import org.junit.Assert;
import org.junit.Test;

public class HexUtilTest {

    private static byte[] bytes = new byte[]{1, 2, 3, 4, 5, 0x0A};
    private static String hex = "01020304050A";

    @Test
    public void hexStringToBytes() {
        Assert.assertEquals(hex, HexUtil.byteToHexString(bytes));
    }

    @Test
    public void byteToHexString() {
        byte[] result = HexUtil.hexStringToBytes(hex);
        Assert.assertArrayEquals(bytes, result);
    }
}
