package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
        	return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y *z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String args[]){
        Product obj = new Product();

        int twoIntProducts = obj.product(10, 200);
        int threeIntProducts = obj.product(55, 9, 21);
	   	  double twoDoubleProducts = obj.product(23.78d, 52.11d);
        
		    System.out.println(twoIntProducts);
	      System.out.println(threeIntProducts);
		    System.out.println(twoDoubleProducts);
    }
}
