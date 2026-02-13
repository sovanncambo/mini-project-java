import controlor.StudentControler;
import db.StudentDb;
import mapper.StudentMapper;
import model.deo.StudentDeo;
import model.deo.StudentDeoImpl;
import model.service.StudentService;
import model.service.StudentServicempl;
import view.StudentView;

public class App {
    static void main(String[] args) {
        StudentDb db = new StudentDb();
        StudentView view = new StudentView();
        StudentDeo deo = new StudentDeoImpl(db);
        StudentMapper mapper = new StudentMapper();
        StudentService service = new StudentServicempl(deo,mapper);
        StudentControler controler = new StudentControler(view,service);

        controler.run();
    }
}
