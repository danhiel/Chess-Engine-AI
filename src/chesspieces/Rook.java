package chesspieces;

import chessboard.TileUI;

import java.util.Set;

/**
 * The class tracks basic information such as team color,
 * piece position, and piece value for the Rook.
 * Also calculates all the possible legal moves for the Rook
 * at its current position.
 *
 * @author  Danhiel Vu
 * @version 2.0
 * @since   1/23/2020
 */
public class Rook extends Piece {

    private static final int[] ROOK_MOVE_SET = {-8, -1, 1, 8};
    private static final int PIECE_VALUE = 5;

    public Rook(boolean isWhitePiece, boolean isBotSide, int piecePosition) {
        super(isWhitePiece, isBotSide, piecePosition);
    }

    @Override
    public String getPieceType() {
        return "Rook";
    }

    @Override
    public int getPieceValue() {
        return PIECE_VALUE;
    }

    @Override
    public Set<Integer> getAllMoves(TileUI[] chessBoard) {
        return getRepeatedMoves(chessBoard, ROOK_MOVE_SET);
    }
}
