package tasks.task1.services;

import tasks.task1.entity.ChessDesk;

public interface DeskService {
    ChessDesk createChessDesk(int width, int height);
    void printChessDesk(ChessDesk chessDesk);
}
