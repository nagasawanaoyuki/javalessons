public class Bank{
	 String acountNumber;
	 int balance;
	 @Override
		public String toString(){
			return "$$"+this.balance+"(口座番号:"+this.acountNumber+")";
		}
		@Override
		public boolean equals(Object o){
			if(this==o){
				return true;
			}
			if(o instanceof Bank){
				Bank b=(Bank) o;
				String ba1=this.acountNumber.trim();
				String ba2=this.acountNumber.trim();
				if(ba1.equals(ba2)){
					return true;
				}
			}
			return false;
		}	
} 

