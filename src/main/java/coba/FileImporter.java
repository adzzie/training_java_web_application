package coba;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Description FileImporter
 *
 * @author aji gojali
 */
public class FileImporter {
    private File fileInput;
    private BufferedReader fileReader;

    public FileImporter(String namaFile){
        this.fileInput = new File(namaFile);
    }

    private void bukaFile() throws FileNotFoundException {
        if (!fileInput.exists()){
            throw new FileNotFoundException("File tidak ditemukan");
        }

        fileReader = new BufferedReader(new FileReader(fileInput));
    }

    private void tutupFile() throws IOException {
        if (fileReader != null) fileReader.close();
    }

    public List<Nasabah> proses() throws IOException {
        bukaFile();
        //baca header
        String data = fileReader.readLine();
        System.out.println("Header : "+data);

        List<Nasabah> hasil = new ArrayList<Nasabah>();

        //baca data
        data = fileReader.readLine();
        while (data != null){
            System.out.println("Data : "+data);

            String[] isiVariable = data.split(",");
            if (isiVariable.length != 2){
                throw new IllegalStateException("Format data salah");
            }
            Nasabah n = new Nasabah();
            n.setNama(isiVariable[0]);
            n.setEmail(isiVariable[1]);
            hasil.add(n);
            data = fileReader.readLine();
        }
        tutupFile();
        return hasil;
    }
}
