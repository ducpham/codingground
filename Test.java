/*
 *  Created : 2020-12-22
 *
 *  Copyright (c) 2020 Ericsson AB, Sweden.
 *  All rights reserved.
 *  The Copyright to the computer program(s) herein is the property of Ericsson AB, Sweden.
 *  The program(s) may be used and/or copied with the written permission from Ericsson AB
 *  or in accordance with the terms and conditions stipulated in the agreement/contract
 *  under which the program(s) have been supplied.
 */

package jivetests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ecudhap
 */
public class Test  {

    public static void main(String[] args) {
        Board firstBoard = new Board();
        firstBoard.initBoard();

        Position totTrangPos = new Position(0,1);
        List<Position> validMoves = firstBoard.getValidMoves(totTrangPos);

        //Tot trang len 1
        if (validMoves.size() == 0) {
            System.out.println("Het duong di, thua");
        }

        try {
            Board secondBoard = firstBoard.move(totTrangPos, validMoves.get(0));
        } catch (Exception ex) {
            System.out.println("Invalid move");
        }



    }





}
