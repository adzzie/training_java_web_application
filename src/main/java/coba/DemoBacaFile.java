package coba;

import java.io.IOException;
import java.util.List;

/**
 * Description DemoBacaFile
 *
 * @author aji gojali
 */
public class DemoBacaFile {
    public static void main(String[] args) throws IOException {
        FileImporter fileimport = new FileImporter("src/main/resources/file_import.txt");
        List<Nasabah> hasilImport = fileimport.proses();
        System.out.println(hasilImport.size() + " data berhasil diimport");

        for(Nasabah x : hasilImport){
            System.out.println("Nama : "+x.getNama());
            System.out.println("Email : "+x.getEmail());
        }
    }
}
