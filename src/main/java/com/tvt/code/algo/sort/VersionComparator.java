package com.tvt.code.algo.sort;

public class VersionComparator {
    public static void main(String[] args) {
        String version1 = "1.0.0.1";
        String version2 = "1.0.0";

        int result = compareVersions(version1, version2);

        if (result > 0) {
            System.out.println(version1 + " is greater than " + version2);
        } else if (result < 0) {
            System.out.println(version1 + " is less than " + version2);
        } else {
            System.out.println(version1 + " is equal to " + version2);
        }
    }

    public static int compareVersions(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int length = Math.max(v1.length, v2.length);
        for (int i = 0; i < length; i++) {
            int num1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
            int num2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }
        return 0;
    }
}
