
package com.example.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ask",
    "AverageDailyVolume",
    "Bid",
    "AskRealtime",
    "BidRealtime",
    "BookValue",
    "Change_PercentChange",
    "Change",
    "Commission",
    "Currency",
    "ChangeRealtime",
    "AfterHoursChangeRealtime",
    "DividendShare",
    "LastTradeDate",
    "TradeDate",
    "EarningsShare",
    "ErrorIndicationreturnedforsymbolchangedinvalid",
    "EPSEstimateCurrentYear",
    "EPSEstimateNextYear",
    "EPSEstimateNextQuarter",
    "DaysLow",
    "DaysHigh",
    "YearLow",
    "YearHigh",
    "HoldingsGainPercent",
    "AnnualizedGain",
    "HoldingsGain",
    "HoldingsGainPercentRealtime",
    "HoldingsGainRealtime",
    "MoreInfo",
    "OrderBookRealtime",
    "MarketCapitalization",
    "MarketCapRealtime",
    "EBITDA",
    "ChangeFromYearLow",
    "PercentChangeFromYearLow",
    "LastTradeRealtimeWithTime",
    "ChangePercentRealtime",
    "ChangeFromYearHigh",
    "PercebtChangeFromYearHigh",
    "LastTradeWithTime",
    "LastTradePriceOnly",
    "HighLimit",
    "LowLimit",
    "DaysRange",
    "DaysRangeRealtime",
    "FiftydayMovingAverage",
    "TwoHundreddayMovingAverage",
    "ChangeFromTwoHundreddayMovingAverage",
    "PercentChangeFromTwoHundreddayMovingAverage",
    "ChangeFromFiftydayMovingAverage",
    "PercentChangeFromFiftydayMovingAverage",
    "Name",
    "Notes",
    "Open",
    "PreviousClose",
    "PricePaid",
    "ChangeinPercent",
    "PriceSales",
    "PriceBook",
    "ExDividendDate",
    "PERatio",
    "DividendPayDate",
    "PERatioRealtime",
    "PEGRatio",
    "PriceEPSEstimateCurrentYear",
    "PriceEPSEstimateNextYear",
    "Symbol",
    "SharesOwned",
    "ShortRatio",
    "LastTradeTime",
    "TickerTrend",
    "OneyrTargetPrice",
    "Volume",
    "HoldingsValue",
    "HoldingsValueRealtime",
    "YearRange",
    "DaysValueChange",
    "DaysValueChangeRealtime",
    "StockExchange",
    "DividendYield",
    "PercentChange"
})
public class Quote {

