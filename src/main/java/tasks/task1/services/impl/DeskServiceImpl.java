package tasks.task1.services.impl;

import tasks.task1.services.DeskService;

public class DeskServiceImpl implements DeskService {

    private StringBuilder deskLineStartWithStar = new StringBuilder();
    private StringBuilder deskLineStartWithSpace = new StringBuilder();
    private StringBuilder doubleLine = new StringBuilder();
    private StringBuilder chessDesk = new StringBuilder();

    @Override
    public String createChessDesk(int width, int height) {
        doubleLine.append(createDeskLineWhichStartWithStar(width)).append(createDeskLineWhichStartWithSpace(width));
        for (int i = 0; i < height / 2; i++) {
            chessDesk.append(doubleLine);
        }
        if (height % 2 != 0) {
            chessDesk.append(deskLineStartWithStar);
        }
        return chessDesk.toString();
    }

    private StringBuilder createDeskLineWhichStartWithStar(int width) {
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
    public void printChessDesk(String desk) {
        System.out.println(desk);
    }
}
