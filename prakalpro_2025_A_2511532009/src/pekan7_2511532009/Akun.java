	package pekan7_2511532009;
	
	public class Akun {
	
		private String nama;
		private String pw;
		private String email;
		private int PinAngka;
		
		public void setNama(String nama) {
			this.nama= nama;
		} 
		public void setPw(String pw) {
			this.pw=pw;
		}
		public void setEmail(String email) {
			this.email=email;
		}
		public void setPin(int PinAngka) {
			this.PinAngka=PinAngka;
		}
		public String getNama () {
			return nama;
		}
		public String getPw() {
			return pw;
		}
		public String getEmail() {
			return email;
		}
		public int getPin() {
			return PinAngka;
		}
		public boolean ispwRil() {
			return pw.length() >= 8;
		}
		public boolean isemailRil() {
			return email.contains("@") && email.contains(".");
		}
		public boolean ispinRil() {
			return PinAngka >= 100000 && PinAngka <= 999999;
		}
			
	
	}
