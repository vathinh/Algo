package com.tvt.code.algo.sort;

public class CheckVersion {
    public static void main(String[] args) {
        String versionA = "1.0.2.3.4.1";
        String versionB = "1.0.1";

        int res = checkVersion(versionA, versionB);

        if(res == 1) {
            System.out.print(versionA + " is greater than version " + versionB);

        } else if (res == -1) {
            System.out.print(versionA + " is less than version " + versionB);

        } else {
            System.out.print(versionA + " is equal with version " + versionB);
        }

    }

    public static int checkVersion(String versionA, String versionB) {

        String[] ver1Arr = versionA.split("\\.");
        String[] ver2Arr = versionB.split("\\.");

        int maxSize = Math.max(ver1Arr.length, ver2Arr.length);

        for (int i = 0; i < maxSize; i++) {
            int numA = i < ver1Arr.length ? Integer.parseInt(ver1Arr[i]): 0;
            int numB = i < ver2Arr.length ? Integer.parseInt(ver2Arr[i]): 0;

            if(numA > numB) {
                return 1;
            } else if (numA < numB) {
                return -1;
            }
        }

        return 0;
    }
}
