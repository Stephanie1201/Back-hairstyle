package back.hair.Controller;

import back.hair.Model.Test;
import back.hair.Service.testService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/")
public class testController {

    @Autowired
    private testService testServices;

    @GetMapping("/allpersonne")
    @ResponseBody
    public List<Test> findAll(){
        List<Test> personne = testServices.findAll();

        for (Test personnes : personne) {
            System.out.println("Person ID: " + personnes.getPersonId() + ", Name: " + personnes.getNom() + ", Prenom "  + personnes.getPrenom() +
                    ", Adresse " + personnes.getAdresse() + ", Ville " + personnes.getVille());
        }

        return personne;
    }

}
