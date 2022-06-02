class Main {
    public static void main(String[] args){
        Complex a = new Complex(1,2.2);
        Complex b = new Complex();
        b.userInput();

        Complex addition = Complex.add(a,b);
        Complex subtraction = Complex.sub(a,b);

        addition.display();
        subtraction.display();

    }
}