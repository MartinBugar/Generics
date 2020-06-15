package com.prometheus.objects;

public class Pes {
    private String meno;

    public Pes (){}

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public Pes (String meno){
        this.meno = meno;
    }

    public void stekaj (){
        System.out.println("Haf Haf");
    }

    @Override
    public String toString() {
        return "Pes{" +
                "meno='" + meno + '\'' +
                '}';
    }
}
