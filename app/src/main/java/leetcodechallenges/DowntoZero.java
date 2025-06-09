package leetcodechallenges;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class DowntoZero {
    public static void main(String[] args) {
        int n = 11; // Example input
        int result = downToZero(n);
        System.out.println("Minimum operations to reduce " + n + " to zero: " + result);
    }

    public static int downToZero(int n) {
        if (n == 0) {
            return 0;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        Set<Integer> visited = new HashSet<>();

        pq.offer(new int[] { n, 0 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int num = curr[0];
            int steps = curr[1];

            if (num == 0) {
                return steps;
            }
            if (visited.contains(num)) {
                continue;
            }
            visited.add(num);

            pq.offer(new int[] { num - 1, steps + 1 });

            int largestDivisor = findLargestDivisor(num);
            System.out.println("Current number: " + num + ", Steps: " + steps + ", Largest Divisor: " + largestDivisor);
            if (largestDivisor != 1) {
                pq.offer(new int[] { num / largestDivisor, steps + 1 });
            }
        }
        return -1;
    }

    private static int findLargestDivisor(int n) {
        for (int i = n / 2; i >= 2; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
