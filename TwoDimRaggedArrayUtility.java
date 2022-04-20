import java.io.*;
class TwoDimRaggedArrayUtility

{
     public static double[][] readFile(File file)
     {
          double[][] data = new double[6][];
          String line;
          int x = 0;
          try
          {
              BufferedReader file1 = new BufferedReader(new FileReader(file));
              while ((line = file1.readLine()) != null)
              {
                   String[] temp = line.split(" ");
                   int size = temp.length;
                   data[x] = new double[size];
                   for (int j = 0; j < size; j++)
                   {
                        data[x][j] = Double.parseDouble(temp[j]);
                   }
                   x++;
              }
              file1.close();
          }
          catch (Exception ep)
          {
              ep.printStackTrace();
          }
          return data;
     }
     public static void writeToFile(double[][] data, File file)
     {
          try
          {
              BufferedWriter file1 = new BufferedWriter(new FileWriter(file));
              for (int x = 0; x < data.length; x++)
              {
                   for (int j = 0; j < data[x].length; j++)
                   {
                        file1.write(data[x][j] + " ");
                   }
                   file1.newLine();
              }
              file1.close();
          }
          catch (Exception e)
          {
        	  System.out.println(e);
          }
     }
     static double getAverage(double[][] data) {
         int count = 0;
         double average = 0;
         for(int x = 0; x < data.length; x++) {
         	for( int k = 0; k < data[x].length; k++) {
         		average += data[x][k];
         		count++;
         	}
         }
         return (double)(average / count);
     }
     static double getTotal(double[][] data) {
         double total = 0;
         for (double[] allval: data) {
             for (double currentvalue: allval) {//for each loops
                 total += currentvalue;
             }
         }
         return total;
     } 
     public static double getRowTotal(double[][] data, int row) {
     	double total = 0;
     	for(int x = 0; x<data[row].length; x++) {
     		total += data[row][x];
     	}
     	return total;
     }
     public static double getColumnTotal(double[][] data, int col)

     {
          double total = 0;
          for (int x = 0; x < data.length; x++)
          {
              if (col <= data[x].length - 1)
                   total += data[x][col];
          }
          return total;
     }
     public static double getHighestInRow(double[][] data, int row) {
      	double highest = Integer.MIN_VALUE;
      	
      	for(int x = 0; x<data[row].length; x++) {
      		if(data[row][x] > highest) {
      			highest = data[row][x];
      		}
      	}
      	return highest;
      }
     static int getHighestInRowIndex(double[][] data, int row) {
  		int max = 0;
  		for(int x = 0; x < data[row].length; x++ ) {
  			if(data[row][x] > data[row][max]) {
  				max = x;
  			}
  		}
  		return max;
      }
     public static int getLowestInRowIndex(double[][] data, int row) {
      	int val = 0;
      	
      	for(int x = 0; x<data[row].length; x++) {
      		if(data[row][x] < data[row][val]) {
      			val = x;
      		}
      	}
      	return val;
      }
     public static double getLowestInRow(double[][] data, int row) {
     	double lowest = data[row][0];
     	
     	for(int x = 0; x<data[row].length; x++) {
     		if(data[row][x] < lowest) {
     			lowest = data[row][x];
     		}
     	}
     	return lowest;
     }
     static int getHighestInColumnIndex(double[][] data, int col) {
  		int max = 0;
  		for(int x = 0; x < data.length; x++ ) {
  			if(data[x].length > col) {
  				if(data[x][col] > data[max][col]) {
  					max = x;
  				}
  			}
  		}
  		return max;
      }
     public static double getHighestInColumn(double[][] data, int col) {
     	double highest = data[0][col];
     	
     	for(int x = 0; x<data.length; x++) {
     		if(col <= data[x].length-1) {
     			if(data[x][col] > highest) {
     				highest = data[x][col];
     			}
     		}
     	}
     	return highest;
     }
     public static double getLowestInColumn(double[][] data, int col) {
     	double lowest = data[0][col];
     	
     	for(int x = 0; x<data.length; x++) {
     		if(col <= data[x].length-1) {
     			if(data[x][col] < lowest) {
     				lowest = data[x][col];
     			}
     		}
     	}
     	return lowest;
     }
     public static double getLowestInArray(double[][] data){
       	double lowest = data[0][0];
       	for(int x = 0;  x < data.length; x++) {
       		for(int k = 0; k < data[x].length; k++) {
       			if(data[x][k] < lowest) {
       				lowest = data[x][k];
       			}
       		}
       	}
       	return lowest;
       }
     public static int getLowestInColumnIndex(double[][] data, int col) {
     	int val = 0;
     	
     	for(int x = 0; x<data.length; x++) {
     		if(data[x].length > col) {
     			if(data[x][col] < data[val][col]) {
     				val = x;
     			}
     		}
     	
     	}
     	return val;
     } 
     public static double getHighestInArray(double[][] data) {
     	double highest = data[0][0];
     	for(int x = 0; x < data.length; x++) {
     		for( int k = 0; k < data[x].length; k++) {
     			if(data[x][k] > highest) {
     				highest = data[x][k];
     			}
     		}
     	}
     	return highest;
     }
}