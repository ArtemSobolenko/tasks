package tasks.task2.view;

import tasks.task2.entity.Cover;
import tasks.task2.exeptions.SideException;
import tasks.task2.services.CoverService;

import java.io.BufferedReader;
import java.io.IOException;

public class Menu {
    private final BufferedReader BUFFERED_READER;
    private final CoverService COVER_SERVICE;

    public Menu(BufferedReader BUFFERED_READER, CoverService COVER_SERVICE) {
        this.BUFFERED_READER = BUFFERED_READER;
        this.COVER_SERVICE = COVER_SERVICE;
    }

    public void showMenu() throws IOException {
        do {
            try {
                Cover cover1 = COVER_SERVICE.createCover(createCoverSide(), createCoverSide());
                System.out.println(cover1.toString() + " ready!");
                Cover cover2 = COVER_SERVICE.createCover(createCoverSide(), createCoverSide());
                System.out.println(cover2.toString() + " ready!");
                if (COVER_SERVICE.compareCovers(cover1, cover2)) {
                    System.out.println("Cover " + cover1.getId() + " biggest as cover " + cover2.getId());
                } else if (COVER_SERVICE.compareCovers(cover2, cover1)) {
                    System.out.println("Cover " + cover2.getId() + " biggest as cover " + cover1.getId());
                } else {
                    System.out.println("Cover " + cover1.getId() + " as same as cover " + cover2.getId());
                }
            } catch (SideException e) {
                e.printStackTrace();
                System.out.println("You need try it again for all covers!");
            }
        } while (isRun());
    }

    private double createCoverSide() throws SideException {
        System.out.println("Enter a size of the side...\n");
        try {
            double side = Double.parseDouble(BUFFERED_READER.readLine());
            if (side <= 0) {
                throw new SideException("The size of the side must be a positive number!\n");
            } else {
                return side;
            }
        } catch (IOException | NumberFormatException e) {
            throw new SideException("Do not enter letters!\n");
        }
    }

    private boolean isRun() throws IOException {
        String answer;
        boolean run;
        System.out.println("Do you want to continue...?\n\"y\"/\"yes\"\n");
        answer = BUFFERED_READER.readLine().toLowerCase();
        if (answer.equals("y") || answer.equals("yes")) {
            run = true;
        } else {
            run = false;
        }
        return run;
    }
}
