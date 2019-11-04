package com.vtalent.java.srikarreddy;

import java.util.Scanner; 
class Outer{
	

class OversException extends Exception{
public String toString() {
return "exception";
}
}
class BallsException extends Exception{
public String toString() {
return "exception";
}
}}
class CricketInnings {
static Scanner sc=new Scanner(System.in);
static String teamA,teamB;
static int scoreA,scoreB;
static double d;
public void sample() {
System.out.println("enter teamA name");
teamA=sc.nextLine();
System.out.println("enter teamB name");
teamB=sc.nextLine();
System.out.println("welcome to odi between " +teamA+ " vs " +teamB+ ".");
firstinnings();
}
public static void firstinnings() {
System.out.println("First Innings by"+teamA+".");
System.out.println(" Is it raining yes or no ");
String ri=sc.next();
if(ri.equals("no")) {
System.out.println("overs played by" +teamA+ ".");
overs50();
System.out.println("runrate of" +teamA+ ".");
double d1=sc.nextDouble();
scoreA=(int)(d*d1);
if(d==50) {
int wickets = 6;
System.out.println("score of " +teamA+ "=" +scoreA+ "/" +wickets);
secondinnings();
}else
if(d<50) {
int wickets=10;
System.out.println("score of" +teamA+ "=" +scoreA+ "/" +wickets);
secondinnings();
}
}else{
System.out.println("is it raining after 1hour yes or no");
String ri1=sc.next();
if(ri1.equals("no")) {
System.out.println("overs reduced to 40");
System.out.println("overs played by" +teamA+ ".");
   overs40();
System.out.println("runrate of" +teamA+ ".");
double d1=sc.nextDouble();
scoreA=(int)(d*d1);
if(d<=40 && d1<=5.5) {
int wickets=10;
System.out.println("score of" +teamA+ "=" +scoreA+ "/" +wickets);
secondinnings();
}
}else {
System.out.println("is it raining after2hours yes or no");
String ri2=sc.next();
if(ri2.equals("no")) {
System.out.println("overs reduced to 30");
System.out.println("overs played by" +teamA+ ".");
overs30();
System.out.println("runrate of" +teamA+ ".");
double d1=sc.nextDouble();
scoreA=(int)(d*d1);
if(d<=30 && d1<=7) {
int wickets=10;
System.out.println("score of" +teamA+ "=" +scoreA+ "/" +wickets);
secondinnings();
}
}else {
System.out.println("is it ranning after 3hours yes or no");
String ri3=sc.next();
if(ri3.equals("no")) {
System.out.println("overs reduced to 15");
System.out.println("overs played by" +teamA+ ".");
overs15();
System.out.println("runrate of" +teamA+ ".");
double d1=sc.nextDouble();
scoreA=(int)(d*d1);
if(d<=15 && d1<=8) {
int wickets=10;
System.out.println("score of " +teamA+ "=" +scoreA+ "/" +wickets);
secondinnings();
}
}else {
System.out.println("match abonded due to rain");
}
}
}
}}
public static void overs50() {
try {
d=sc.nextDouble();
if(d>50) {
throw new Exception();
}else {
System.out.println("no exception");
}

}catch(Exception e){
System.out.println("exception " +e);
System.out.println("enter<=50");
overs50();
}
}
public static void overs40() {
try {
d=sc.nextDouble();
if(d>40) {
throw new Exception();
}else {
System.out.println("no exception");
}

}catch(Exception e){
System.out.println("exception " +e);
System.out.println("enter<=40");
overs40();
}
}
public static void overs30() {
try {
d=sc.nextDouble();
if(d>30) {
throw new Exception();
}else {
System.out.println("no exception");
}

}catch(Exception e){
System.out.println("exception " +e);
System.out.println("enter<=30");
overs30();
}
}public static void overs15() {
try {
d=sc.nextDouble();
if(d>15) {
throw new Exception();
}else {
System.out.println("no exception");
}

}catch(Exception e){
System.out.println("exception " +e);
System.out.println("enter<=50");
overs15();
}
}
public static void secondinnings() {
System.out.println("Second Innings by"+teamB+".");
System.out.println(" Is it raining yes or no ");
String ri=sc.next();
if(ri.equals("no")) {
System.out.println("overs played by" +teamB+ ".");
overs50();
System.out.println("runrate of" +teamB+ ".");
double d1=sc.nextDouble();
scoreB=(int)(d*d1);
if(d==50) {
int wickets = 6;
System.out.println("score of " +teamB+ "=" +scoreB+ "/" +wickets);
}else
if(d<50) {
int wickets=10;
System.out.println("score of" +teamB+ "=" +scoreB+ "/" +wickets);
}
if(scoreB==scoreA) {
System.out.println("match tied");
}else if(scoreB<scoreA) {
int s=scoreA - scoreB;
System.out.println( teamA+ "won by" +s+ "runs.");
}else if(scoreB>scoreA) {
int s=scoreB - scoreA;
System.out.println(teamB+ "won by" +s+ "runs.");
}
}else{
System.out.println("is it raining after 1hour yes or no");
String ri1=sc.next();
if(ri1.equals("no")) {
System.out.println("overs reduced to 40");
System.out.println(teamB +" target is "+(89*(scoreA)/100) );
System.out.println("overs played by" +teamB+ ".");
   overs40();
System.out.println("runrate of" +teamB+ ".");
double dd1=sc.nextDouble();
scoreB=(int)(d*dd1);
if(d<=30 && dd1<=5.5) {
int wickets=10;
System.out.println("score of" +teamB+ "=" +scoreB+ "/" +wickets);
}if((89*(scoreA)/100)==scoreB) {
System.out.println("match tied");
}else if((89*(scoreA)/100)>scoreB) {
int ss=(89*(scoreA)/100)-scoreB;
System.out.println( teamA+ "won by" +ss+ "runs.");
}else if(scoreB>(89*(scoreA)/100)) {
int ss1=scoreB-(89*(scoreA)/100);
System.out.println(teamB+ "won by" +ss1+ "runs.");
}
}else {
System.out.println("is it raining after2hours yes or no");
String ri2=sc.next();
if(ri2.equals("no")) {
System.out.println("overs reduced to 30");
System.out.println(teamB +" target is "+(75*(scoreA)/100) );
System.out.println("overs played by" +teamB+ ".");
overs30();
System.out.println("runrate of" +teamB+ ".");
double dd1=sc.nextDouble();
scoreB=(int)(d*dd1);
if(d<=30 && dd1<=7) {
int wickets=10;
System.out.println("score of" +teamB+ "=" +scoreB+ "/" +wickets);
}
if((75*(scoreA)/100)==scoreB) {
System.out.println("match tied");
}else if((75*(scoreA)/100)>scoreB) {
int sss=(75*(scoreA)/100)-scoreB;
System.out.println( teamA+ "won by" +sss+ "runs.");
}else if(scoreB>(75*(scoreA)/100)) {
int ss2=scoreB-(75*(scoreA)/100);
System.out.println(teamB+ "won by" +ss2+ "runs.");
}
}else {
System.out.println("is it raing after 3hours yes or no");
String ri3=sc.next();
if(ri3.equals("no")) {
System.out.println("overs reduced to 15");
System.out.println(teamB +" target is "+(40*(scoreA)/100) );
System.out.println("overs played by" +teamB+ ".");
overs15();
System.out.println("runrate of" +teamB+ ".");
double dd1=sc.nextDouble();
scoreB=(int)(d*dd1);
if(d<=15 && dd1<=8) {
int wickets=10;
System.out.println("score of " +teamB+ "=" +scoreB+ "/" +wickets);
}if((40*(scoreA)/100)==scoreB) {
System.out.println("match tied");
}else if((40*(scoreA)/100)>scoreB) {
int sss1=(40*(scoreA)/100)-scoreB;
System.out.println( teamA+ "won by" +sss1+ "runs.");
}else if(scoreB>(40*(scoreA)/100)) {
int ss2=scoreB-(40*(scoreA)/100);
System.out.println(teamB+ "won by" +ss2+ "runs.");
}
}else {
System.out.println("match abonded due to rain");
}
}
}
}}


}

public class Cricket {
public static void main(String[] args) throws Exception {
CricketInnings ci=new CricketInnings();
ci.sample();



}
}
