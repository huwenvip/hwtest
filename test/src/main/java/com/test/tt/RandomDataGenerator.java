package com.test.tt;

/**
 * @author HuWen
 * @data 2023/8/21  9:57
 * 坚持学习java!虎年虎虎虎！
 */
import java.util.Random;

public class RandomDataGenerator {
    private static final String[] FIRST_NAMES = {"张", "王", "李", "赵", "刘", "陈", "杨", "黄", "吴", "周"};
    private static final String[] LAST_NAMES = {"伟", "芳", "娜", "秀英", "敏", "静", "丽", "强", "磊", "军"};
    private static final String[] MOBILE_PREFIXES = {"135", "136", "137", "138", "139", "150", "151", "152", "157", "158"};

    public static String generateRandomIdNumber() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        // 生成前17位数字
        for (int i = 0; i < 17; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        // 计算校验码
        char checksum = calculateChecksum(sb.toString());
        sb.append(checksum);
        return sb.toString();
    }

    private static char calculateChecksum(String idNumberWithoutChecksum) {
        // 根据具体算法计算校验码
        // ...
        return 'X';
    }

    public static String generateRandomName() {
        Random random = new Random();
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        return firstName + lastName;
    }

    public static String generateRandomMobileNumber() {
        Random random = new Random();
        String prefix = MOBILE_PREFIXES[random.nextInt(MOBILE_PREFIXES.length)];
        StringBuilder sb = new StringBuilder(prefix);
        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String randomIdNumber = generateRandomIdNumber();
        System.out.println("随机身份证号码: " + randomIdNumber);

        String randomName = generateRandomName();
        System.out.println("随机姓名: " + randomName);

        String randomMobileNumber = generateRandomMobileNumber();
        System.out.println("随机手机号码: " + randomMobileNumber);
    }
}
