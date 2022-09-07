package menuler;

import java.util.Scanner;
import javax.swing.*;

public class Login {

    // TODO giris sayfasi, bankamiza hos geldiniz vs, giris, sifre
    // bloke oncesi 3 hak(kalan hakkiniz.., bloke olursa banka ile iletisime geciniz..),
    // giris basarili olursa menuler.AnaMenu'ye gondersin

    // bloke olduysa tekrar girise izin vermesin
    // boolean blokeOlduMu degeri olsun. bloke olursa true vs diyelim

    Scanner scan = new Scanner(System.in);
    static JFrame f;

    public static void Login() {
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Merhaba, bankamıza hoş geldiniz \n Lütfen kartınızı yerleştiriniz");
        System.out.println("sifrenizi giriniz");
    }

    public static void main(String[] args) {
        Login();
    }

}
