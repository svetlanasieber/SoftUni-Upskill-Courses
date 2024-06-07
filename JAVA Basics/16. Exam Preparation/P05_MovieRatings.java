//https://judge.softuni.org/Contests/Practice/Index/1596#4

public class P04_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        int countMovies = Integer.parseInt(scanner.nextLine());
 
        double lowestRating = 11;
        String movieWithLowestRating = "";
 
        double highestRating = 0;
        String movieWithHighestRating = "";
 
        double sumRatings = 0;
 
        for (int i = 1; i <= countMovies ; i++) {
 
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
 
            sumRatings += rating;
 
            if(rating > highestRating){
                movieWithHighestRating = name;
                highestRating = rating;
            }
 
            if (rating < lowestRating){
                movieWithLowestRating = name;
                lowestRating = rating;
            }
        }
 
        double averageRating = sumRatings / countMovies;
 
        System.out.printf("%s is with highest rating: %.1f%n", movieWithHighestRating, highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", movieWithLowestRating, lowestRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
