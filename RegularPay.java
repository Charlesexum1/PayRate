public class RegularPay extends PayCalculator {
	public RegularPay(double newPayRate) {
		payRate = newPayRate;
		}
	public static void main(String[] args) {
		RegularPay demo = new RegularPay(100.00);
		System.out.println(demo.computePay(10));
		}			
	}
