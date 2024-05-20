package com.tvt.code;

public class Test {
    public static void main(String[] args) {
        int a = solution("1.1.2", "1.1.2.0");

        System.out.println(a);
    }
    //ask - solution  - verify parameter - 3 examples at least
    //test cases (special case 1.1.0)
    //if versionA > versionB return 1
    //if versionB < versionB return -1
    //if equal return 0
    public static int solution(String versionA, String versionB) {
        String[] ver1Arr = versionA.split("\\.");
        String[] ver2Arr = versionB.split("\\.");

        int size = Math.max(ver1Arr.length, ver2Arr.length);

        for(int i = 0; i < size; i++) {
            int valA = i < ver1Arr.length ? Integer.parseInt(ver1Arr[i]) : 0;
            int valB = i < ver2Arr.length ? Integer.parseInt(ver2Arr[i]) : 0;

            if (valA > valB) {
                return 1;
            } else if (valA < valB) {
                return -1;
            }
        }
        return 0;
    }
}


// poker, texas, fibonacci
// L class abtract bird implementation not use accordingly
// Rest method


//java
//async simple task, queue for service with service
//generic
//enum
//comparable and compartor
//error vs exception
//synchronzied keyword
//quialifer primary


//spring
// dynamic query - if else - predicate - querydsl
//communication rest, grpc, queue
//BFF API composition
//api/v1
//sleuth id request - zipkin
//mcokbean injectmock mock


//deployment blue/green
// how to design endpoint


//principle
// Open and close
// singleton and factory, adapter, proxy
// Clean code
//stateful and stateless

