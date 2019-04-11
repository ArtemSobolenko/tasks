package tasks.task2.services.impl;

import tasks.task2.entity.Cover;
import tasks.task2.services.CoverService;

public class CoverServiceImpl implements CoverService {
    private static int coverCounter;
    private static final int MAX_COVER_COUNT = 2;

    @Override
    public Cover createCover(double width, double height) {
        resetCoverCounter();
        Cover cover = new Cover(width, height);
        cover.setId(++coverCounter);
        return cover;
    }

    @Override
    public boolean compareCovers(Cover cover1, Cover cover2) {
        double square1 = cover1.getWidth() * cover1.getHeight();
        double square2 = cover2.getWidth() * cover2.getHeight();
        if (square1 > square2) {
            return true;
        } else {
            return false;
        }
    }

    private static void resetCoverCounter() {
        if (coverCounter >= MAX_COVER_COUNT) {
            coverCounter = 0;
        } else {
            //do nothing
        }
    }
}
