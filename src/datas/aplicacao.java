package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class aplicacao {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Modo de formatação de data para digitação;
        Date y1 = sdf1.parse("25/05/2022");
        Date y2 = sdf1.parse("25/05/2022 15:42:07");

        System.out.println(sdf1.format(y1));
        System.out.println(sdf2.format(y2));

        //Saber a data atual no programa
        Date x1 = new Date();
        System.out.println(sdf2.format(x1)); //Formatar a data com hora.

    }
}
