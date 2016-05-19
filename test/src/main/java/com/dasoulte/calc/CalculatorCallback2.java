package com.dasoulte.calc;

public interface CalculatorCallback2<T> {
	T doSomethingWithLine(String line, T value);
}
