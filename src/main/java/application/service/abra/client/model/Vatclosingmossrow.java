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
 * Vatclosingmossrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Vatclosingmossrow   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("vatcountry_id")
  private String vatcountryId = null;

  @SerializedName("country_id")
  private String countryId = null;

  @SerializedName("vatrate_id")
  private String vatrateId = null;

  @SerializedName("oldtaxableamount")
  private Double oldtaxableamount = null;

  @SerializedName("oldvatamount")
  private Double oldvatamount = null;

  @SerializedName("calctaxableamount")
  private Double calctaxableamount = null;

  @SerializedName("calcvatamount")
  private Double calcvatamount = null;

  @SerializedName("corrtaxableamount")
  private Double corrtaxableamount = null;

  @SerializedName("corrvatamount")
  private Double corrvatamount = null;

  @SerializedName("taxableamount")
  private Double taxableamount = null;

  @SerializedName("vatamount")
  private Double vatamount = null;

  @SerializedName("vatidentnumber")
  private String vatidentnumber = null;

  public Vatclosingmossrow displayname(String displayname) {
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

  public Vatclosingmossrow id(String id) {
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

  public Vatclosingmossrow classid(String classid) {
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

  public Vatclosingmossrow objversion(Integer objversion) {
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

  public Vatclosingmossrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu uzávěrka dph [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu uzávěrka dph [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Vatclosingmossrow vatcountryId(String vatcountryId) {
    this.vatcountryId = vatcountryId;
    return this;
  }

   /**
   * stát dodavatele; id objektu země [persistentní položka]
   * @return vatcountryId
  **/
  @ApiModelProperty(example = "null", value = "stát dodavatele; id objektu země [persistentní položka]")
  public String getVatcountryId() {
    return vatcountryId;
  }

  public void setVatcountryId(String vatcountryId) {
    this.vatcountryId = vatcountryId;
  }

  public Vatclosingmossrow countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * stát určení; id objektu země [persistentní položka]
   * @return countryId
  **/
  @ApiModelProperty(example = "null", value = "stát určení; id objektu země [persistentní položka]")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public Vatclosingmossrow vatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
    return this;
  }

   /**
   * dph sazba; id objektu dph sazba [persistentní položka]
   * @return vatrateId
  **/
  @ApiModelProperty(example = "null", value = "dph sazba; id objektu dph sazba [persistentní položka]")
  public String getVatrateId() {
    return vatrateId;
  }

  public void setVatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
  }

  public Vatclosingmossrow oldtaxableamount(Double oldtaxableamount) {
    this.oldtaxableamount = oldtaxableamount;
    return this;
  }

   /**
   * původní základ [persistentní položka]
   * @return oldtaxableamount
  **/
  @ApiModelProperty(example = "null", value = "původní základ [persistentní položka]")
  public Double getOldtaxableamount() {
    return oldtaxableamount;
  }

  public void setOldtaxableamount(Double oldtaxableamount) {
    this.oldtaxableamount = oldtaxableamount;
  }

  public Vatclosingmossrow oldvatamount(Double oldvatamount) {
    this.oldvatamount = oldvatamount;
    return this;
  }

   /**
   * původní daň [persistentní položka]
   * @return oldvatamount
  **/
  @ApiModelProperty(example = "null", value = "původní daň [persistentní položka]")
  public Double getOldvatamount() {
    return oldvatamount;
  }

  public void setOldvatamount(Double oldvatamount) {
    this.oldvatamount = oldvatamount;
  }

  public Vatclosingmossrow calctaxableamount(Double calctaxableamount) {
    this.calctaxableamount = calctaxableamount;
    return this;
  }

   /**
   * vypočtený základ [persistentní položka]
   * @return calctaxableamount
  **/
  @ApiModelProperty(example = "null", value = "vypočtený základ [persistentní položka]")
  public Double getCalctaxableamount() {
    return calctaxableamount;
  }

  public void setCalctaxableamount(Double calctaxableamount) {
    this.calctaxableamount = calctaxableamount;
  }

  public Vatclosingmossrow calcvatamount(Double calcvatamount) {
    this.calcvatamount = calcvatamount;
    return this;
  }

   /**
   * vypočtená daň [persistentní položka]
   * @return calcvatamount
  **/
  @ApiModelProperty(example = "null", value = "vypočtená daň [persistentní položka]")
  public Double getCalcvatamount() {
    return calcvatamount;
  }

  public void setCalcvatamount(Double calcvatamount) {
    this.calcvatamount = calcvatamount;
  }

  public Vatclosingmossrow corrtaxableamount(Double corrtaxableamount) {
    this.corrtaxableamount = corrtaxableamount;
    return this;
  }

   /**
   * oprava základu [persistentní položka]
   * @return corrtaxableamount
  **/
  @ApiModelProperty(example = "null", value = "oprava základu [persistentní položka]")
  public Double getCorrtaxableamount() {
    return corrtaxableamount;
  }

  public void setCorrtaxableamount(Double corrtaxableamount) {
    this.corrtaxableamount = corrtaxableamount;
  }

  public Vatclosingmossrow corrvatamount(Double corrvatamount) {
    this.corrvatamount = corrvatamount;
    return this;
  }

   /**
   * oprava daně [persistentní položka]
   * @return corrvatamount
  **/
  @ApiModelProperty(example = "null", value = "oprava daně [persistentní položka]")
  public Double getCorrvatamount() {
    return corrvatamount;
  }

  public void setCorrvatamount(Double corrvatamount) {
    this.corrvatamount = corrvatamount;
  }

  public Vatclosingmossrow taxableamount(Double taxableamount) {
    this.taxableamount = taxableamount;
    return this;
  }

   /**
   * základ [persistentní položka]
   * @return taxableamount
  **/
  @ApiModelProperty(example = "null", value = "základ [persistentní položka]")
  public Double getTaxableamount() {
    return taxableamount;
  }

  public void setTaxableamount(Double taxableamount) {
    this.taxableamount = taxableamount;
  }

  public Vatclosingmossrow vatamount(Double vatamount) {
    this.vatamount = vatamount;
    return this;
  }

   /**
   * daň [persistentní položka]
   * @return vatamount
  **/
  @ApiModelProperty(example = "null", value = "daň [persistentní položka]")
  public Double getVatamount() {
    return vatamount;
  }

  public void setVatamount(Double vatamount) {
    this.vatamount = vatamount;
  }

  public Vatclosingmossrow vatidentnumber(String vatidentnumber) {
    this.vatidentnumber = vatidentnumber;
    return this;
  }

   /**
   * identifikátor dph [persistentní položka]
   * @return vatidentnumber
  **/
  @ApiModelProperty(example = "null", value = "identifikátor dph [persistentní položka]")
  public String getVatidentnumber() {
    return vatidentnumber;
  }

  public void setVatidentnumber(String vatidentnumber) {
    this.vatidentnumber = vatidentnumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vatclosingmossrow vatclosingmossrow = (Vatclosingmossrow) o;
    return Objects.equals(this.displayname, vatclosingmossrow.displayname) &&
        Objects.equals(this.id, vatclosingmossrow.id) &&
        Objects.equals(this.classid, vatclosingmossrow.classid) &&
        Objects.equals(this.objversion, vatclosingmossrow.objversion) &&
        Objects.equals(this.parentId, vatclosingmossrow.parentId) &&
        Objects.equals(this.vatcountryId, vatclosingmossrow.vatcountryId) &&
        Objects.equals(this.countryId, vatclosingmossrow.countryId) &&
        Objects.equals(this.vatrateId, vatclosingmossrow.vatrateId) &&
        Objects.equals(this.oldtaxableamount, vatclosingmossrow.oldtaxableamount) &&
        Objects.equals(this.oldvatamount, vatclosingmossrow.oldvatamount) &&
        Objects.equals(this.calctaxableamount, vatclosingmossrow.calctaxableamount) &&
        Objects.equals(this.calcvatamount, vatclosingmossrow.calcvatamount) &&
        Objects.equals(this.corrtaxableamount, vatclosingmossrow.corrtaxableamount) &&
        Objects.equals(this.corrvatamount, vatclosingmossrow.corrvatamount) &&
        Objects.equals(this.taxableamount, vatclosingmossrow.taxableamount) &&
        Objects.equals(this.vatamount, vatclosingmossrow.vatamount) &&
        Objects.equals(this.vatidentnumber, vatclosingmossrow.vatidentnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, vatcountryId, countryId, vatrateId, oldtaxableamount, oldvatamount, calctaxableamount, calcvatamount, corrtaxableamount, corrvatamount, taxableamount, vatamount, vatidentnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vatclosingmossrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    vatcountryId: ").append(toIndentedString(vatcountryId)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    vatrateId: ").append(toIndentedString(vatrateId)).append("\n");
    sb.append("    oldtaxableamount: ").append(toIndentedString(oldtaxableamount)).append("\n");
    sb.append("    oldvatamount: ").append(toIndentedString(oldvatamount)).append("\n");
    sb.append("    calctaxableamount: ").append(toIndentedString(calctaxableamount)).append("\n");
    sb.append("    calcvatamount: ").append(toIndentedString(calcvatamount)).append("\n");
    sb.append("    corrtaxableamount: ").append(toIndentedString(corrtaxableamount)).append("\n");
    sb.append("    corrvatamount: ").append(toIndentedString(corrvatamount)).append("\n");
    sb.append("    taxableamount: ").append(toIndentedString(taxableamount)).append("\n");
    sb.append("    vatamount: ").append(toIndentedString(vatamount)).append("\n");
    sb.append("    vatidentnumber: ").append(toIndentedString(vatidentnumber)).append("\n");
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
