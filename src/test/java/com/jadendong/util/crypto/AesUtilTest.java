package com.jadendong.util.crypto;

import org.junit.Assert;
import org.junit.Test;


public class AesUtilTest {
    private static byte[] bytes = new byte[]{1, 2, 3, 4, 5, 0x0A};
    private static byte[] key = new byte[]{0, 0x0B, 0x0C, 0x0E, 0x0F, 0x0A, 0, 0x0B, 0, 0x0B, 0x0C, 0x0E, 0x0F, 0x0A, 0, 0x0B};

    @Test
    public void test() {
        byte[] content = AesUtil.encrypt(bytes, key);
        Assert.assertArrayEquals(bytes, AesUtil.aesDecrypt(content, key));
    }
}
