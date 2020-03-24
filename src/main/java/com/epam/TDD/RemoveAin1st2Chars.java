package com.epam.TDD;

public class RemoveAin1st2Chars {
	public String remove(String str) {
		int len = str.length();
		String result = "";
		if(len <= 1) {
			if(len == 1 && str.charAt(0) == 'A') {
				result = "";
			} else {
				result = str;
			}
		} else {
			if(str.charAt(0) == 'A' && str.charAt(1) == 'A') {
				result =  str.substring(2,len);
			} else if(str.charAt(0) == 'A') {
				result =  str.substring(1,len);
			} else if(str.charAt(1) == 'A') {
				result += str.charAt(0);
				result += str.substring(2,len);
			} else {
				result = str;
			}
		}
		return result;
	}

}
