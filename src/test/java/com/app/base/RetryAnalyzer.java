package com.app.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int retryAttemptsCounter = 0;
	int maxRetryLimit = 0;

	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) {
			if(retryAttemptsCounter < maxRetryLimit){
				retryAttemptsCounter++;
				return true;
			}
		}
		return false;
	}

}
