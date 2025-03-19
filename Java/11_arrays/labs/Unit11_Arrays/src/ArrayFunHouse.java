//© A+ Computer Science  -  www.apluscompsci.com
//Name - Parth Zanwar
//Date - 4/29/24
//Class - Com Sci 1k
//Lab  - ArrayFunHouse

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
 //instance variables and constructors could be used, but are not really needed

 //getSum() will return the sum of the numbers from start(inclusive) to stop(inclusive)
 public static int getSum(int[] numArray, int start, int stop)
 {
  int sum = 0;
  for (int i = start; i <=stop; i++){
   sum += numArray[i];
  }
  return sum;
 }

 //getCount() will return number of times val is present
 public static int getCount(int[] numArray, int val)
 {
  int c = 0;
  for (int i : numArray){
   if (val==i)c++;
  }
  return c;
 }

 public static int[] removeVal(int[] numArray, int val)
 {
  int valC = 0;
  for (int i : numArray){
   if (val==i)valC++;
  }
  int[] ret = new int[numArray.length-valC];
  for (int i = 0, j = 0; i < numArray.length; i++){
   if (numArray[i]==val) continue;
   ret[j] = numArray[i];
   j++;
  }
  numArray=ret;
  return numArray;
 }
}