    @JsonProperty("Ask")
    private String ask;
    @JsonProperty("AverageDailyVolume")
    private String averageDailyVolume;
    @JsonProperty("Bid")
    private String bid;
    @JsonProperty("AskRealtime")
    private Object askRealtime;
    @JsonProperty("BidRealtime")
    private Object bidRealtime;
    @JsonProperty("BookValue")
    private String bookValue;
    @JsonProperty("Change_PercentChange")
    private String changePercentChange;
    @JsonProperty("Change")
    private String change;
    @JsonProperty("Commission")
    private Object commission;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("ChangeRealtime")
    private Object changeRealtime;
    @JsonProperty("AfterHoursChangeRealtime")
    private Object afterHoursChangeRealtime;
    @JsonProperty("DividendShare")
    private String dividendShare;
    @JsonProperty("LastTradeDate")
    private String lastTradeDate;
    @JsonProperty("TradeDate")
    private Object tradeDate;
    @JsonProperty("EarningsShare")
    private String earningsShare;
    @JsonProperty("ErrorIndicationreturnedforsymbolchangedinvalid")
    private Object errorIndicationreturnedforsymbolchangedinvalid;
    @JsonProperty("EPSEstimateCurrentYear")
    private String ePSEstimateCurrentYear;
    @JsonProperty("EPSEstimateNextYear")
    private String ePSEstimateNextYear;
    @JsonProperty("EPSEstimateNextQuarter")
    private String ePSEstimateNextQuarter;
    @JsonProperty("DaysLow")
    private String daysLow;
    @JsonProperty("DaysHigh")
    private String daysHigh;
    @JsonProperty("YearLow")
    private String yearLow;
    @JsonProperty("YearHigh")
    private String yearHigh;
    @JsonProperty("HoldingsGainPercent")
    private Object holdingsGainPercent;
    @JsonProperty("AnnualizedGain")
    private Object annualizedGain;
    @JsonProperty("HoldingsGain")
    private Object holdingsGain;
    @JsonProperty("HoldingsGainPercentRealtime")
    private Object holdingsGainPercentRealtime;
    @JsonProperty("HoldingsGainRealtime")
    private Object holdingsGainRealtime;
    @JsonProperty("MoreInfo")
    private Object moreInfo;
    @JsonProperty("OrderBookRealtime")
    private Object orderBookRealtime;
    @JsonProperty("MarketCapitalization")
    private String marketCapitalization;
    @JsonProperty("MarketCapRealtime")
    private Object marketCapRealtime;
    @JsonProperty("EBITDA")
    private String eBITDA;
    @JsonProperty("ChangeFromYearLow")
    private String changeFromYearLow;
    @JsonProperty("PercentChangeFromYearLow")
    private String percentChangeFromYearLow;
    @JsonProperty("LastTradeRealtimeWithTime")
    private Object lastTradeRealtimeWithTime;
    @JsonProperty("ChangePercentRealtime")
    private Object changePercentRealtime;
    @JsonProperty("ChangeFromYearHigh")
    private String changeFromYearHigh;
    @JsonProperty("PercebtChangeFromYearHigh")
    private String percebtChangeFromYearHigh;
    @JsonProperty("LastTradeWithTime")
    private String lastTradeWithTime;
    @JsonProperty("LastTradePriceOnly")
    private String lastTradePriceOnly;
    @JsonProperty("HighLimit")
    private Object highLimit;
    @JsonProperty("LowLimit")
    private Object lowLimit;
    @JsonProperty("DaysRange")
    private String daysRange;
    @JsonProperty("DaysRangeRealtime")
    private Object daysRangeRealtime;
    @JsonProperty("FiftydayMovingAverage")
    private String fiftydayMovingAverage;
    @JsonProperty("TwoHundreddayMovingAverage")
    private String twoHundreddayMovingAverage;
    @JsonProperty("ChangeFromTwoHundreddayMovingAverage")
    private String changeFromTwoHundreddayMovingAverage;
    @JsonProperty("PercentChangeFromTwoHundreddayMovingAverage")
    private String percentChangeFromTwoHundreddayMovingAverage;
    @JsonProperty("ChangeFromFiftydayMovingAverage")
    private String changeFromFiftydayMovingAverage;
    @JsonProperty("PercentChangeFromFiftydayMovingAverage")
    private String percentChangeFromFiftydayMovingAverage;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Notes")
    private Object notes;
    @JsonProperty("Open")
    private String open;
    @JsonProperty("PreviousClose")
    private String previousClose;
    @JsonProperty("PricePaid")
    private Object pricePaid;
    @JsonProperty("ChangeinPercent")
    private String changeinPercent;
    @JsonProperty("PriceSales")
    private String priceSales;
    @JsonProperty("PriceBook")
    private String priceBook;
    @JsonProperty("ExDividendDate")
    private String exDividendDate;
    @JsonProperty("PERatio")
    private String pERatio;
    @JsonProperty("DividendPayDate")
    private String dividendPayDate;
    @JsonProperty("PERatioRealtime")
    private Object pERatioRealtime;
    @JsonProperty("PEGRatio")
    private String pEGRatio;
    @JsonProperty("PriceEPSEstimateCurrentYear")
    private String priceEPSEstimateCurrentYear;
    @JsonProperty("PriceEPSEstimateNextYear")
    private String priceEPSEstimateNextYear;
    @JsonProperty("Symbol")
    private String symbol;
    @JsonProperty("SharesOwned")
    private Object sharesOwned;
    @JsonProperty("ShortRatio")
    private String shortRatio;
    @JsonProperty("LastTradeTime")
    private String lastTradeTime;
    @JsonProperty("TickerTrend")
    private Object tickerTrend;
    @JsonProperty("OneyrTargetPrice")
    private String oneyrTargetPrice;
    @JsonProperty("Volume")
    private String volume;
    @JsonProperty("HoldingsValue")
    private Object holdingsValue;
    @JsonProperty("HoldingsValueRealtime")
    private Object holdingsValueRealtime;
    @JsonProperty("YearRange")
    private String yearRange;
    @JsonProperty("DaysValueChange")
    private Object daysValueChange;
    @JsonProperty("DaysValueChangeRealtime")
    private Object daysValueChangeRealtime;
    @JsonProperty("StockExchange")
    private String stockExchange;
    @JsonProperty("DividendYield")
    private String dividendYield;
    @JsonProperty("PercentChange")
    private String percentChange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Ask")
    public String getAsk() {
        return ask;
    }

