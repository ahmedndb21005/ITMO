package mypackage;


import java.util.Random;

public class Main {

	public static long[] Array1(int lower , int upper)
	{
		int length = (upper - lower)/2 + 1;
		long[] Array1 = new long[length];
		for(int i=0; i<Array1.length ; i++)
		{
			Array1[i] = upper - 2*i;
		}
		return Array1;
	}
	public static double[] Array2(double From ,double To)
	{
		double[] Array2 = new double[14];
		Random rnd = new Random();
		for(int i=0 ; i<Array2.length;i++)
		{
			Array2[i] = (rnd.nextDouble()*(To-From)+From);
		}
		return Array2;
	}
	public static double TheHardThings(long l , double x)
	{
		if(l==6)
		{
			return Math.sin(Math.atan(Math.pow((x-2)/8, 2)));
		}
		if(l==10 || l==12 || l==14 || l==16 || l==18)
		{
			return Math.log(Math.exp(Math.tan(Math.atan((x-2)/8))));
		}
		else
		{
			return Math.pow(Math.sin(Math.tan(Math.pow((1.0/4)/x, x))), Math.log(Math.abs(Math.asin(Math.exp(-1*Math.abs(x))))));
		}
		
	}
	public static double[][] Array3(int rows ,int cols, long[] l , double[]x)
	{
		double[][] Array3 = new double[rows][cols];
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<cols ; j++)
			{
				Array3[i][j] = TheHardThings(l[i],x[j]);
			}
		}
		return Array3;
	}
	public static void PrintArray(long [] Array)
	{
		for(long num : Array)
		{
			System.out.printf( num + "\t");
		}
		System.out.println();
	}
	public static void PrintArray(double[] Array)
	{
		for(double num : Array)
		{
			System.out.printf("%.3f\t", num);
		}
		System.out.println();
	}
	public static void PrintArray(double [][] Array)
	{
		for(double[] rows : Array)
		{
			for(double row : rows)
			{
				System.out.printf("%10.3f" , row);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		long [] Array1 = Array1(2,22);
		double[] Array2 = Array2(-6.0,2.0);
		double[][] Array3 = Array3(11,14,Array1,Array2);
		
		
		PrintArray(Array1);
		PrintArray(Array2);
		PrintArray(Array3);

	}

}
