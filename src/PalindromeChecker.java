import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        boolean flag =true;
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String input = scanner.nextLine();
        if(isPalindrome(input)) {
            System.out.println("Day tren la day Palindrome");
        } else {
            System.out.println("Day tren khong phai la day Palindrome");
        }
    }
}