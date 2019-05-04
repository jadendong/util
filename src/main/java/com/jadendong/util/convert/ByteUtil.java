package com.jadendong.util.convert;

public class ByteUtil {

    /**
     * byte[] to hexString
     * @param bytes
     * @return
     */
    public static String byteToHexString(byte[] bytes) {
        return HexUtil.byteToHexString(bytes);
    }

    /**
     * @param c 字符，限制十六进制内
     * @return byte
     */
    public static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }
}
