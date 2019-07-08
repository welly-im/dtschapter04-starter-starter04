package polinema.ac.id.dtsdesigntolayout;

import android.os.Parcel;
import android.os.Parcelable;

public class Register implements Parcelable {
    private String nama;
    private String tanggalLahir;
    private String jenisKelamin;
    private String username;
    private String password;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.tanggalLahir);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    public Register() {
    }

    protected Register(Parcel in) {
        this.nama = in.readString();
        this.tanggalLahir = in.readString();
        this.jenisKelamin = in.readString();
        this.username = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<Register> CREATOR = new Parcelable.Creator<Register>() {
        @Override
        public Register createFromParcel(Parcel source) {
            return new Register(source);
        }

        @Override
        public Register[] newArray(int size) {
            return new Register[size];
        }
    };

    public Register(String nama, String tanggalLahir, String jenisKelamin, String username, String password) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.username = username;
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static Creator<Register> getCREATOR() {
        return CREATOR;
    }
}
