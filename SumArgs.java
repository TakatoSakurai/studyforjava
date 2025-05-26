public class SumArgs {
    public static void main(String[] args) {
        double[] nums = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Double.parseDouble(args[i]);
        }

        double sum = 0.00d;
        for (double d : nums) {
            sum += d;
        }
        System.out.print("goukei " + sum);
    }
}