    @JsonProperty("Ask")
    public void setAsk(String ask) {
        this.ask = ask;
    }

    @JsonProperty("AverageDailyVolume")
    public String getAverageDailyVolume() {
        return averageDailyVolume;
    }

    @JsonProperty("AverageDailyVolume")
    public void setAverageDailyVolume(String averageDailyVolume) {
        this.averageDailyVolume = averageDailyVolume;
    }

    @JsonProperty("Bid")
    public String getBid() {
        return bid;
    }

    @JsonProperty("Bid")
    public void setBid(String bid) {
        this.bid = bid;
    }

    @JsonProperty("AskRealtime")
    public Object getAskRealtime() {
        return askRealtime;
    }

    @JsonProperty("AskRealtime")
    public void setAskRealtime(Object askRealtime) {
        this.askRealtime = askRealtime;
    }

    @JsonProperty("BidRealtime")
    public Object getBidRealtime() {
        return bidRealtime;
    }

    @JsonProperty("BidRealtime")
    public void setBidRealtime(Object bidRealtime) {
        this.bidRealtime = bidRealtime;
    }

    @JsonProperty("BookValue")
    public String getBookValue() {
        return bookValue;
    }

    @JsonProperty("BookValue")
    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    @JsonProperty("Change_PercentChange")
    public String getChangePercentChange() {
        return changePercentChange;
    }

    @JsonProperty("Change_PercentChange")
    public void setChangePercentChange(String changePercentChange) {
        this.changePercentChange = changePercentChange;
    }

    @JsonProperty("Change")
    public String getChange() {
        return change;
    }

    @JsonProperty("Change")
    public void setChange(String change) {
        this.change = change;
    }

    @JsonProperty("Commission")
    public Object getCommission() {
        return commission;
    }

    @JsonProperty("Commission")
    public void setCommission(Object commission) {
        this.commission = commission;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("ChangeRealtime")
    public Object getChangeRealtime() {
        return changeRealtime;
    }

    @JsonProperty("ChangeRealtime")
    public void setChangeRealtime(Object changeRealtime) {
        this.changeRealtime = changeRealtime;
    }

    @JsonProperty("AfterHoursChangeRealtime")
    public Object getAfterHoursChangeRealtime() {
        return afterHoursChangeRealtime;
    }

    @JsonProperty("AfterHoursChangeRealtime")
    public void setAfterHoursChangeRealtime(Object afterHoursChangeRealtime) {
        this.afterHoursChangeRealtime = afterHoursChangeRealtime;
    }

    @JsonProperty("DividendShare")
    public String getDividendShare() {
        return dividendShare;
    }

    @JsonProperty("DividendShare")
    public void setDividendShare(String dividendShare) {
        this.dividendShare = dividendShare;
    }

    @JsonProperty("LastTradeDate")
    public String getLastTradeDate() {
        return lastTradeDate;
    }

    @JsonProperty("LastTradeDate")
    public void setLastTradeDate(String lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }

    @JsonProperty("TradeDate")
    public Object getTradeDate() {
        return tradeDate;
    }

    @JsonProperty("TradeDate")
    public void setTradeDate(Object tradeDate) {
        this.tradeDate = tradeDate;
    }

    @JsonProperty("EarningsShare")
    public String getEarningsShare() {
        return earningsShare;
    }

    @JsonProperty("EarningsShare")
    public void setEarningsShare(String earningsShare) {
        this.earningsShare = earningsShare;
    }

    @JsonProperty("ErrorIndicationreturnedforsymbolchangedinvalid")
    public Object getErrorIndicationreturnedforsymbolchangedinvalid() {
        return errorIndicationreturnedforsymbolchangedinvalid;
    }

    @JsonProperty("ErrorIndicationreturnedforsymbolchangedinvalid")
    public void setErrorIndicationreturnedforsymbolchangedinvalid(Object errorIndicationreturnedforsymbolchangedinvalid) {
        this.errorIndicationreturnedforsymbolchangedinvalid = errorIndicationreturnedforsymbolchangedinvalid;
    }

    @JsonProperty("EPSEstimateCurrentYear")
    public String getEPSEstimateCurrentYear() {
        return ePSEstimateCurrentYear;
    }

    @JsonProperty("EPSEstimateCurrentYear")
    public void setEPSEstimateCurrentYear(String ePSEstimateCurrentYear) {
        this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
    }

    @JsonProperty("EPSEstimateNextYear")
    public String getEPSEstimateNextYear() {
        return ePSEstimateNextYear;
    }

    @JsonProperty("EPSEstimateNextYear")
    public void setEPSEstimateNextYear(String ePSEstimateNextYear) {
        this.ePSEstimateNextYear = ePSEstimateNextYear;
    }

    @JsonProperty("EPSEstimateNextQuarter")
    public String getEPSEstimateNextQuarter() {
        return ePSEstimateNextQuarter;
    }

    @JsonProperty("EPSEstimateNextQuarter")
    public void setEPSEstimateNextQuarter(String ePSEstimateNextQuarter) {
        this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
    }

    @JsonProperty("DaysLow")
    public String getDaysLow() {
        return daysLow;
    }

    @JsonProperty("DaysLow")
    public void setDaysLow(String daysLow) {
        this.daysLow = daysLow;
    }

    @JsonProperty("DaysHigh")
    public String getDaysHigh() {
        return daysHigh;
    }

    @JsonProperty("DaysHigh")
    public void setDaysHigh(String daysHigh) {
        this.daysHigh = daysHigh;
    }

    @JsonProperty("YearLow")
    public String getYearLow() {
        return yearLow;
    }

    @JsonProperty("YearLow")
    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }

