package com.buoi7_0207_Polymorphism.lesson.entity;

public final class StudentIT extends Student {
    private String technical;

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    @Override
    public void outputData(){
        super.outputData();
        System.out.println("Kỹ thuật = "+ this.technical);
        System.out.println("---------------------------------------------- ");
    }
}
