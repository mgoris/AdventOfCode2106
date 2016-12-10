package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by mgoris on 10-12-2016.
 */
public class AoC8AGrid {
    private int width;
    private int height;
    private List<AoC8ACell> cells = new ArrayList<AoC8ACell>();

    public AoC8AGrid(int width, int height) {
        this.width = width;
        this.height = height;

        initialize();
    }

    private void initialize() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells.add(new AoC8ACell(x, y, "."));
            }
        }
    }

    public void print() {
        for (int y = 0; y < height; y++) {
            printSingleRow(getSingleRow(y));
        }
        System.out.println("");
    }

    public void createRectangleFromTopLeft(int width, int height) {
        for (AoC8ACell cell : cells) {
            if ((cell.getX() < width) && (cell.getY() < height)) {
                cell.setContent("#");
            }
        }
    }

    public void rotateColumnDownBy(int column, int positions) {
        HashMap<Integer, AoC8ACell> columnCells = getSingleColumn(column);
        HashMap<Integer, String> originalCellContents = new HashMap<Integer, String>();

        for (int y : columnCells.keySet()) {
            originalCellContents.put(y, columnCells.get(y).getContent());
        }

        for (int y : columnCells.keySet()) {
            AoC8ACell toCell = columnCells.get((y + positions) % height);
            toCell.setContent(originalCellContents.get(y));
        }
    }

    public void rotateRowRightBy(int row, int positions) {
        HashMap<Integer, AoC8ACell> rowCells = getSingleRow(row);
        HashMap<Integer, String> originalCellContents = new HashMap<Integer, String>();

        for (int x : rowCells.keySet()) {
            originalCellContents.put(x, rowCells.get(x).getContent());
        }

        for (int x : rowCells.keySet()) {
            AoC8ACell toCell = rowCells.get((x + positions) % width);
            toCell.setContent(originalCellContents.get(x));
        }
    }

    private void printSingleRow(HashMap<Integer, AoC8ACell> rowCells) {

        String[] rowContent = new String[width];
        int fillCount = 0;

        for (int x : rowCells.keySet()) {
            String content = rowCells.get(x).getContent();
            rowContent[x] = content;
            if(content == "#"){
                fillCount += 1;
            }
        }
        System.out.println(Arrays.toString(rowContent) + "  count:" + fillCount);
    }

    private HashMap getSingleRow(int row) {
        HashMap<Integer, AoC8ACell> rowCells = new HashMap<Integer, AoC8ACell>();

        for (AoC8ACell cell : cells) {
            if (cell.getY() == row) {
                rowCells.put(cell.getX(), cell);
            }
        }
        return rowCells;
    }

    private HashMap getSingleColumn(int column) {
        HashMap<Integer, AoC8ACell> columnCells = new HashMap<Integer, AoC8ACell>();

        for (AoC8ACell cell : cells) {
            if (cell.getX() == column) {
                columnCells.put(cell.getY(), cell);
            }
        }
        return columnCells;
    }


}
