package coba;

import java.util.Date;

/**
 * Description Hello
 *
 * @author aji gojali
 */
public class Hello {
    private Date sekarang = new Date();

    public void hello(String nama){
        System.out.println("Hello " + nama);
    }

    public void tampilkanWaktu(){
        System.out.println("Waktu sekarang : "+sekarang);
    }

    public static void main(String[] x){
        System.out.println("main method");
        Nasabah n = new Nasabah("aji");
        System.out.println("hallo "+ n.getNama());
    }
}
