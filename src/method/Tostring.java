package method;

public class Tostring{

	private int no;
	private String nama;

	public Tostring(int no,String nama){
		this.no=no;
		this.nama=nama;
	}
	public String getNama(){
		return this.nama;
	}
	public int getNo(){
		return this.no;
	}

	public String toString(){
		return "No Pasien: "+getNo()+"\nNama Pasien: "+getNama();
		
	}
}
