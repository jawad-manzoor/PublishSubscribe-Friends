import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import p2p.system.peer.PeerAddress;


public class Test {
	
	public static void main(String[] ar) {
		String user = "sari";
		System.out.println("user sari: " + user.hashCode());
		user = "jawad";
		System.out.println("user jawad: " + user.hashCode());
		
		BigInteger bi = BigInteger.valueOf(10);
		BigInteger hashedbi = BigInteger.valueOf(bi.hashCode());
		
		System.out.println("bi: " + bi + " hashedbi: " + hashedbi + " bi.hashCode(): " + bi.hashCode());
		
		
		HashMap<BigInteger, Set<BigInteger>> hm = new HashMap<BigInteger, Set<BigInteger>>();
		hm.put(BigInteger.ONE, new HashSet<BigInteger>());
		hm.put(BigInteger.ZERO, new HashSet<BigInteger>());
		
		System.out.println("nothing: " + hm.get(BigInteger.ONE));
		
		Set<BigInteger> set = hm.get(BigInteger.ONE);
		
		set.add(BigInteger.TEN);
		
		set = hm.get(BigInteger.ZERO);
		set.add(BigInteger.ZERO);
		System.out.println("TEN in ONE: " + hm.get(BigInteger.ONE));
		System.out.println("ZERO in ZERO: " + hm.get(BigInteger.ZERO));
		
		
		////
		
		hm.clear();
		System.out.println("1. ONE: " + hm.get(BigInteger.ONE));
		
		set = hm.get(BigInteger.ONE);
		
		System.out.println("2. ONE: " + hm.get(BigInteger.ONE));
		
		if (set == null) {
			set = new HashSet<BigInteger>();
			System.out.println("3. ONE: " + hm.get(BigInteger.ONE));
			
			hm.put(BigInteger.ONE, set);
			
			System.out.println("6. ONE: " + hm.get(BigInteger.ONE));
		}
		
		System.out.println("4. ONE: " + hm.get(BigInteger.ONE));
		
		set.add(BigInteger.TEN);
		System.out.println("5. ONE: " + hm.get(BigInteger.ONE));
		
		hm.put(BigInteger.ONE, set);
		
		System.out.println("6. ONE: " + hm.get(BigInteger.ONE));
		
	//	System.out.println("TEN: " + hm.get(BigInteger.ONE));
	}
	

}
