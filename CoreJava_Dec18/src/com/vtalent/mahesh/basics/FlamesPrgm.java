package com.vtalent.mahesh.basics;

public class FlamesPrgm {

/*	static void flames(String a, String b) {
		System.out.println("hello"+a+b);
		String c=a+b;
		System.out.println(c);
		
	
	}*/
	public static void main(String[] args) {
String a = "mahesh"; 
String b = "chinnu"; 

flames(a, b); 
} 
	static void flames(String a, String b){
		
		
		
		 int  k, l = 1, n, m, sc = 0, tc, rc = 0, fc = 5; 
		    
		  char c;
		   
		    n = a.length(); 
		    m = b.length(); 
		    tc = n + m; 
		  
		    for (int i = 0; i < n; i++) { 
		        c = a.charAt(i); 
		        for (int j = 0; j < m; j++) { 
		            if (c == b.charAt(j)) { 
		            	m=a.charAt(i) ; 
		                b[j] = -1; 
		                sc = sc + 2; 
		                break; 
		            } 
		        } 
		    } 
		  
		    rc = tc - sc; 
		  
		    for (i = 0;; i++) { 
		        if (l == (rc)) { 
		            for (k = i; f[k] != '\0'; k++) { 
		                f[k] = f[k + 1]; 
		            } 
		            f[k + 1] = '\0'; 
		            fc = fc - 1; 
		            i = i - 1; 
		            l = 0; 
		        } 
		        if (i == fc) { 
		            i = -1; 
		        } 
		        if (fc == 0) { 
		            break; 
		        } 
		        l++; 
		    } 
		  
		    // Print the results 
		    if (f[0] == 'e') 
		        printf("%s is ENEMY to %s ", q, w); 
		    else if (f[0] == 'f') 
		        printf("%s is FRIEND to %s ", q, w); 
		    else if (f[0] == 'm') 
		        printf("%s is going to MARRY %s", q, w); 
		    else if (f[0] == 'l') 
		        printf("%s is in LOVE with %s ", q, w); 
		    else if (f[0] == 'a') 
		        printf("%s has more AFFECTION on %s ", q, w); 
		    else
		        printf("%s and %s are SISTERS/BROTHERS ", q, w); 
		} 
	}
	}