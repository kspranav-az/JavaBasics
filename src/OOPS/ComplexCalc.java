package OOPS;

import static java.lang.Math.abs;

public class ComplexCalc {
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(5,-3);
        ComplexNumber c2 = new ComplexNumber(7,2);
        ComplexNumber c3 = ComplexNumber.Div(c1,c2);
        ComplexNumber c4 = c2.Add(c1);
        ComplexNumber c5 = ComplexNumber.Sub(c2,c3);
        c3.Print();
        c4.Print();
        c5.Print();
    }
}

class ComplexNumber{
    private float real,imag;
    ComplexNumber(){
    }
    ComplexNumber(float real ,float imag){
        this.real = real;
        this.imag = imag;
    }
    public ComplexNumber Complement(){
        return new ComplexNumber(real,-(imag));
    }
    public static ComplexNumber Add(ComplexNumber c1, ComplexNumber c2){
        return new ComplexNumber(c1.real+ c2.real,c1.imag + c2.imag);
    }
    public ComplexNumber Add(ComplexNumber c1){
        return new ComplexNumber(c1.real+real,c1.imag +imag);
    }
    public static ComplexNumber Sub(ComplexNumber c1, ComplexNumber c2){
        return new ComplexNumber(c1.real - c2.real,c1.imag - c2.imag);
    }
    public ComplexNumber Sub(ComplexNumber c1){
        return new ComplexNumber(real - c1.real,imag - c1.imag);
    }
    public static ComplexNumber Mul(ComplexNumber c1, ComplexNumber c2){
        return new ComplexNumber((c1.real * c2.real) - (c1.imag * c2.imag),(c1.imag * c2.real) + (c1.real * c2.imag));
    }
    public ComplexNumber Mul( ComplexNumber c1){
        return new ComplexNumber((c1.real * real) - (c1.imag * imag),(c1.imag * real) + (c1.real * imag));
    }
    public static ComplexNumber Div(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber temp = Mul(c1,c2.Complement());
        float n = (c2.Mul(c2.Complement())).real;
        return new ComplexNumber(temp.real/n,temp.imag/n);
    }
    public ComplexNumber Div(ComplexNumber c1){
        return new ComplexNumber(real - c1.real,imag - c1.imag);
    }
    public void Print(){
        System.out.println(real + " " + ((imag<0)?"- ":"+ ") + abs(imag)+"i");
    }
}

