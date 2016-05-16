package com.dasoulte.calc;

import java.io.BufferedReader;
import java.io.IOException;

public interface CalculatorCallback {

	int action(BufferedReader br) throws NumberFormatException, IOException;
	
	
}
