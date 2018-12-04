package data.Temp;

import org.jvnet.hk2.annotations.Service;

import java.io.IOException;
import java.net.URL;

@Service
public class TempConvert implements medida{

    private String medida;
    private int val;

    @Override
    public Float calcResp(String medida, String valor) {
        this.medida = medida;
        val = Integer.parseInt(valor);
        float resp;
        StringBuffer response = new StringBuffer();
        if (medida == "celsisus"){
            resp = ((val*(9/5))+32);
            System.out.println(response);
        }
        else{
            resp = (5/9*(val-32));
            System.out.println(response);
        }
        return resp;
    }
    


    
}
