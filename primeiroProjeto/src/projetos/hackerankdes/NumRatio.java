package projetos.hackerankdes;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class  NumRatio {
	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int pos = 0;
		int neg = 0;
		int ze = 0;
		

		for (int i: arr) {
            if (i>0) {
                pos++;
            } else if (i<0) {
                neg++;
            } else {
                ze++;
            }
            
            System.out.println("" + pos + neg + ze);
        }

		 System.out.printf("%.6f\n", (float)pos/arr.size());
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		System.out.println(n);
		plusMinus(arr);
		bufferedReader.close();
	}
}
