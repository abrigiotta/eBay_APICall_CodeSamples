//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Collection of zero, one, or multiple individual detail account entries. Contains
 * 				one AccountEntry object for each account entry returned. See the schema
 * 				documentation for AccountEntryType for details on its properties. You can uniquely identify
 * 				the entries that the GetAccount call returns within the AccountEntries tag.
 * 				Specifically, the following fields, returned within the AccountEntries tag,
 * 				can be used in combination as a unique key: AccountEntry.Date, AccountEntry.AccountDetailsEntryType,
 * 				AccountEntry.ItemID, and AccountEntry.RefNumber.
 * 			
 * 
 * <p>Java class for AccountEntriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountEntriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountEntry" type="{urn:ebay:apis:eBLBaseComponents}AccountEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountEntriesType", propOrder = {
    "accountEntry"
})
public class AccountEntriesType {

    @XmlElement(name = "AccountEntry")
    protected List<AccountEntryType> accountEntry;

    /**
     * Gets the value of the accountEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountEntryType }
     * 
     * 
     */
    public List<AccountEntryType> getAccountEntry() {
        if (accountEntry == null) {
            accountEntry = new ArrayList<AccountEntryType>();
        }
        return this.accountEntry;
    }

}
