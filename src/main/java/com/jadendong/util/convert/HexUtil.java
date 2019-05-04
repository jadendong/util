package com.jadendong.util.convert;

/**
 * @author : jaden dong
 * @date : 2019/4/26 0026
 */
public class HexUtil {

    /**
     * 16进制字符串转换成 byte[]
     */
    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (ByteUtil.charToByte(hexChars[pos]) << 4 | ByteUtil.charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    /**
     * byte[] 转换成16进制字符串
     * 默认全部大写输出
     */
    public static String byteToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (byte aSrc : src) {
            int v = aSrc & 0xFF;
            String hv = Integer.toHexString(v).length() == 1 ? ("0" + Integer.toHexString(v)) : Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString().toUpperCase();
    }
}
