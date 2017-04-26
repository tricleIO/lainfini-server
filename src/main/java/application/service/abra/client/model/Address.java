/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Address   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("recipient")
  private String recipient = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("postcode")
  private String postcode = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phonenumber1")
  private String phonenumber1 = null;

  @SerializedName("phonenumber2")
  private String phonenumber2 = null;

  @SerializedName("faxnumber")
  private String faxnumber = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("shortaddress")
  private String shortaddress = null;

  @SerializedName("countrycode")
  private String countrycode = null;

  @SerializedName("officialstreet")
  private String officialstreet = null;

  @SerializedName("officialcity")
  private String officialcity = null;

  @SerializedName("officialhousenumber")
  private String officialhousenumber = null;

  @SerializedName("gps")
  private String gps = null;

  @SerializedName("databox")
  private String databox = null;

  public Address displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Address id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Address classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Address objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Address recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * adresát [persistentní položka]
   * @return recipient
  **/
  @ApiModelProperty(example = "null", value = "adresát [persistentní položka]")
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
   * město [persistentní položka]
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "město [persistentní položka]")
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
   * ulice [persistentní položka]
   * @return street
  **/
  @ApiModelProperty(example = "null", value = "ulice [persistentní položka]")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * psČ [persistentní položka]
   * @return postcode
  **/
  @ApiModelProperty(example = "null", value = "psČ [persistentní položka]")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Address zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * zip kód [persistentní položka]
   * @return zip
  **/
  @ApiModelProperty(example = "null", value = "zip kód [persistentní položka]")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * země [persistentní položka]
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "země [persistentní položka]")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address phonenumber1(String phonenumber1) {
    this.phonenumber1 = phonenumber1;
    return this;
  }

   /**
   * telefon 1. [persistentní položka]
   * @return phonenumber1
  **/
  @ApiModelProperty(example = "null", value = "telefon 1. [persistentní položka]")
  public String getPhonenumber1() {
    return phonenumber1;
  }

  public void setPhonenumber1(String phonenumber1) {
    this.phonenumber1 = phonenumber1;
  }

  public Address phonenumber2(String phonenumber2) {
    this.phonenumber2 = phonenumber2;
    return this;
  }

   /**
   * telefon 2. [persistentní položka]
   * @return phonenumber2
  **/
  @ApiModelProperty(example = "null", value = "telefon 2. [persistentní položka]")
  public String getPhonenumber2() {
    return phonenumber2;
  }

  public void setPhonenumber2(String phonenumber2) {
    this.phonenumber2 = phonenumber2;
  }

  public Address faxnumber(String faxnumber) {
    this.faxnumber = faxnumber;
    return this;
  }

   /**
   * fax [persistentní položka]
   * @return faxnumber
  **/
  @ApiModelProperty(example = "null", value = "fax [persistentní položka]")
  public String getFaxnumber() {
    return faxnumber;
  }

  public void setFaxnumber(String faxnumber) {
    this.faxnumber = faxnumber;
  }

  public Address email(String email) {
    this.email = email;
    return this;
  }

   /**
   * e-mail [persistentní položka]
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "e-mail [persistentní položka]")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address location(String location) {
    this.location = location;
    return this;
  }

   /**
   * oddělení [persistentní položka]
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "oddělení [persistentní položka]")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Address shortaddress(String shortaddress) {
    this.shortaddress = shortaddress;
    return this;
  }

   /**
   * adresa
   * @return shortaddress
  **/
  @ApiModelProperty(example = "null", value = "adresa")
  public String getShortaddress() {
    return shortaddress;
  }

  public void setShortaddress(String shortaddress) {
    this.shortaddress = shortaddress;
  }

  public Address countrycode(String countrycode) {
    this.countrycode = countrycode;
    return this;
  }

   /**
   * kód země [persistentní položka]
   * @return countrycode
  **/
  @ApiModelProperty(example = "null", value = "kód země [persistentní položka]")
  public String getCountrycode() {
    return countrycode;
  }

  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }

  public Address officialstreet(String officialstreet) {
    this.officialstreet = officialstreet;
    return this;
  }

   /**
   * Úřední ulice
   * @return officialstreet
  **/
  @ApiModelProperty(example = "null", value = "Úřední ulice")
  public String getOfficialstreet() {
    return officialstreet;
  }

  public void setOfficialstreet(String officialstreet) {
    this.officialstreet = officialstreet;
  }

  public Address officialcity(String officialcity) {
    this.officialcity = officialcity;
    return this;
  }

   /**
   * Úřední město
   * @return officialcity
  **/
  @ApiModelProperty(example = "null", value = "Úřední město")
  public String getOfficialcity() {
    return officialcity;
  }

  public void setOfficialcity(String officialcity) {
    this.officialcity = officialcity;
  }

  public Address officialhousenumber(String officialhousenumber) {
    this.officialhousenumber = officialhousenumber;
    return this;
  }

   /**
   * Úřední domovní číslo
   * @return officialhousenumber
  **/
  @ApiModelProperty(example = "null", value = "Úřední domovní číslo")
  public String getOfficialhousenumber() {
    return officialhousenumber;
  }

  public void setOfficialhousenumber(String officialhousenumber) {
    this.officialhousenumber = officialhousenumber;
  }

  public Address gps(String gps) {
    this.gps = gps;
    return this;
  }

   /**
   * gps [persistentní položka]
   * @return gps
  **/
  @ApiModelProperty(example = "null", value = "gps [persistentní položka]")
  public String getGps() {
    return gps;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  public Address databox(String databox) {
    this.databox = databox;
    return this;
  }

   /**
   * databox [persistentní položka]
   * @return databox
  **/
  @ApiModelProperty(example = "null", value = "databox [persistentní položka]")
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
    return Objects.equals(this.displayname, address.displayname) &&
        Objects.equals(this.id, address.id) &&
        Objects.equals(this.classid, address.classid) &&
        Objects.equals(this.objversion, address.objversion) &&
        Objects.equals(this.recipient, address.recipient) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.zip, address.zip) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.phonenumber1, address.phonenumber1) &&
        Objects.equals(this.phonenumber2, address.phonenumber2) &&
        Objects.equals(this.faxnumber, address.faxnumber) &&
        Objects.equals(this.email, address.email) &&
        Objects.equals(this.location, address.location) &&
        Objects.equals(this.shortaddress, address.shortaddress) &&
        Objects.equals(this.countrycode, address.countrycode) &&
        Objects.equals(this.officialstreet, address.officialstreet) &&
        Objects.equals(this.officialcity, address.officialcity) &&
        Objects.equals(this.officialhousenumber, address.officialhousenumber) &&
        Objects.equals(this.gps, address.gps) &&
        Objects.equals(this.databox, address.databox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, recipient, city, street, postcode, zip, country, phonenumber1, phonenumber2, faxnumber, email, location, shortaddress, countrycode, officialstreet, officialcity, officialhousenumber, gps, databox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phonenumber1: ").append(toIndentedString(phonenumber1)).append("\n");
    sb.append("    phonenumber2: ").append(toIndentedString(phonenumber2)).append("\n");
    sb.append("    faxnumber: ").append(toIndentedString(faxnumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    shortaddress: ").append(toIndentedString(shortaddress)).append("\n");
    sb.append("    countrycode: ").append(toIndentedString(countrycode)).append("\n");
    sb.append("    officialstreet: ").append(toIndentedString(officialstreet)).append("\n");
    sb.append("    officialcity: ").append(toIndentedString(officialcity)).append("\n");
    sb.append("    officialhousenumber: ").append(toIndentedString(officialhousenumber)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
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