    @JsonProperty("YearHigh")
    public String getYearHigh() {
        return yearHigh;
    }

    @JsonProperty("YearHigh")
    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    @JsonProperty("HoldingsGainPercent")
    public Object getHoldingsGainPercent() {
        return holdingsGainPercent;
    }

    @JsonProperty("HoldingsGainPercent")
    public void setHoldingsGainPercent(Object holdingsGainPercent) {
        this.holdingsGainPercent = holdingsGainPercent;
    }

    @JsonProperty("AnnualizedGain")
    public Object getAnnualizedGain() {
        return annualizedGain;
    }

    @JsonProperty("AnnualizedGain")
    public void setAnnualizedGain(Object annualizedGain) {
        this.annualizedGain = annualizedGain;
    }

    @JsonProperty("HoldingsGain")
    public Object getHoldingsGain() {
        return holdingsGain;
    }

    @JsonProperty("HoldingsGain")
    public void setHoldingsGain(Object holdingsGain) {
        this.holdingsGain = holdingsGain;
    }

    @JsonProperty("HoldingsGainPercentRealtime")
    public Object getHoldingsGainPercentRealtime() {
        return holdingsGainPercentRealtime;
    }

    @JsonProperty("HoldingsGainPercentRealtime")
    public void setHoldingsGainPercentRealtime(Object holdingsGainPercentRealtime) {
        this.holdingsGainPercentRealtime = holdingsGainPercentRealtime;
    }

    @JsonProperty("HoldingsGainRealtime")
    public Object getHoldingsGainRealtime() {
        return holdingsGainRealtime;
    }

    @JsonProperty("HoldingsGainRealtime")
    public void setHoldingsGainRealtime(Object holdingsGainRealtime) {
        this.holdingsGainRealtime = holdingsGainRealtime;
    }

    @JsonProperty("MoreInfo")
    public Object getMoreInfo() {
        return moreInfo;
    }

    @JsonProperty("MoreInfo")
    public void setMoreInfo(Object moreInfo) {
        this.moreInfo = moreInfo;
    }

    @JsonProperty("OrderBookRealtime")
    public Object getOrderBookRealtime() {
        return orderBookRealtime;
    }

    @JsonProperty("OrderBookRealtime")
    public void setOrderBookRealtime(Object orderBookRealtime) {
        this.orderBookRealtime = orderBookRealtime;
    }

    @JsonProperty("MarketCapitalization")
    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    @JsonProperty("MarketCapitalization")
    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    @JsonProperty("MarketCapRealtime")
    public Object getMarketCapRealtime() {
        return marketCapRealtime;
    }

    @JsonProperty("MarketCapRealtime")
    public void setMarketCapRealtime(Object marketCapRealtime) {
        this.marketCapRealtime = marketCapRealtime;
    }

    @JsonProperty("EBITDA")
    public String getEBITDA() {
        return eBITDA;
    }

