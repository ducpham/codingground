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
import java.util.List;
import java.util.Map;

/**
 * @author ecudhap
 */
public class Tot extends Piece{

    Tot(String name, String color) {
        super(name, color);
    }

    @Override
    public Position isValidMove(Board board, Position curPos, Position nextPos) {
        Piece curPiece = board.getPiece(curPos);
        Piece nextPiece = board.getPiece(nextPos);

        if (nextPiece == null || nextPiece.getColor() != curPiece.getColor()) {
            return nextPos;
        }
        return null;
    }

    @Override
    public List<Position> getValidMoves(Board board, Position curPos) {
        List<Position> validMoves = new ArrayList();
        //move up
        Position upPosition = new Position(curPos.getX(), curPos.getY()+1);
        if (isValidMove(board, curPos, upPosition) != null) {
            validMoves.add(upPosition);
        }
        //move down
        Position downPosition = new Position(curPos.getX(), curPos.getY()-1);
        if (isValidMove(board, curPos, downPosition) != null) {
            validMoves.add(downPosition);
        }
        //move left
        Position leftPosition = new Position(curPos.getX()-1, curPos.getY()+1);
        if (isValidMove(board, curPos, leftPosition) != null) {
            validMoves.add(leftPosition);
        }
        //move right
        Position rightPosition = new Position(curPos.getX()+1, curPos.getY()+1);
        if (isValidMove(board, curPos, rightPosition) != null) {
            validMoves.add(rightPosition);
        }
        return  validMoves;
    }
}
