package org.ssara.sample;

public class ThreadImplMul extends Thread {
    private final Integer operandOne;
    private final Integer operandTwo;
    private Integer multiplication;

    @Override
    public void run() {
        multiplication = operandOne * operandTwo;
    }

    public ThreadImplMul(Integer operandOne, Integer operandTwo){
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
    }

    public Integer getOperandOne() {
        return operandOne;
    }

    public Integer getOperandTwo() {
        return operandTwo;
    }

    public Integer getMultiplication() {
        return multiplication;
    }
}
