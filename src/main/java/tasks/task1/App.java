package tasks.task1;

import tasks.task1.entity.ChessDesk;
import tasks.task1.services.DeskService;
import tasks.task1.services.impl.DeskServiceImpl;

public class App {

    private static DeskService deskService = new DeskServiceImpl();

    public static void main(String[] args) {
        ChessDesk chessDesk = new ChessDesk(4, 4);
        chessDesk.setChessDesk(deskService.createChessDesk(chessDesk.getWidth(), chessDesk.getHeight()));
        deskService.printChessDesk(chessDesk.getChessDesk());
    }
}
