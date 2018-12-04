/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTest;

import data.Temp.TempConvert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TempConvertTests {
        @Test
        public void prueba1() {
                TempConvert tc = new TempConvert();
                assertTrue(tc.calcResp("celsius","10").toString() == "50");
        }

        @Test
        public void prueba2() {
                TempConvert tc = new TempConvert();
                assertTrue(tc.calcResp("celsius","22").toString() == "71.6");
        }

}

