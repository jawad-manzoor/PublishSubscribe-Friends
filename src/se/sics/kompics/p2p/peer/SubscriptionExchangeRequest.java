package se.sics.kompics.p2p.peer;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Set;

import p2p.system.peer.PeerAddress;

import se.sics.kompics.address.Address;
import se.sics.kompics.network.Message;

/**
 * 
 * @author Sari Setianingsih
 * @author Jawad Manzoor
 * Created on Nov 24, 2011
 *
 */
public class SubscriptionExchangeRequest extends PeerMessage{
	
	private static final long serialVersionUID = -9199390927629685995L;
	private final PeerAddress initiator;
	private final BigInteger id;
	
	public SubscriptionExchangeRequest(PeerAddress source, PeerAddress destination, PeerAddress initiator, BigInteger id){		
		super(source, destination);
		this.initiator = initiator;
		this.id = id;
		
	}

	//-------------------------------------------------------------------	
		public PeerAddress getInitiator() {
			return this.initiator;
		}

	//-------------------------------------------------------------------	
		public BigInteger getID() {
			return this.id;
		}

	}


	

