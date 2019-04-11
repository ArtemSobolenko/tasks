package tasks.task2.services;

import tasks.task2.entity.Cover;

public interface CoverService {

    Cover createCover(double width, double height);

    boolean compareCovers(Cover cover1, Cover cover2);
}
