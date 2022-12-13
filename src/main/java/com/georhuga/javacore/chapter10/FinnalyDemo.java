package com.georhuga.javacore.chapter10;

public class FinnalyDemo {
    static void procA() {
        try {
            System.out.println(" B теле метода procA()");
            throw new RuntimeException("дeмoнcтpaция");
        } finally {
            System.out.println("Блок оператора finally в методе procA() ");
        }
    }

    static void procB() {
        try {
            System.out.println("B теле метода procB()");
            return;
        } finally {
            System.out.println(
                    " Блок оператора finally в методе procB() ");
        }
    }

    static void procC() {
        try{
            System.out.println(" B теле метода p rocC() ");
        } finally {
            System.out.println(
                    " Блок оператора finally в методе procC() ");
        }
    }

    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception е) {
            System.out.println("Иcключeниe перехвачено ");
        }
        procB();
        procC();
    }
}

