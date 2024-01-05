package back.hair.Service;


import back.hair.Model.Test;
import back.hair.Repository.testRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testService {

    @Autowired
    private testRepo testRepository;

    public List<Test> findAll(){
         return testRepository.findAll();
    }


}
