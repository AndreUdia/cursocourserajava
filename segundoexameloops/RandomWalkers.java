public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        
        double agregate = 0.0;

        for (int i = 0; i < trials; i++) {
            int steps = 0;
            int x = 0;
            int y = 0;
            while ((Math.abs(x) + Math.abs(y)) < r) {
                int temp = (int) (Math.random() * 4);
                if (temp == 0) {
                    x++;
                } else if (temp == 1) {
                    x--;
                } else if (temp == 2) {
                    y++;
                } else {
                    y--;
                }
                steps++;
            }
            agregate += steps;
        }
        double average = agregate / trials;
        System.out.println("average number of steps = " + average);
    }
}