package com.vtalent.jhansi.basics;

import java.util.*;
class OversException extends Exception
{
	public String toString()
	{
		String s1="Overs not greater then 50: please enter <=50";
		return s1;
	}
}
