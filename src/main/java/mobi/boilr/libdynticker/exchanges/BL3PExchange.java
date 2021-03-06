package mobi.boilr.libdynticker.exchanges;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.JsonNode;

import mobi.boilr.libdynticker.core.Exchange;
import mobi.boilr.libdynticker.core.Pair;

public final class BL3PExchange extends Exchange {
	private static final List<Pair> pairs;
	static {
		List<Pair> tempPairs = new ArrayList<Pair>();
		tempPairs.add(new Pair("BTC", "EUR"));
		pairs = Collections.unmodifiableList(tempPairs);
	}

	public BL3PExchange(long expiredPeriod) {
		super("BL3P", expiredPeriod);
	}

	@Override
	protected List<Pair> getPairsFromAPI() throws IOException {
		return pairs;
	}

	@Override
	protected String getTicker(Pair pair) throws IOException {
		if(!pairs.contains(pair))
			throw new IOException("Invalid pair: " + pair);
		// https://api.bl3p.eu/1/BTCEUR/ticker
		return parseTicker(readJsonFromUrl("https://api.bl3p.eu/1/" + pair.getCoin() + pair.getExchange() + "/ticker"),
				pair);
	}

	@Override
	public String parseTicker(JsonNode node, Pair pair) throws IOException {
		return node.get("last").asText();
	}

}
