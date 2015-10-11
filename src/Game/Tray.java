package Game;

import Constant.ColorConstants;
import Constant.GameConstants;

/**
 * Created by Maxime on 10/10/2015.
 */
public class Tray {

    private Cell[][] matrice;

    private int dimension;

    public Tray(int dimension) {
        this.dimension = dimension;
        matrice = new Cell[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrice[i][j] = new Cell(i, j, "0");
            }
        }
    }

    /*********
     *METHODS*
     *********/

    public void setClearCell(int x, int y) {
        if (GameConstants.isVerbose()) {
            System.err.println("Case clair posée en [" + x + "][" + y + "]");
        }
        matrice[x][y].setColor(ColorConstants.CLEAR);
    }

    public void setDarkCell(int x, int y) {
        if (GameConstants.isVerbose()) {
            System.err.println("Case foncé posée en [" + x + "][" + y + "]");
        }
        matrice[x][y].setColor(ColorConstants.DARK);
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                result += "[" + matrice[j][i].getColor() + "]";
            }
            result += "\n";
        }
        return result;
    }

    /*********
     * GETTERS*
     *********/

    public int getDimension() {
        return dimension;
    }

    public Cell[][] getMatrice() {
        return matrice;
    }

    public Cell getCellIn(int x, int y) {
        return matrice[x][y];
    }

    public boolean isFree(int x, int y) {
        return matrice[x][y].getColor() == "0";
    }

    /*********
     * SETTERS*
     *********/

}
