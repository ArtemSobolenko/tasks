package tasks.task1.services.impl;

import tasks.task1.entity.ChessDesk;
import tasks.task1.services.DeskService;

public class DeskServiceImpl implements DeskService {

    private StringBuilder doubleLine = new StringBuilder();
    private StringBuilder chessDeskLikeString = new StringBuilder();

    @Override
    public ChessDesk createChessDesk(int width, int height) {
        ChessDesk chessDesk = new ChessDesk(width, height);
        doubleLine.append(createDeskLineWhichStartWithStar(width)
                .append(createDeskLineWhichStartWithSpace(width)));
        for (int i = 0; i < height / 2; i++) {
            chessDeskLikeString.append(doubleLine);
        }
        if (height % 2 != 0) {
            chessDeskLikeString.append(createDeskLineWhichStartWithSpace(width));
        }
        chessDesk.setChessDesk(chessDeskLikeString.toString());
        return chessDesk;
    }

    private StringBuilder createDeskLineWhichStartWithStar(int width) {
        StringBuilder deskLineStartWithStar = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                deskLineStartWithStar.append("*");
            } else {
                deskLineStartWithStar.append("_");
            }
        }
        return deskLineStartWithStar.append("\n");
    }

    private StringBuilder createDeskLineWhichStartWithSpace(int width) {
        StringBuilder deskLineStartWithSpace = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                deskLineStartWithSpace.append("_");
            } else {
                deskLineStartWithSpace.append("*");
            }
        }
        return deskLineStartWithSpace.append("\n");
    }

    @Override
    public void printChessDesk(ChessDesk chessDesk) {
        System.out.println(chessDesk.getChessDesk());
    }
}
