package academy.devdojo.maratonajava.javacore.exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked Exception
        int[] nums = {1, 2};
        System.out.println(nums[2]); // NullPointerException
    }
}
