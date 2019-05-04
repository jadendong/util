package com.jadendong.util.crypto;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author jaden
 */
public class AesUtil {

    /**
     * @param content    待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的 byte[]
     */
    public static byte[] encrypt(byte[] content, byte[] encryptKey) {
        if ((content != null) && (encryptKey != null)) {
            byte[] bytes = new byte[0];
            try {
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding ");
                cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey, "AES"));
                bytes = cipher.doFinal(content);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bytes;
        }
        return null;
    }

    /**
     * AES解密
     *
     * @param content 待解密的byte[]
     * @param decryptKey   解密密钥
     * @return 解密后的String
     */
    public static byte[] aesDecrypt(byte[] content, byte[] decryptKey) {
        if ((content != null) && (decryptKey != null)) {
            byte[] bytes = new byte[0];
            try {
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
                cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey, "AES"));
                bytes = cipher.doFinal(content);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return bytes;
        }
        return null;
    }
}
