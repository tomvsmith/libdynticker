# libdynticker

Java library to retrieve trading pairs and last value from cryptocurrency, assets and bullion exchanges.

The main goal of libdynticker is to get the traded pairs dynamically. That way it can cope with the highly mutable altcoin exchanges where new pairs are added and removed each week. The result of this is that once a new exchange is added all trading pairs come along immediately.

## Supported exchanges

### Bitcoin and altcoins to FIAT
* [ANX](https://anxpro.com)
* [BitBay](https://bitbay.pl)
* [Bitcoin.de](https://www.bitcoin.de)
* [Bitcurex](http://bitcurex.com)
* [Bitfinex](https://www.bitfinex.com)
* [BitMarket.pl](https://www.bitmarket.pl)
* [Bitso](https://bitso.com)
* [Bitstamp](https://www.bitstamp.net)
* [BTC100](https://www.btc100.com/)
* [BtcTrade](https://www.btctrade.com)
* [BTC China](https://btcchina.com)
* [BTC Markets](https://btcmarkets.net)
* [BTC-E](https://btc-e.com)
* [CampBX](http://campbx.com)
* [CaVirtEx](https://www.cavirtex.com)
* [CEX.IO](http://cex.io)
* [CHBTC](https://www.chbtc.com)
* [Coinbase](https://exchange.coinbase.com)
* [CoinMate](http://coinmate.io)
* [Huobi](https://www.huobi.com)
* [itBit](https://www.itbit.com)
* [Kraken](https://www.kraken.com)
* [LakeBTC](http://lakebtc.com)
* [LocalBitcoins](https://localbitcoins.com)
* [OKCoin](https://www.okcoin.cn)
* [OKCoin International](https://www.okcoin.com)
* [OneWorldCoin](https://www.oneworldcoin.com)
* [Paymium](https://paymium.com)
* [Quadriga](https://www.quadrigacx.com/)
* [Thailand Bitcoin Exchange](https://bx.in.th)
* [VirWox](https://www.virwox.com/)
* [Yunbi](https://yunbi.com)

### Altcoins
* [AllCoin](https://www.allcoin.com)
* [Banx Capital](https://www.banx.io)
* [Bitspark](https://bitspark.io)
* [Bittrex](https://bittrex.com)
* [BleuTrade](https://bleutrade.com)
* [BTC38](http://www.btc38.com)
* [Bter](https://bter.com)
* [C-CEX](https://c-cex.com)
* [CCEDK](https://www.ccedk.com)
* [Coins-E](http://coins-e.com)
* [Cryptonit](https://cryptonit.net)
* [Cryptsy](https://cryptsy.com)
* [Coin-Swap](https://coin-swap.net)
* [HitBTC](https://hitbtc.com)
* [Melotic](https://www.melotic.com)
* [Mulcoin](https://www.mulcoin.com)
* [Poloniex](https://www.poloniex.com)
* [Vircurex](https://vircurex.com)
* [Yuanbaohui](http://yuanbaohui.com)

### Bullion
* [BullionVault](https://www.bullionvault.com)

### Assets, stocks, futures and securities
* [796 Exchange](https://796.com)
* [NXT Asset Exchange](http://wiki.nxtcrypto.org/wiki/Asset_Exchange)

### Removed
Most are now offline.

* [~~1Bse~~](https://www.1bse.com)
* [~~Atomic Trade~~](https://www.atomic-trade.com)
* [~~CoinMkt~~](https://coinmkt.com)
* [~~Crypto-Trade~~](http://crypto-trade.com)
* [~~Justcoin~~](https://justcoin.com)
* [~~Mintpal~~](http://mintpal.com)
* [~~Vault of Satoshi~~](https://www.vaultofsatoshi.com)

## Building
 `mvn package` to create a jar.

## Versioning
libdynticker follows [Semantic Versioning](http://semver.org) with the API being the public methods and attributes provided by the [Exchange](/src/main/java/mobi/boilr/libdynticker/core/Exchange.java) and [Pair](/src/main/java/mobi/boilr/libdynticker/core/Pair.java) classes.

## License and authorship
libdynticker code licensed under [GNU LGPL v3](/LICENSE) or later. Copyright belongs to [André Filipe Santos](https://github.com/andrefbsantos), [David Ludovino](https://github.com/dllud) and other [contributors listed on GitHub](https://github.com/andrefbsantos/libdynticker/graphs/contributors).
