package com.github.peholmst.soapsamples.server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(String.class)
public enum Gender {
    @XmlEnumValue("MALE")
    MALE, 
    @XmlEnumValue("FEMALE")
    FEMALE
}
