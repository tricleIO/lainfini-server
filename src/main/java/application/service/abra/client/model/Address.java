/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * Address
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Address   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Recipient")
  private String recipient = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Street")
  private String street = null;

  @SerializedName("PostCode")
  private String postCode = null;

  @SerializedName("ZIP")
  private String ZIP = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("PhoneNumber1")
  private String phoneNumber1 = null;

  @SerializedName("PhoneNumber2")
  private String phoneNumber2 = null;

  @SerializedName("FaxNumber")
  private String faxNumber = null;

  @SerializedName("EMail")
  private String eMail = null;

  @SerializedName("Location")
  private String location = null;

  @SerializedName("ShortAddress")
  private String shortAddress = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("OfficialStreet")
  private String officialStreet = null;

  @SerializedName("OfficialCity")
  private String officialCity = null;

  @SerializedName("OfficialHouseNumber")
  private String officialHouseNumber = null;

  @SerializedName("GPS")
  private String GPS = null;

  @SerializedName("Databox")
  private String databox = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

  public Address recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Adresát [persistentní položka]
   * @return recipient
  **/
  @ApiModelProperty(example = "null", value = "Adresát [persistentní položka]")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Město [persistentní položka]
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "Město [persistentní položka]")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Ulice [persistentní položka]
   * @return street
  **/
  @ApiModelProperty(example = "null", value = "Ulice [persistentní položka]")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * PSČ [persistentní položka]
   * @return postCode
  **/
  @ApiModelProperty(example = "null", value = "PSČ [persistentní položka]")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Address ZIP(String ZIP) {
    this.ZIP = ZIP;
    return this;
  }

   /**
   * ZIP kód [persistentní položka]
   * @return ZIP
  **/
  @ApiModelProperty(example = "null", value = "ZIP kód [persistentní položka]")
  public String getZIP() {
    return ZIP;
  }

  public void setZIP(String ZIP) {
    this.ZIP = ZIP;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Země [persistentní položka]
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Země [persistentní položka]")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address phoneNumber1(String phoneNumber1) {
    this.phoneNumber1 = phoneNumber1;
    return this;
  }

   /**
   * Telefon 1. [persistentní položka]
   * @return phoneNumber1
  **/
  @ApiModelProperty(example = "null", value = "Telefon 1. [persistentní položka]")
  public String getPhoneNumber1() {
    return phoneNumber1;
  }

  public void setPhoneNumber1(String phoneNumber1) {
    this.phoneNumber1 = phoneNumber1;
  }

  public Address phoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
    return this;
  }

   /**
   * Telefon 2. [persistentní položka]
   * @return phoneNumber2
  **/
  @ApiModelProperty(example = "null", value = "Telefon 2. [persistentní položka]")
  public String getPhoneNumber2() {
    return phoneNumber2;
  }

  public void setPhoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
  }

  public Address faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * FAX [persistentní položka]
   * @return faxNumber
  **/
  @ApiModelProperty(example = "null", value = "FAX [persistentní položka]")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Address eMail(String eMail) {
    this.eMail = eMail;
    return this;
  }

   /**
   * E-mail [persistentní položka]
   * @return eMail
  **/
  @ApiModelProperty(example = "null", value = "E-mail [persistentní položka]")
  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  public Address location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Oddělení [persistentní položka]
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "Oddělení [persistentní položka]")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

   /**
   * Adresa
   * @return shortAddress
  **/
  @ApiModelProperty(example = "null", value = "Adresa")
  public String getShortAddress() {
    return shortAddress;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Kód země [persistentní položka]
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "Kód země [persistentní položka]")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

   /**
   * Úřední ulice
   * @return officialStreet
  **/
  @ApiModelProperty(example = "null", value = "Úřední ulice")
  public String getOfficialStreet() {
    return officialStreet;
  }

   /**
   * Úřední město
   * @return officialCity
  **/
  @ApiModelProperty(example = "null", value = "Úřední město")
  public String getOfficialCity() {
    return officialCity;
  }

   /**
   * Úřední domovní číslo
   * @return officialHouseNumber
  **/
  @ApiModelProperty(example = "null", value = "Úřední domovní číslo")
  public String getOfficialHouseNumber() {
    return officialHouseNumber;
  }

  public Address GPS(String GPS) {
    this.GPS = GPS;
    return this;
  }

   /**
   * GPS [persistentní položka]
   * @return GPS
  **/
  @ApiModelProperty(example = "null", value = "GPS [persistentní položka]")
  public String getGPS() {
    return GPS;
  }

  public void setGPS(String GPS) {
    this.GPS = GPS;
  }

  public Address databox(String databox) {
    this.databox = databox;
    return this;
  }

   /**
   * Databox [persistentní položka]
   * @return databox
  **/
  @ApiModelProperty(example = "null", value = "Databox [persistentní položka]")
  public String getDatabox() {
    return databox;
  }

  public void setDatabox(String databox) {
    this.databox = databox;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.displayName, address.displayName) &&
        Objects.equals(this.ID, address.ID) &&
        Objects.equals(this.classID, address.classID) &&
        Objects.equals(this.objVersion, address.objVersion) &&
        Objects.equals(this.recipient, address.recipient) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.postCode, address.postCode) &&
        Objects.equals(this.ZIP, address.ZIP) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.phoneNumber1, address.phoneNumber1) &&
        Objects.equals(this.phoneNumber2, address.phoneNumber2) &&
        Objects.equals(this.faxNumber, address.faxNumber) &&
        Objects.equals(this.eMail, address.eMail) &&
        Objects.equals(this.location, address.location) &&
        Objects.equals(this.shortAddress, address.shortAddress) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.officialStreet, address.officialStreet) &&
        Objects.equals(this.officialCity, address.officialCity) &&
        Objects.equals(this.officialHouseNumber, address.officialHouseNumber) &&
        Objects.equals(this.GPS, address.GPS) &&
        Objects.equals(this.databox, address.databox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, recipient, city, street, postCode, ZIP, country, phoneNumber1, phoneNumber2, faxNumber, eMail, location, shortAddress, countryCode, officialStreet, officialCity, officialHouseNumber, GPS, databox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    ZIP: ").append(toIndentedString(ZIP)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber1: ").append(toIndentedString(phoneNumber1)).append("\n");
    sb.append("    phoneNumber2: ").append(toIndentedString(phoneNumber2)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    eMail: ").append(toIndentedString(eMail)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    shortAddress: ").append(toIndentedString(shortAddress)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    officialStreet: ").append(toIndentedString(officialStreet)).append("\n");
    sb.append("    officialCity: ").append(toIndentedString(officialCity)).append("\n");
    sb.append("    officialHouseNumber: ").append(toIndentedString(officialHouseNumber)).append("\n");
    sb.append("    GPS: ").append(toIndentedString(GPS)).append("\n");
    sb.append("    databox: ").append(toIndentedString(databox)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

