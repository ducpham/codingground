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

import java.util.List;

/**
 * @author ecudhap
 */
public class Vua extends Piece{

    Vua(String name, String color) {
        super(name, color);
    }

    @Override
    public Position isValidMove(Board board, Position curPos, Position nextPos) {
        return null;
    }

    @Override
    public List<Position> getValidMoves(Board board, Position curPos) {
        return null;
    }


}
