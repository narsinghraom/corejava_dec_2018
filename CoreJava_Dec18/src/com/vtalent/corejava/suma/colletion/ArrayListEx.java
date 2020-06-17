package com.vtalent.corejava.suma.colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Iterator;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		//non-generic Type
ArrayList al=new ArrayList(); //null memory
al.add("Hello");//al is added with hello instead of null i.e., previous memory is deleted
al.add(new Integer(10));// new array with [10] instead of hello
System.out.println(al);
String name =(String) al.get(0);
Object id=al.get(0);//to avoid casting mechanism we choose generic


//Generic Type
ArrayList<String> al1=new ArrayList(); //Here we can add only string type
al1.add("Hi");
al1.add("Hello");
String sl1=al1.get(0);//not required casting
al1.add(null);
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
arr.add(0,12);
System.out.println(arr);
ArrayList<Integer> arr1=new ArrayList<Integer>();
arr1.add(10);
arr1.add(20);
System.out.println(arr1);
arr.addAll(arr1);//addAll(Collection<? extends E> c)
System.out.println("Total");
for(Integer number : arr)
System.out.println(number);
ArrayList<String> a3=new ArrayList<String>();//clear()
a3.add("abc");
a3.add("def");
a3.add("xyz");

System.out.println(a3);
a3.clear();
System.out.println(a3);

ArrayList<Integer> ar=new ArrayList<Integer>();//clone()
ar.add(10);
ar.add(20);
ar.add(30);
ar.add(40);
System.out.println("first array list:" +ar);
ArrayList ar1=new ArrayList();
ar1=(ArrayList)ar.clone();
System.out.println("Second array list" +ar1);
ArrayList<Integer> ar5=new ArrayList<Integer>(4);// contains(Object o)
ar5.add(1);
ar5.add(11);
ar5.add(111);
System.out.println(ar5);
//element at 2nd postion
int value=ar5.get(2);
System.out.println("retrived element at index 2 i.e. 3rd position =" +value);//get(int index)
boolean ans=ar5.contains(12);
if (ans)
System.out.println("list contains 12");
else
System.out.println("list doessnt contains 12");
//above use contains() to check if the element 2 exits or not
ans=ar5.contains(5);
if (ans)
System.out.println("list contains 5");
else
System.out.println("list doessnt contains 5");
ArrayList<String> a31=new ArrayList<String>(4);//ensureCapacity(int minCapacity)
a31.add("aaa");
a31.add("bbb");
a31.add("ccc");
a31.add("ddd");
//increase capacity to 10
a31.ensureCapacity(10);
a31.add("how r yu");
//print all the elements available in list
for(String s: a31){
System.out.println(s);
}
ArrayList<Integer> bl = new ArrayList<Integer>();//isEmpty()
//Checking whether the list is empty
System.out.println("Is ArrayList Empty: "+bl.isEmpty());

bl.add(5);
bl.add(10);
bl.add(15);
bl.add(20);

System.out.println("Is ArrayList Empty: "+bl.isEmpty());

for (Integer num: bl) {
System.out.println(num);
}

ArrayList<String> cl = new ArrayList<String>();// remove(int index)  
cl.add("ABC");
cl.add("DEF");
cl.add("GHI");
cl.add("JKL");
cl.add("XYZ");
System.out.println("Before removing, the ArrayList is");
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
Dl.add("A");
Dl.add("B");
Dl.add("C");
Dl.add("D");
Dl.add("E");
Dl.add("F");
System.out.println("Before removing, the ArrayListis");
for(String var: Dl){
    System.out.println(var);
}
//Removing element A from the arraylist
Dl.remove("A");
//Removing element F from the arraylist
Dl.remove("F");
//Removing element C from the arraylist
Dl.remove("C");
/*This element is not present in the list so
 * it should return false
 */
boolean b=Dl.remove("G");
System.out.println("Element G removed: "+b);
System.out.println("ArrayList After remove:");
for(String var2: Dl){
    System.out.println(var2);
}  
ArrayList<Integer> arraylist = new ArrayList<Integer>(90);//trimToSize()
arraylist.add(1);
arraylist.add(2);
arraylist.add(3);
arraylist.add(4);
arraylist.add(1);
arraylist.add(1);
arraylist.trimToSize();
System.out.println(arraylist);


ArrayList<Integer> El=new ArrayList<Integer>();//Size()
System.out.println("Initial size: "+El.size());
El.add(1);
El.add(13);
El.add(20);
El.add(40);
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


ArrayList<String> color_list = new ArrayList<String>();//removeAll(Collection<?> c)

// use add() method to add values in the list
color_list.add("Orange");
color_list.add("Black");
color_list.add("Yellow");

// create an empty array sample with an initial capacity
ArrayList<String> sample = new ArrayList<String>();

// use add() method to add values in the list
sample.add("Black");
sample.add("Red");
sample.add("Blue");

// remove all elements from second list if it exists in first list
sample.removeAll(color_list);

System.out.println("First List :"+ color_list);
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
String color_list2[] = new String[color_list.size()];
color_list2 = color_list.toArray(color_list2);
     
// Display the contents of the array
System.out.println("Printing elements of color_list2:");
for (String color : color_list2) {
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
ArrayList<Integer> array = new ArrayList<Integer>();
array.add(1);
array.add(2);
array.add(3);

System.out.println("ArrayList before update: "+array);

array.set(0, 111);
array.set(1, 33);
array.set(2, 35);

System.out.println("ArrayList after Update: "+array);




	} 

}
