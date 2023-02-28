package Calculadora;

public class Calculadora {
		
	double num1;
	double num2;
	double resultado;
	
	

public double suma(double num1, double num2) {
	double resultado=num1+num2;
	return resultado;
	
}
public double resta(double num1, double num2) {
	double resultado=num1-num2;
	return resultado;
}
public double multiplicar(double num1, double num2) {
	double resultado=num1*num2;
	return resultado;
}
public double division(double num1, double num2) {
	double resultado=num1/num2;
	return resultado;
}
public double modulor(double num1, double num2) {
	double resultado=num1%num2;
	return resultado;
}
}