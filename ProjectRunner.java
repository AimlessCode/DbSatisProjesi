import com.emin.controller.MusteriController;
import com.emin.services.MusteriService;

public class ProjectRunner {
    public static void main(String[] args) {


        MusteriController musteriController =new MusteriController();
       // musteriController.MusteriKaydet();
        MusteriService ms =new MusteriService();
        ms.findAll();



    }
}
