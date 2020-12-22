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
public abstract class Piece {

    Piece (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public abstract Position isValidMove(Board board, Position curPos, Position nextPos);
    public abstract List<Position> getValidMoves(Board board, Position curPos);
}