    @JsonProperty("EBITDA")
    public void setEBITDA(String eBITDA) {
        this.eBITDA = eBITDA;
    }

    @JsonProperty("ChangeFromYearLow")
    public String getChangeFromYearLow() {
        return changeFromYearLow;
    }

    @JsonProperty("ChangeFromYearLow")
    public void setChangeFromYearLow(String changeFromYearLow) {
        this.changeFromYearLow = changeFromYearLow;
    }

    @JsonProperty("PercentChangeFromYearLow")
    public String getPercentChangeFromYearLow() {
        return percentChangeFromYearLow;
    }

    @JsonProperty("PercentChangeFromYearLow")
    public void setPercentChangeFromYearLow(String percentChangeFromYearLow) {
        this.percentChangeFromYearLow = percentChangeFromYearLow;
    }

    @JsonProperty("LastTradeRealtimeWithTime")
    public Object getLastTradeRealtimeWithTime() {
        return lastTradeRealtimeWithTime;
    }

    @JsonProperty("LastTradeRealtimeWithTime")
    public void setLastTradeRealtimeWithTime(Object lastTradeRealtimeWithTime) {
        this.lastTradeRealtimeWithTime = lastTradeRealtimeWithTime;
    }

    @JsonProperty("ChangePercentRealtime")
    public Object getChangePercentRealtime() {
        return changePercentRealtime;
    }

    @JsonProperty("ChangePercentRealtime")
    public void setChangePercentRealtime(Object changePercentRealtime) {
        this.changePercentRealtime = changePercentRealtime;
    }

    @JsonProperty("ChangeFromYearHigh")
    public String getChangeFromYearHigh() {
        return changeFromYearHigh;
    }

    @JsonProperty("ChangeFromYearHigh")
    public void setChangeFromYearHigh(String changeFromYearHigh) {
        this.changeFromYearHigh = changeFromYearHigh;
    }

    @JsonProperty("PercebtChangeFromYearHigh")
    public String getPercebtChangeFromYearHigh() {
        return percebtChangeFromYearHigh;
    }

