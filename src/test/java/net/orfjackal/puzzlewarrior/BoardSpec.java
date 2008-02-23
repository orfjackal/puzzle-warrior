package net.orfjackal.puzzlewarrior;

import jdave.Specification;
import jdave.junit4.JDaveRunner;
import org.junit.runner.RunWith;

/**
 * @author Esko Luontola
 * @since 23.2.2008
 */
@RunWith(JDaveRunner.class)
public class BoardSpec extends Specification<Board> {

    private Board board;

    public class AnEmptyBoard {

        public Board create() {
            board = new Board(1, 1);
            return board;
        }

        public void isEmpty() {
            specify(board.toString(), does.equal(".\n"));
        }
    }

    public class AFallingBlock {

        public Board create() {
            board = new Board(3, 6);
            board.addBlock('b', 'g');
            return board;
        }

        public void startsFromTheTopMiddle() {
            specify(board.toString(), does.equal("...b..\n" +
                                                 "......\n" +
                                                 "......\n"));
        }

        public void fallsOnTick() {
            board.tick();
            specify(board.toString(), does.equal("...g..\n" +
                                                 "...b..\n" +
                                                 "......\n"));
        }
    }
}