package data.Service;


import data.Temp.TempConvert;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class dataServiceImpl implements dataService{

    public float conv;
    
    @Override
    public Float temp(String medida, String valor) {
        double resultado = 0;
        TempConvert tem = new TempConvert();
        conv = tem.calcResp(medida, valor);
        return conv;
    }

    

    
}