    @JsonProperty("PercebtChangeFromYearHigh")
    public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh) {
        this.percebtChangeFromYearHigh = percebtChangeFromYearHigh;
    }

    @JsonProperty("LastTradeWithTime")
    public String getLastTradeWithTime() {
        return lastTradeWithTime;
    }

    @JsonProperty("LastTradeWithTime")
    public void setLastTradeWithTime(String lastTradeWithTime) {
        this.lastTradeWithTime = lastTradeWithTime;
    }

    @JsonProperty("LastTradePriceOnly")
    public String getLastTradePriceOnly() {
        return lastTradePriceOnly;
    }

    @JsonProperty("LastTradePriceOnly")
    public void setLastTradePriceOnly(String lastTradePriceOnly) {
        this.lastTradePriceOnly = lastTradePriceOnly;
    }

    @JsonProperty("HighLimit")
    public Object getHighLimit() {
        return highLimit;
    }

    @JsonProperty("HighLimit")
    public void setHighLimit(Object highLimit) {
        this.highLimit = highLimit;
    }

    @JsonProperty("LowLimit")
    public Object getLowLimit() {
        return lowLimit;
    }

    @JsonProperty("LowLimit")
    public void setLowLimit(Object lowLimit) {
        this.lowLimit = lowLimit;
    }

    @JsonProperty("DaysRange")
    public String getDaysRange() {
        return daysRange;
    }

    @JsonProperty("DaysRange")
    public void setDaysRange(String daysRange) {
        this.daysRange = daysRange;
    }

    @JsonProperty("DaysRangeRealtime")
    public Object getDaysRangeRealtime() {
        return daysRangeRealtime;
    }

    @JsonProperty("DaysRangeRealtime")
    public void setDaysRangeRealtime(Object daysRangeRealtime) {
        this.daysRangeRealtime = daysRangeRealtime;
    }

    @JsonProperty("FiftydayMovingAverage")
    public String getFiftydayMovingAverage() {
        return fiftydayMovingAverage;
    }

    @JsonProperty("FiftydayMovingAverage")
    public void setFiftydayMovingAverage(String fiftydayMovingAverage) {
        this.fiftydayMovingAverage = fiftydayMovingAverage;
    }

    @JsonProperty("TwoHundreddayMovingAverage")
    public String getTwoHundreddayMovingAverage() {
        return twoHundreddayMovingAverage;
    }

    @JsonProperty("TwoHundreddayMovingAverage")
    public void setTwoHundreddayMovingAverage(String twoHundreddayMovingAverage) {
        this.twoHundreddayMovingAverage = twoHundreddayMovingAverage;
    }

    @JsonProperty("ChangeFromTwoHundreddayMovingAverage")
    public String getChangeFromTwoHundreddayMovingAverage() {
        return changeFromTwoHundreddayMovingAverage;
    }

    @JsonProperty("ChangeFromTwoHundreddayMovingAverage")
    public void setChangeFromTwoHundreddayMovingAverage(String changeFromTwoHundreddayMovingAverage) {
        this.changeFromTwoHundreddayMovingAverage = changeFromTwoHundreddayMovingAverage;
    }

    @JsonProperty("PercentChangeFromTwoHundreddayMovingAverage")
    public String getPercentChangeFromTwoHundreddayMovingAverage() {
        return percentChangeFromTwoHundreddayMovingAverage;
    }

    @JsonProperty("PercentChangeFromTwoHundreddayMovingAverage")
    public void setPercentChangeFromTwoHundreddayMovingAverage(String percentChangeFromTwoHundreddayMovingAverage) {
        this.percentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
    }

    @JsonProperty("ChangeFromFiftydayMovingAverage")
    public String getChangeFromFiftydayMovingAverage() {
        return changeFromFiftydayMovingAverage;
    }

    @JsonProperty("ChangeFromFiftydayMovingAverage")
    public void setChangeFromFiftydayMovingAverage(String changeFromFiftydayMovingAverage) {
        this.changeFromFiftydayMovingAverage = changeFromFiftydayMovingAverage;
    }

    @JsonProperty("PercentChangeFromFiftydayMovingAverage")
    public String getPercentChangeFromFiftydayMovingAverage() {
        return percentChangeFromFiftydayMovingAverage;
    }

    @JsonProperty("PercentChangeFromFiftydayMovingAverage")
    public void setPercentChangeFromFiftydayMovingAverage(String percentChangeFromFiftydayMovingAverage) {
        this.percentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Notes")
    public Object getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(Object notes) {
        this.notes = notes;
    }

    @JsonProperty("Open")
    public String getOpen() {
        return open;
    }

    @JsonProperty("Open")
    public void setOpen(String open) {
        this.open = open;
    }

    @JsonProperty("PreviousClose")
    public String getPreviousClose() {
        return previousClose;
    }

    @JsonProperty("PreviousClose")
    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }

    @JsonProperty("PricePaid")
    public Object getPricePaid() {
        return pricePaid;
    }

    @JsonProperty("PricePaid")
    public void setPricePaid(Object pricePaid) {
        this.pricePaid = pricePaid;
    }

    @JsonProperty("ChangeinPercent")
    public String getChangeinPercent() {
        return changeinPercent;
    }

    @JsonProperty("ChangeinPercent")
    public void setChangeinPercent(String changeinPercent) {
        this.changeinPercent = changeinPercent;
    }

    @JsonProperty("PriceSales")
    public String getPriceSales() {
        return priceSales;
    }

    @JsonProperty("PriceSales")
    public void setPriceSales(String priceSales) {
        this.priceSales = priceSales;
    }

    @JsonProperty("PriceBook")
    public String getPriceBook() {
        return priceBook;
    }

    @JsonProperty("PriceBook")
    public void setPriceBook(String priceBook) {
        this.priceBook = priceBook;
    }

    @JsonProperty("ExDividendDate")
    public String getExDividendDate() {
        return exDividendDate;
    }

    @JsonProperty("ExDividendDate")
    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    @JsonProperty("PERatio")
    public String getPERatio() {
        return pERatio;
    }

    @JsonProperty("PERatio")
    public void setPERatio(String pERatio) {
        this.pERatio = pERatio;
    }

    @JsonProperty("DividendPayDate")
    public String getDividendPayDate() {
        return dividendPayDate;
    }

    @JsonProperty("DividendPayDate")
    public void setDividendPayDate(String dividendPayDate) {
        this.dividendPayDate = dividendPayDate;
    }

    @JsonProperty("PERatioRealtime")
    public Object getPERatioRealtime() {
        return pERatioRealtime;
    }

    @JsonProperty("PERatioRealtime")
    public void setPERatioRealtime(Object pERatioRealtime) {
        this.pERatioRealtime = pERatioRealtime;
    }

    @JsonProperty("PEGRatio")
    public String getPEGRatio() {
        return pEGRatio;
    }

    @JsonProperty("PEGRatio")
    public void setPEGRatio(String pEGRatio) {
        this.pEGRatio = pEGRatio;
    }

    @JsonProperty("PriceEPSEstimateCurrentYear")
    public String getPriceEPSEstimateCurrentYear() {
        return priceEPSEstimateCurrentYear;
    }

    @JsonProperty("PriceEPSEstimateCurrentYear")
    public void setPriceEPSEstimateCurrentYear(String priceEPSEstimateCurrentYear) {
        this.priceEPSEstimateCurrentYear = priceEPSEstimateCurrentYear;
    }

    @JsonProperty("PriceEPSEstimateNextYear")
    public String getPriceEPSEstimateNextYear() {
        return priceEPSEstimateNextYear;
    }

    @JsonProperty("PriceEPSEstimateNextYear")
    public void setPriceEPSEstimateNextYear(String priceEPSEstimateNextYear) {
        this.priceEPSEstimateNextYear = priceEPSEstimateNextYear;
    }

    @JsonProperty("Symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("Symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("SharesOwned")
    public Object getSharesOwned() {
        return sharesOwned;
    }

    @JsonProperty("SharesOwned")
    public void setSharesOwned(Object sharesOwned) {
        this.sharesOwned = sharesOwned;
    }

    @JsonProperty("ShortRatio")
    public String getShortRatio() {
        return shortRatio;
    }

    @JsonProperty("ShortRatio")
    public void setShortRatio(String shortRatio) {
        this.shortRatio = shortRatio;
    }

    @JsonProperty("LastTradeTime")
    public String getLastTradeTime() {
        return lastTradeTime;
    }

    @JsonProperty("LastTradeTime")
    public void setLastTradeTime(String lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    @JsonProperty("TickerTrend")
    public Object getTickerTrend() {
        return tickerTrend;
    }

    @JsonProperty("TickerTrend")
    public void setTickerTrend(Object tickerTrend) {
        this.tickerTrend = tickerTrend;
    }

    @JsonProperty("OneyrTargetPrice")
    public String getOneyrTargetPrice() {
        return oneyrTargetPrice;
    }

    @JsonProperty("OneyrTargetPrice")
    public void setOneyrTargetPrice(String oneyrTargetPrice) {
        this.oneyrTargetPrice = oneyrTargetPrice;
    }

    @JsonProperty("Volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("Volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @JsonProperty("HoldingsValue")
    public Object getHoldingsValue() {
        return holdingsValue;
    }

    @JsonProperty("HoldingsValue")
    public void setHoldingsValue(Object holdingsValue) {
        this.holdingsValue = holdingsValue;
    }

    @JsonProperty("HoldingsValueRealtime")
    public Object getHoldingsValueRealtime() {
        return holdingsValueRealtime;
    }

    @JsonProperty("HoldingsValueRealtime")
    public void setHoldingsValueRealtime(Object holdingsValueRealtime) {
        this.holdingsValueRealtime = holdingsValueRealtime;
    }

    @JsonProperty("YearRange")
    public String getYearRange() {
        return yearRange;
    }

    @JsonProperty("YearRange")
    public void setYearRange(String yearRange) {
        this.yearRange = yearRange;
    }

    @JsonProperty("DaysValueChange")
    public Object getDaysValueChange() {
        return daysValueChange;
    }

    @JsonProperty("DaysValueChange")
    public void setDaysValueChange(Object daysValueChange) {
        this.daysValueChange = daysValueChange;
    }

    @JsonProperty("DaysValueChangeRealtime")
    public Object getDaysValueChangeRealtime() {
        return daysValueChangeRealtime;
    }

    @JsonProperty("DaysValueChangeRealtime")
    public void setDaysValueChangeRealtime(Object daysValueChangeRealtime) {
        this.daysValueChangeRealtime = daysValueChangeRealtime;
    }

    @JsonProperty("StockExchange")
    public String getStockExchange() {
        return stockExchange;
    }

    @JsonProperty("StockExchange")
    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    @JsonProperty("DividendYield")
    public String getDividendYield() {
        return dividendYield;
    }

    @JsonProperty("DividendYield")
    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    @JsonProperty("PercentChange")
    public String getPercentChange() {
        return percentChange;
    }

    @JsonProperty("PercentChange")
    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
