package EXTENDED;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author ADMIN
 */
public class CRC {

    static String str = "00020101021238550010A000000727012500069704230111vothaidubi20208QRIBFTTA53037045405255005802VN6304";//A228";

    public static void crc() throws UnsupportedEncodingException {
        int crc = 0xFFFF;          // initial value
        int polynomial = 0x1021;   // 0001 0000 0010 0001  (0, 5, 12)

        byte[] testBytes = str.getBytes("ASCII");

//        byte[] bytes = args[0].getBytes();
        for (byte b : testBytes) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b >> (7 - i) & 1) == 1);
                boolean c15 = ((crc >> 15 & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit) {
                    crc ^= polynomial;
                }
            }
        }

        crc &= 0xffff;
        if (Integer.toHexString(crc).length() < 4) {
            System.out.println("0" + Integer.toHexString(crc));
        } else {
            System.out.println(Integer.toHexString(crc));
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        crc();
    }

    public static int CRC16_CCITT_FALSE(byte[] bytes) {
        int crc = 0xffff; // initial value
        int polynomial = 0x1021; // poly value
        for (int index = 0; index < bytes.length; index++) {
            byte b = bytes[index];
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b >> (7 - i) & 1) == 1);
                boolean c15 = ((crc >> 15 & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit) {
                    crc ^= polynomial;
                }
            }
        }
        crc &= 0xffff;
        return crc;
    }

}
