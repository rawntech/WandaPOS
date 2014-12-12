//    Wanda POS - Africa's Gift to the World
//    Copyright (c) 2014-2015 IT-Kamer & previous Unicenta POS and Openbravo POS works
//    www.erp-university-africa.com
//
//    This file is part of Wanda POS
//
//    Wanda POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Wanda POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Wanda POS.  If not, see <http://www.gnu.org/licenses/>.

package cm.wandapos.webservices.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ing. Tatioti Mbogning Raoul
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StandardResponseDocument")
public class StandardResponseDocument {
    
    @XmlElement(name = "recordID", required = true)
    private String m_recordID;

    @XmlElement(name = "Error")
    private String m_error;
    
    public String getRecordID() {
        return m_recordID;
    }

    public void setRecordID(String recordID) {
        this.m_recordID = recordID;
    }
    
    public void setError(String error) {
        this.m_error = error;
    }

    public String getError() {
        return m_error;
    }
}
