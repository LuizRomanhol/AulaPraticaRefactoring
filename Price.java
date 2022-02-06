public abstract class Price {
   public abstract int getPriceCode();
	public abstract double getCharge(int daysRented);
	class ChildrensPrice ...
	   public double getCharge(int daysRented) {
		  double result = 1.5;
		  if (daysRented > 3)
			 result += (daysRented - 3) * 1.5;
		  return result;
	   }
	class NewReleasePrice ...
	   public double getCharge(int daysRented){
		  return daysRented * 3;
	   } 
	class RegularPrice ...
	   public double getCharge(int daysRented) {
		  double result = 2;
		  if (daysRented > 2)
			 result += (daysRented - 2) * 1.5;
		  return result;
	   }
   public int getFrequentRenterPoints(int daysRented) {
       return 1;
   }
}