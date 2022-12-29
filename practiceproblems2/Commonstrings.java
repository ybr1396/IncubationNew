package practiceproblems2;
import java.util.*;
public class Commonstrings {
static void find(Vector<String> list1, Vector<String> list2) {
		Vector<String> res = new Vector<>();
		int max_possible_sum = list1.size() + list2.size() - 2;
		for (int sum = 0; sum <= max_possible_sum; sum++) {
		for (int i = 0; i <= sum; i++)
		if (i < list1.size() && (sum - i) < list2.size() && list1.get(i) == list2.get(sum - i))
					res.add(list1.get(i));if (res.size() > 0) break;}
		for (int i = 0; i < res.size(); i++)System.out.print(res.get(i) + " ");}
public static void main(String[] args) {
		Vector<String> list1 = new Vector<>();
		list1.add("Shogun");
		list1.add("Tapioca Express");
		list1.add("Burger King");
		list1.add("KFC");
		Vector<String> list2 = new Vector<>();
		list2.add("KFC");
		list2.add("Shogun");
		list2.add("Burger King");
        find(list1, list2);}}

















//public static  String[] findRestaurant(String[] list1, String[] list2) {
//List < String > res = new ArrayList < > ();
//for (int sum = 0; sum < list1.length + list2.length - 1; sum++) {
//  for (int i = 0; i <= sum; i++) {
//      if (i < list1.length && sum - i < list2.length && list1[i].equals(list2[sum - i]))
//          res.add(list1[i]);
//  }
//  if (res.size() > 0)
//      break;
//}
//return res.toArray(new String[res.size()]);
//}
