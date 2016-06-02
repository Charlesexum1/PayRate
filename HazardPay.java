public class HazardPay extends PayCalculator {
	public HazardPay(double newPayRate) {
		payRate = newPayRate;
		}
	public double computePay(double hours) {
		return (payRate * hours) * 1.5;
		}
	public static void main(String[] args) {
		HazardPay demo = new HazardPay(10.0);
		System.out.println(demo.computePay(10));
		}		
	}
