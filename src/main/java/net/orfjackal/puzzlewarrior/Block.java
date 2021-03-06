package net.orfjackal.puzzlewarrior;

/**
 * @author Esko Luontola
 * @since 24.2.2008
 */
public interface Block {

    char EMPTY = '\0';
    char DIAMOND = '*';

    int centerRow();

    int centerCol();

    boolean hasPieceAt(int boardRow, int boardCol);

    char pieceAt(int boardRow, int boardCol);

    char type();

    boolean sameTypeAs(Block other);

    boolean isDiamond();

    boolean isExplosive();

    boolean canExplode(Block other);

    boolean touches(Block other);

    boolean canMoveDown(Board board);

    void moveDown();
}
