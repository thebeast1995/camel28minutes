package com.practice.camelmicroserviceb.routes;

public class SettlementInstruction {
    public SettlementInstruction(){}
    public SettlementInstruction(String from, String to, Integer tradeReference)
    {
        this.from = from;
        this.to = to;
        this.tradeReference = tradeReference;
    }

    @Override
    public String toString() {
        return "SettlementInstruction{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", tradeReference=" + tradeReference +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getTradeReference() {
        return tradeReference;
    }

    public void setTradeReference(Integer tradeReference) {
        this.tradeReference = tradeReference;
    }

    private String from;
    private String to;
    private Integer tradeReference;
}