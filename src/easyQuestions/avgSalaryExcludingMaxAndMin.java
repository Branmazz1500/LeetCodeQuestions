package easyQuestions;

public class avgSalaryExcludingMaxAndMin {
	public static double average(int[] salary) {
		int maxSalary = Integer.MIN_VALUE;
		int minSalary = Integer.MAX_VALUE;
		Double sum = 0.0;

		for (int s : salary) {
			sum += s;
			if (s > maxSalary) {
				maxSalary = s;
			} 
			if (s < minSalary) {
				minSalary = s;
			}
		}

		return (sum - maxSalary - minSalary) / (salary.length-2);
	}
	
	public static void main(String[] args) {
		int[] salaries = new int[] {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
		System.out.println(average(salaries));
		System.out.println("Hi");
	}
}
