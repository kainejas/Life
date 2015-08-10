/**
 * Created by jason on 8/10/15.
 */
public class Life {
    
	
	/*
	*   Rules:
    *   1, Any live cell with fewer than two live neighbours dies, as if caused by under-population.
    *   2. Any live cell with two or three live neighbours lives on to the next generation.
    *   3. Any live cell with more than three live neighbours dies, as if by overcrowding.
    *   4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
	*/

    private boolean cells[][];
    private boolean tempCells[][];



    //Purpose: Return the amount of live neighbors a given cell has
    private int neighbors(int row, int col) {
        //TODO: Implement this method using the 'cells' array
    }



    //Purpose: Proceed to t = t+1 in the simulation
    public void next (){

        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells.length; j++) {
                tempCells[i][j] = cells[i][j]; //Copy the board to the temporary variable
            }
        }


        //TODO: Apply life/death rules to each 'Cell' in tempCells
        for(int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells.length; col++) {
                int n = neighbors(row,col);
            }
        }




        cells = tempCells;
    }


}

