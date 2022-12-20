import com.sg.dvdlibary.controller.DVDLibaryController;
import com.sg.dvdlibary.dao.DVDLibaryDao;
import com.sg.dvdlibary.dao.DVDLibaryDaoException;
import com.sg.dvdlibary.dao.DVDLibaryDaoFileImpl;
import com.sg.dvdlibary.ui.DVDLibaryView;
import com.sg.dvdlibary.ui.UserIO;
import com.sg.dvdlibary.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) throws DVDLibaryDaoException {
        UserIO myIo = new UserIOConsoleImpl();
        DVDLibaryView myView = new DVDLibaryView(myIo);
        DVDLibaryDao myDao = new DVDLibaryDaoFileImpl();
        DVDLibaryController controller =
                new DVDLibaryController(myDao, myView);
        controller.run();
    }

}
