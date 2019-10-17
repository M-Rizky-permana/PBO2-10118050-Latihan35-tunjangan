/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas35;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program :
 */
public class PerhitunganGaji {
    public float gaji;
    public String status;
    public float tunjangan;
    public float totalgaji;
    

    public float getGaji() {
        return gaji;
    }

    public void setGaji(float gaji) {
        this.gaji = gaji;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public float perhitungTunjangan(){
        if(status.equals("Menikah")){
            tunjangan = (float) (gaji * 0.34);
        }else {
            tunjangan = 0;
        }
        
        return tunjangan;
        
    }
    
    public float perhitungGajiTotal(){
        if(status.equals("Menikah")){
            totalgaji = tunjangan + gaji;
        }else{
            totalgaji = gaji;
        }
        
        return totalgaji;
    }
}
