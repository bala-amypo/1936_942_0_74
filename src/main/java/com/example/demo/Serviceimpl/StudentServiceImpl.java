package com.example.demo.Serviceimpl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
   private final Sturepo sturepo;
   public StudentServiceImpl(Sturepo sturepo){
    this.sturepo=sturepo;
    
   }


     public Student saveStudent(Student student){
        return 
     }

}