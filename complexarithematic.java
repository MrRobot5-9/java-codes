class Complex{
    double real;
    double imaginary;
    Complex (double r, double i){
    this.real = r;
    this.imaginary = i;
    }
    static Complex add(Complex n1,Complex n2){
    Complex n3 = new Complex(0,0);
    n3.real = n1.real + n2.real;
    n3.imaginary = n1.imaginary + n2.imaginary;
    return n3;
    }
    static Complex substract(Complex n1, Complex n2){
    Complex n4 = new Complex(0,0);
    n4.real = n1.real - n2.real;
    n4.imaginary = n1.imaginary - n2.imaginary;
    return n4;
    }
    static Complex multiply(Complex n1, Complex n2){
    Complex n5 = new Complex(0,0);
    n5.real = n1.real * n2.real;
    n5.imaginary = n1.imaginary * n2.imaginary;
    return n5;
    }
    static Complex division(Complex n1, Complex n2){
    Complex n6 = new Complex(0,0);
    n6.real = n1.real / n2.real;
    n6.imaginary = n1.imaginary / n2.imaginary;
    return n6;
    }
    static void display(Complex n3){
    System.out.println(n3.real + " + " + n3.imaginary);
    }
    }
    class Complex1
    {
    public static void main(String[]args){
    Complex n1 = new Complex(50, 18);
    Complex n2 = new Complex(20,3);
    Complex n3 = Complex.add(n1,n2);
    Complex.display(n3);
    Complex n4 = Complex.substract(n1,n2);
    Complex.display(n4);
    Complex n5 = Complex.multiply(n1,n2);
    Complex.display(n5);
    Complex n6 = Complex.division(n1,n2);
    Complex.display(n6);
    }
    }
    
