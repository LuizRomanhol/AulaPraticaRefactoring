public class NewReleasePrice extends Price {
   public int getPriceCode() {
       return Movie.NEW_RELEASE;
   }
   public int getFrequentRenterPoints(int daysRented) {
       return (daysRented > 1) ? 2: 1;
   }
}