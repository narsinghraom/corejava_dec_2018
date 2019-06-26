package com.vtalent.sneha;

final class Complex {
    private  double re,  im;
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    Complex(Complex c)
    {
      System.out.println("Copy constructor called");
      re = c.re;
      im = c.im;
    }            
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }            
}



	

