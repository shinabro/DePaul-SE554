
package edu.depaul.ipd.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.3.0
 * Sun May 08 20:13:45 CDT 2011
 * Generated source version: 2.3.0
 */

@XmlRootElement(name = "getColorOptionsResponse", namespace = "http://ws.ipd.depaul.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getColorOptionsResponse", namespace = "http://ws.ipd.depaul.edu/")

public class GetColorOptionsResponse {

    @XmlElement(name = "return")
    private String[] _return;

    public String[] getReturn() {
        return this._return;
    }

    public void setReturn(String[] new_return)  {
        this._return = new_return;
    }

}

