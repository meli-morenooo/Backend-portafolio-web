/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.cmgm.Service;

import com.portfolio.cmgm.Entity.Acercade;
import com.portfolio.cmgm.Repository.RAcercade;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAcercade {
    @Autowired
    RAcercade rAcercade;
    
    public List<Acercade> list(){
        return rAcercade.findAll();
    }
    
    public Optional<Acercade> getOne(int id){
        return rAcercade.findById(id);
    }
    
    public Optional<Acercade> getByDescripcionA(String descripcionA){
        return rAcercade.findByDescripcionA(descripcionA);
    }
    
    public void save(Acercade acerd){
        rAcercade.save(acerd);
    }
    
    public void delete(int id){
        rAcercade.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rAcercade.existsById(id);
    }
    
    public boolean existsByDescripcionA(String descripcionA){
        return rAcercade.existsByDescripcionA(descripcionA);
    }
}
