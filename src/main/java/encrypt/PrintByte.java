package encrypt;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class PrintByte {

    @Test
    public void test() throws UnsupportedEncodingException {
        PrintByte.getChinese();

        PrintByte.getEnglish();
    }

    // 中文在GBK编码下, 占据2个字节
    // 中文在UTF-8编码下, 占据3个字节
    private static void getChinese() throws UnsupportedEncodingException {
        String a = "我";
        byte[] bytes = a.getBytes("UTF-8");//数组大小为3 有3个字节
        for (byte b : bytes) {
            // 获取字节
            System.out.print(b + "   ");
            // 获取位
            String s = Integer.toBinaryString(b);
            System.out.println(s);
        }
    }

    // 英文在GBK和UTF-8编码下,始终占据一个字节
    private static void getEnglish() throws UnsupportedEncodingException {
        String a = "A";
        byte[] bytes = a.getBytes("GBK");//数组大小为1 有1个字节
        for (byte b : bytes) {
            // 获取字节
            System.out.print(b + "   ");
            // 获取位
            String s = Integer.toBinaryString(b);
            System.out.println(s);
        }
    }
}
