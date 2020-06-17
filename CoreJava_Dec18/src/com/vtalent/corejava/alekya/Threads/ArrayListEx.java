package com.vtalent.corejava.alekya.Threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListEx {
public static void main(String[] args) {
//non-generic Type
ArrayList al=new ArrayList(); //null memory
al.add("Hello");//al is added with hello instead of null i.e., previous memory is deleted
al.add(new Integer(10));// new array with [10] instead of hello
System.out.println(al);
String Name =(String) al.get(0);//get
Object id=al.get(0);//casting mechanism to avoid this we are going for generic
//Generic Type
ArrayList<String> al1=new ArrayList(); //Here we can add only string type
al1.add("Hi");
al1.add("Hello");
String sl1=al1.get(0);//here no need casting so it is generic type
al1.add(null);//here it will allow null also 
al1.add(2,"bye");
System.out.println(al1);
ArrayList<String> al2=new ArrayList<String>();
al2.add("secondObject");
al1.addAll(al2);
Iterator<String> itr=al1.iterator();
while(itr.hasNext()) //check whether the elements are present in collection or not
{
System.out.println(itr.next());
}
ArrayList<Integer> arr=new ArrayList<Integer>();//add(int index, E element method
arr.add(1);
arr.add(21);
arr.add(0,12);
System.out.println(arr);
ArrayList<Integer> arr1=new ArrayList<Integer>();
arr1.add(10);
arr1.add(20);
arr1.add(30);
arr1.add(40);
System.out.println(arr1);
arr.addAll(arr1);//addAll(Collection<? extends E> c)
System.out.println("perint all");
for(Integer number : arr)
	System.out.println(number);
ArrayList<String> a3=new ArrayList<String>();//clear()
a3.add("abc");
a3.add("def");
System.out.println(a3);
a3.clear();
System.out.println(a3);

ArrayList<Integer> ar=new ArrayList<Integer>();//clone()
ar.add(1);
ar.add(2);
ar.add(3);
ar.add(4);
System.out.println("first array list:" +ar);
ArrayList ar1=new ArrayList();
ar1=(ArrayList)ar.clone();
System.out.println("Second array list" +ar1);
ArrayList<Integer> ar7=new ArrayList<Integer>(4);//	contains(Object o)
ar7.add(1);
ar7.add(12);
ar7.add(121);
ar7.add(1212);
System.out.println(ar7);
//element at 2nd postion
int value=ar7.get(2);
System.out.println("retrived elementat index 2 i.e. 3rd position =" +value);//get(int index)
boolean ans=ar7.contains(12);
if (ans)
	System.out.println("list contains 12");
else
	System.out.println("list doessnt contains 12");
//above use contains() to check if the element 2 exits or not
ans=ar7.contains(5);
if (ans)
	System.out.println("list contains 5");
else
	System.out.println("list doessnt contains 5");
ArrayList<String> a31=new ArrayList<String>(4);//ensureCapacity(int minCapacity)
a31.add("tom");
a31.add("mat");
a31.add("cat");
a31.add("dog");
//increase capacity to 10
a31.ensureCapacity(10);
a31.add("Alekya");
//print all the elements available in list
for(String s: a31){
	System.out.println(s);
}
ArrayList<Integer> bl = new ArrayList<Integer>();//isEmpty()
//Checking whether the list is empty
System.out.println("Is ArrayList Empty: "+bl.isEmpty());

bl.add(1);
bl.add(88);
bl.add(9);
bl.add(17);

System.out.println("Is ArrayList Empty: "+bl.isEmpty());

for (Integer num: bl) {
System.out.println(num);
}

ArrayList<String> cl = new ArrayList<String>();//	remove(int index)  
cl.add("AB");
cl.add("CD");
cl.add("EF");
cl.add("GH");
cl.add("AB");
cl.add("YZ");
System.out.println("ArrayList before remove:");
for(String var: cl){
     System.out.println(var);
}

cl.remove(0);
cl.remove(2);
cl.remove(2);

System.out.println("ArrayList After remove:");
for(String var2: cl){
      System.out.println(var2);
}

ArrayList<String> Dl = new ArrayList<String>();//remove(Object o)
Dl.add("AA");
Dl.add("BB");
Dl.add("CC");
Dl.add("DD");
Dl.add("EE");
Dl.add("FF");
System.out.println("ArrayList before remove:");
for(String var: Dl){
    System.out.println(var);
}
//Removing element AA from the arraylist
Dl.remove("AA");
//Removing element FF from the arraylist
Dl.remove("FF");
//Removing element CC from the arraylist
Dl.remove("CC");
/*This element is not present in the list so
 * it should return false
 */
boolean b=Dl.remove("GG");
System.out.println("Element GG removed: "+b);
System.out.println("ArrayList After remove:");
for(String var2: Dl){
    System.out.println(var2);
}  
ArrayList<Integer> arraylist = new ArrayList<Integer>(50);//trimToSize()
arraylist.add(1);
arraylist.add(2);
arraylist.add(3);
arraylist.add(4);
arraylist.add(5);
arraylist.add(6);
arraylist.add(7);
arraylist.add(1);
arraylist.add(1);
arraylist.add(1);
arraylist.trimToSize();
System.out.println(arraylist);


ArrayList<Integer> El=new ArrayList<Integer>();//Size()
System.out.println("Initial size: "+El.size());
El.add(1);
El.add(13);
El.add(45);
El.add(44);
El.add(99);
System.out.println("Size after few additions: "+El.size());
El.remove(1);
El.remove(2);
System.out.println("Size after remove operations: "+El.size());
System.out.println("Final ArrayList: ");
for(int num: El){
    System.out.println(num);
}
ArrayList<String> hb = new ArrayList<String>();//indexOf(Object o)
hb.add("AB");
hb.add("CD");
hb.add("EF");
hb.add("GH");
hb.add("IJ");
hb.add("KL");
hb.add("MN");

System.out.println("Index of 'AB': "+hb.indexOf("AB"));
System.out.println("Index of 'KL': "+hb.indexOf("KL"));
System.out.println("Index of 'Ax': "+hb.indexOf("Ax"));//As you can see in the output that the index of element ‘Ax’ is returned as -1 because this element does not exist in the ArrayList.
System.out.println("Index of 'EF': "+hb.indexOf("EF"));


ArrayList<Integer> sl = new ArrayList<Integer>();//lastIndexOf(Object o)
//The method lastIndexOf(Object obj) returns the index of last occurrence of the specified element in the ArrayList. It returns -1 if the specified element does not exist in the list.
//public int lastIndexOf(Object obj)This would return the index of last Occurrence of element Obj in the ArrayList.
sl.add(1);
sl.add(88);
sl.add(9);
sl.add(17);
sl.add(17);
sl.add(9);
sl.add(17);
sl.add(91);
sl.add(27);
sl.add(1);
sl.add(17);

System.out.println("Last occurrence of element 1: "+sl.lastIndexOf(1));
System.out.println("Last occurrence of element 9: "+sl.lastIndexOf(9));
System.out.println("Last occurrence of element 17: "+sl.lastIndexOf(17));
System.out.println("Last occurrence of element 91: "+sl.lastIndexOf(91));
System.out.println("Last occurrence of element 88: "+sl.lastIndexOf(88)); 
System.out.println("Last occurrence of element 82: "+sl.lastIndexOf(82)); 


ArrayList<String> cli = new ArrayList<String>();//removeAll(Collection<?> c)

// use add() method to add values in the list
cli.add("Alekya");
cli.add("Babulu");
cli.add("Rashi");

// create an empty array sample with an initial capacity 
ArrayList<String> sample = new ArrayList<String>();

// use add() method to add values in the list 
sample.add("Akhila"); 
sample.add("Rashi"); 
sample.add("Alekya");

// remove all elements from second list if it exists in first list
sample.removeAll(cli);

System.out.println("First List :"+ cli);
System.out.println("Second List :"+ sample);

ArrayList<String> colorlist = new ArrayList<String>(5);//toArray(T[] a)

// use add() method to add values in the list
colorlist.add("White");
colorlist.add("Black");
colorlist.add("Red");
colorlist.add("White");
colorlist.add("Yellow");

System.out.println("Size of the color_list: " + colorlist.size());

// Print the colors in the list
for (String value1 : colorlist){
  System.out.println("Color = " + value1);
}  
// Create an array from the ArrayList
String colorlist2[] = new String[colorlist.size()];
colorlist2 = colorlist.toArray(colorlist2);
     
// Display the contents of the array
System.out.println("Printing elements of color_list2:"); 
for (String color : colorlist2) {
  System.out.println("Color = " + color);
}
ArrayList<String> list1 = new ArrayList<String>(5);//toArray()

// use add() method to add values in the list
list1.add("White");
list1.add("Black");
list1.add("Red");
list1.add("White");
	list1.add("Yellow");

System.out.println("Size of list: " + list1.size());

// Print the colors in the list
for (String st : list1) {
  System.out.println("Color = " + st);
}  
// Create an array from the ArrayList
Object[] obj = list1.toArray();

// Display the contents of the array
System.out.println("Printing elements from first to last:"); 
for (Object st : obj) {
  System.out.println("Color = " + st);
}
ArrayList<Integer> array = new ArrayList<Integer>();//set()
array.add(1);
array.add(2);
array.add(3);

System.out.println("ArrayList before update: "+array);

array.set(0, 111);
array.set(1, 33);
array.set(2, 35);

System.out.println("ArrayList after Update: "+array);


ArrayList<String> li = new ArrayList<String>();//subList(int fromIndex, int toIndex)

// use add() method to add values in the list
li.add("alekya");
li.add("suma");
li.add("nikhil");
li.add("sujatha");
li.add("shailu");
System.out.println("List of the colors :" +li);

//Return portion of the list : fromindex(inclusive)->1,  toindex(exclusive)->3
 ArrayList<String> new_color_list1 = new ArrayList<String>(li.subList(1, 3));
 System.out.println("Portion of the list: "+new_color_list1);

//Return empty list as fromindex and toindex are equal
 ArrayList<String> new_color_list2 = new ArrayList<String>(li.subList(3, 3));
 System.out.println("Portion of the list: "+new_color_list2);



 ArrayList<String> col = new ArrayList<String>();//listIterator()

 // use add() method to add values in the list
 col.add("Hi");
 col.add("Hello");
	col.add("how r u");

System.out.println("print above :" + col);

// using listIterator() method get a ListIterator object
 ListIterator itrr = col.listIterator();
	   
//Use hasNext() and next() methods to iterate through the elements in forward direction.
  System.out.println("Iterating in forward direction");
  while(itrr.hasNext())
   System.out.println(itrr.next());


// Use hasPrevious() and previous() methods to iterate through the elements in backward direction.
   System.out.println("Iterating in backward direction");
	   
 while(itrr.hasPrevious())
   System.out.println(itrr.previous());


 ArrayList<String> hi = new ArrayList<String>();//retainAll(Collection<?> c)
 hi.add("orange");
 hi.add("mango");
hi.add("apple");

// create an empty array sample with an initial capacity 
	ArrayList<String> sam = new ArrayList<String>();
	
// use add() method to add values in the list 
 sam.add("kiwi"); 
	sam.add("apple"); 
	sam.add("orange");
		
 System.out.println("First List :"+ hi);
	System.out.println("Second List :"+ sam);
	
	sam.retainAll(hi);
	
	System.out.println("After applying the method, First List :"+ hi);
	System.out.println("After applying the method, Second List :"+ sam);

}
}