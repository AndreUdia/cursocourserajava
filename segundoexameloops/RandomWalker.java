public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");

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
            System.out.println("(" + x + ", " + y + ")");
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}