/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pegadaian.controller;

import com.pegadaian.domain.HargaEmas;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**"
 *
 * @author teddy
 */
@RestController
@RequestMapping("/api/emas")
public class HargaEmasController {
    
    @RequestMapping(method = RequestMethod.GET)
//    public HargaEmas hargaEmas(){
    public List<HargaEmas> hargaEmas(){
        List<HargaEmas> listHarga = new ArrayList<>();
        
        HargaEmas limaGram = new HargaEmas();
        limaGram.setTanggal(new Date());
        limaGram.setHarga(new BigDecimal("2690.00"));
        limaGram.setBerat(5);
        limaGram.setHargaBeli(new BigDecimal("5180.00"));
        limaGram.setHargaJual(new BigDecimal("5360.00"));
        listHarga.add(limaGram);
        
        HargaEmas sepuluhGram = new HargaEmas();
        sepuluhGram.setTanggal(new Date());
        sepuluhGram.setHarga(new BigDecimal("5330.00"));
        sepuluhGram.setBerat(10);
        listHarga.add(sepuluhGram);
        
        HargaEmas duaPuluhLimaGram = new HargaEmas();
        duaPuluhLimaGram.setTanggal(new Date());
        duaPuluhLimaGram.setHarga(new BigDecimal("2690.00"));
        duaPuluhLimaGram.setBerat(25);
        listHarga.add(duaPuluhLimaGram);
        
        HargaEmas limaPuluhGram = new HargaEmas();
        limaPuluhGram.setTanggal(new Date());
        limaPuluhGram.setHarga(new BigDecimal("26450.00"));
        limaPuluhGram.setBerat(50);
        listHarga.add(limaPuluhGram);
        
        HargaEmas seratusGram = new HargaEmas();
        seratusGram.setTanggal(new Date());
        seratusGram.setHarga(new BigDecimal("52850.00"));
        seratusGram.setBerat(100);
        listHarga.add(seratusGram);
        
        HargaEmas duaRatusLimaPuluhGram = new HargaEmas();
        duaRatusLimaPuluhGram.setTanggal(new Date());
        duaRatusLimaPuluhGram.setHarga(new BigDecimal("132000.00"));
        duaRatusLimaPuluhGram.setBerat(250);
        listHarga.add(duaRatusLimaPuluhGram);
        
        HargaEmas satuKiloGram = new HargaEmas();
        satuKiloGram.setTanggal(new Date());
        satuKiloGram.setHarga(new BigDecimal("527000.00"));
        satuKiloGram.setBerat(1); 
       listHarga.add(satuKiloGram);
        
        return listHarga;
//        return limaGram;
    }
}
