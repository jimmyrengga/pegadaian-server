
package com.pegadaian.controller;

import com.pegadaian.domain.Cabang;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ari
 */

@RestController
@RequestMapping("/api/cabang")
public class CabangController {
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cabang> findCabang(){
        List<Cabang> listCabang = new ArrayList<>();
        
        Cabang a = new Cabang();
        a.setKodeBaru(new Integer("1233"));
        a.setKodeLama(new Integer("1234"));
        a.setNamaPegadain(new String("CP Kuningan"));
        a.setKelurahan(new String("Cilimus"));
        a.setKecamatan(new String("Cilimus"));
        a.setKota(new String("Kuningan"));
        a.setProvinsi(new String("Jawa Barat"));
        a.setTelepon(new String("0234675432"));
        a.setStatus(new String("Aktif")); 
        listCabang.add(a);
        
        Cabang b = new Cabang();
        b.setKodeBaru(new Integer("1244"));
        b.setKodeLama(new Integer("1235"));
        b.setNamaPegadain(new String("CP Subang"));
        b.setKelurahan(new String("Babelan"));
        b.setKecamatan(new String("Babelan"));
        b.setKota(new String("Subang"));
        b.setProvinsi(new String("Jawa Barat"));
        b.setTelepon(new String("0235675333"));
        b.setStatus(new String("Aktif"));
        listCabang.add(b);
        
        Cabang c = new Cabang();
        c.setKodeBaru(new Integer("1222"));
        c.setKodeLama(new Integer("1237"));
        c.setNamaPegadain(new String("CP Tasik"));
        c.setKelurahan(new String("Ciparay"));
        c.setKecamatan(new String("Singaparna"));
        c.setKota(new String("Tasik"));
        c.setProvinsi(new String("Jawa Barat"));
        c.setTelepon(new String("0236752345"));
        c.setStatus(new String("Aktif"));
        listCabang.add(c);
        
        return listCabang;
    }
}
