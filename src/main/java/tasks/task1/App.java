package tasks.task1;

import tasks.task1.entity.ChessDesk;
import tasks.task1.exeptions.ArgsException;
import tasks.task1.services.DeskService;
import tasks.task1.services.impl.DeskServiceImpl;
import tasks.task1.validators.ValidationService;
import tasks.task1.validators.impl.ValidationServiceImpl;

public class App {

    private static DeskService deskService = new DeskServiceImpl();
    private static ValidationService validationService = new ValidationServiceImpl();

    public static void main(String[] args) {
        try {
            int[] widthAndHeight = validationService.validationArgs(args);
            ChessDesk chessDesk = deskService.createChessDesk(widthAndHeight[0], widthAndHeight[1]);
            deskService.printChessDesk(chessDesk);
        } catch (ArgsException e) {
            e.printStackTrace();
        }
    }
}
