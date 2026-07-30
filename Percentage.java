public class Percentage {
    public static void main(String[] args) {

        int maxScore = 500;
        int userScore = 375;

        double percentage = (double) userScore / maxScore * 100;

        System.out.println("User Score Percentage = " + percentage + "%");
    }
}
