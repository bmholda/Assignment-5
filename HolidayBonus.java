public class HolidayBonus
{
     public static double[] calculateHolidayBonus(double[][] data, double high,
              double low, double other)
     {
          double[][] holidayBonusValues = new double[data.length][];
          for (int x = 0; x < data.length; x++)
          {
        	  holidayBonusValues[x] = new double[data[x].length];
          }
          for (int x = 0, j = 0; x < holidayBonusValues.length; x++, j++)
          {
              int highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, x);
              int lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,x);
              if (x < holidayBonusValues[j].length)
              {
            	  holidayBonusValues[highest][x] = high;
            	  holidayBonusValues[lowest][x] = low;
                   if (j == highest || j == lowest) {
                	   continue;
                   }else
                   {
                	   holidayBonusValues[j][x] = other;
                   }
              }
          }
          double[] storeBonus = new double[data.length];
          for (int x = 0; x < holidayBonusValues.length; x++)
          {
              for (int j = 0; j < holidayBonusValues[x].length; j++)
              {
            	  storeBonus[x] += holidayBonusValues[x][j];
              }
          }
          return storeBonus;
     }
     public static double calculateTotalHolidayBonus(double[][] data,
              double high, double low, double other)
     {
          double[][] holidayBonusValues = new double[data.length][];
          for (int x = 0; x < data.length; x++)
          {
        	  holidayBonusValues[x] = new double[data[x].length];
          }
          for (int x = 0, j = 0; x < holidayBonusValues.length; x++, j++)
          {
              int highestIndex = TwoDimRaggedArrayUtility
                        .getHighestInColumnIndex(data, x);
              int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,x);
              if (x < holidayBonusValues[j].length)
              {
            	  holidayBonusValues[highestIndex][x] = high;
            	  holidayBonusValues[lowestIndex][x] = low;
                   if (j == highestIndex || j == lowestIndex) {
                        continue;
                   }else
                   {
                	   holidayBonusValues[j][x] = other;
                   }
              }
          }
          double total = 0.0;
          for (int x = 0; x < holidayBonusValues.length; x++)
          {
              for (int j = 0; j < holidayBonusValues[x].length; j++)
              {
                   total += holidayBonusValues[x][j];
              }
          }
          return total;
     }
}