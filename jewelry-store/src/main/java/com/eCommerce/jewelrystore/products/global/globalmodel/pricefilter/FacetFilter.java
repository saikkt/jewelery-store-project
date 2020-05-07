package com.eCommerce.jewelrystore.products.global.globalmodel.pricefilter;

import java.math.BigDecimal;

public class FacetFilter {

    private String name;
    private long id;
    private boolean enabled;
    private int count;
    private BigDecimal min_price;
    private BigDecimal max_price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getMin_price() {
        return min_price;
    }

    public void setMin_price(BigDecimal min_price) {
        this.min_price = min_price;
    }

    public BigDecimal getMax_price() {
        return max_price;
    }

    public void setMax_price(BigDecimal max_price) {
        this.max_price = max_price;
    }
}
