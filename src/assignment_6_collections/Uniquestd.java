package assignment_6_collections;

import java.util.HashSet;
import java.util.Objects;


public class Uniquestd {
	long accountNo;
	String holderName;
	double balance;
	
	
	public Uniquestd(long accountNo, String holderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	public Uniquestd() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountNo, balance, holderName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Uniquestd other = (Uniquestd) obj;
		return accountNo == other.accountNo
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(holderName, other.holderName);
	}
	public void hash() {
		HashSet<Uniquestd> hash=new HashSet<Uniquestd>();
		hash.add(new Uniquestd(12352,"shree",25000));
		hash.add(new Uniquestd(52588,"krish",50000));
		hash.add(new Uniquestd(123522,"anu",15000));
		hash.add(new Uniquestd(123522,"gayu",40000));
		hash.add(new Uniquestd(123522,"gayu",40000));
		
		for(Uniquestd h:hash) {
			System.out.println(h.accountNo+" "+h.holderName);
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		Uniquestd hashset=new Uniquestd();
		hashset.hash();
	}
	




}



