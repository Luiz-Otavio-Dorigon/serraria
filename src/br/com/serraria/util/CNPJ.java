package br.com.serraria.util;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class CNPJ {

    static public boolean validaCNPJ(String str_cnpj) {
        int soma = 0, dig;
        if (str_cnpj.length() <= 11)
            return false;
        
        String cnpj_calc = str_cnpj.substring(0, 12);

        if (str_cnpj.length() != 14)
            return false;

        char[] chr_cnpj = str_cnpj.toCharArray();

        for (int i = 0; i < 4; i++)
            if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
                soma += (chr_cnpj[i] - 48) * (6 - (i + 1));

        for (int i = 0; i < 8; i++)
            if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9)
                soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
        
        dig = 11 - (soma % 11);

        cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);

        soma = 0;
        for (int i = 0; i < 5; i++)
            if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
                soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
        
        for (int i = 0; i < 8; i++) 
            if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9)
                soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));

        dig = 11 - (soma % 11);
        cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);

        return str_cnpj.equals(cnpj_calc);
    }
}
