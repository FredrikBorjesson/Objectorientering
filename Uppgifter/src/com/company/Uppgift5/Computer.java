package com.company.Uppgift5;

public class Computer {

    private double processor;
    private int memory;
    private int ssd;

    private Computer(ComputorBuilder builder){
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.ssd = builder.ssd;
    }

    public double getProcessor(){
       return processor;
    }

    public int getMemory(){
        return memory;
    }

    public int getSsd(){
        return ssd;
    }

    public static class ComputorBuilder{

        private double processor;
        private int memory;
        private int ssd;

        public ComputorBuilder processor(double processor){
            this.processor = processor;
            return this;
        }

        public ComputorBuilder memory(int memory){
            this.memory = memory;
            return this;
        }

        public ComputorBuilder ssd(int ssd){
            this.ssd = ssd;
            return this;
        }

        public Computer build(){
            if(processor == 0 || memory == 0 || ssd == 0) {
                throw new IllegalArgumentException("All hardware must be set");
            } else {
                return new Computer(this);
            }

        }

    }

}
