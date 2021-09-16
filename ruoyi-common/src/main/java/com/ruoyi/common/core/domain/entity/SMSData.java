package com.ruoyi.common.core.domain.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SMSData {

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("a", "字母A")
                .append("b", "字母B")
                .append("c", "字母C")
                .append("d", "字母D")
                .append("e", "字母E")
                .toString();
    }



    public void main(String[] args) {
        System.out.println(this.toString());
    }


}
