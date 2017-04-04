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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Possummareddocumentpayment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Possummareddocumentpayment   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("issueddepositinvoices")
  private List<Possummareddocumentissueddinvoice> issueddepositinvoices = new ArrayList<Possummareddocumentissueddinvoice>();

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("paymenttype_id")
  private String paymenttypeId = null;

  @SerializedName("payment")
  private Double payment = null;

  @SerializedName("localpayment")
  private Double localpayment = null;

  @SerializedName("currrate")
  private Double currrate = null;

  @SerializedName("refcurrrate")
  private Double refcurrrate = null;

  @SerializedName("coef")
  private Integer coef = null;

  @SerializedName("localcoef")
  private Integer localcoef = null;

  @SerializedName("zone_id")
  private String zoneId = null;

  @SerializedName("localzone_id")
  private String localzoneId = null;

  @SerializedName("localvatamount")
  private Double localvatamount = null;

  public Possummareddocumentpayment displayname(String displayname) {
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

  public Possummareddocumentpayment id(String id) {
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

  public Possummareddocumentpayment classid(String classid) {
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

  public Possummareddocumentpayment objversion(Integer objversion) {
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

  public Possummareddocumentpayment parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu souhrnný pokladní doklad [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu souhrnný pokladní doklad [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Possummareddocumentpayment posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Possummareddocumentpayment issueddepositinvoices(List<Possummareddocumentissueddinvoice> issueddepositinvoices) {
    this.issueddepositinvoices = issueddepositinvoices;
    return this;
  }

  public Possummareddocumentpayment addIssueddepositinvoicesItem(Possummareddocumentissueddinvoice issueddepositinvoicesItem) {
    this.issueddepositinvoices.add(issueddepositinvoicesItem);
    return this;
  }

   /**
   * zálohové listy; kolekce bo souhrnný pokladní doklad - zálohový list [nepersistentní položka]
   * @return issueddepositinvoices
  **/
  @ApiModelProperty(example = "null", value = "zálohové listy; kolekce bo souhrnný pokladní doklad - zálohový list [nepersistentní položka]")
  public List<Possummareddocumentissueddinvoice> getIssueddepositinvoices() {
    return issueddepositinvoices;
  }

  public void setIssueddepositinvoices(List<Possummareddocumentissueddinvoice> issueddepositinvoices) {
    this.issueddepositinvoices = issueddepositinvoices;
  }

  public Possummareddocumentpayment currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * měna; id objektu měna [persistentní položka]
   * @return currencyId
  **/
  @ApiModelProperty(example = "null", value = "měna; id objektu měna [persistentní položka]")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Possummareddocumentpayment paymenttypeId(String paymenttypeId) {
    this.paymenttypeId = paymenttypeId;
    return this;
  }

   /**
   * druh platby; id objektu způsob úhrady [persistentní položka]
   * @return paymenttypeId
  **/
  @ApiModelProperty(example = "null", value = "druh platby; id objektu způsob úhrady [persistentní položka]")
  public String getPaymenttypeId() {
    return paymenttypeId;
  }

  public void setPaymenttypeId(String paymenttypeId) {
    this.paymenttypeId = paymenttypeId;
  }

  public Possummareddocumentpayment payment(Double payment) {
    this.payment = payment;
    return this;
  }

   /**
   * platba [persistentní položka]
   * @return payment
  **/
  @ApiModelProperty(example = "null", value = "platba [persistentní položka]")
  public Double getPayment() {
    return payment;
  }

  public void setPayment(Double payment) {
    this.payment = payment;
  }

  public Possummareddocumentpayment localpayment(Double localpayment) {
    this.localpayment = localpayment;
    return this;
  }

   /**
   * platba lokálně [persistentní položka]
   * @return localpayment
  **/
  @ApiModelProperty(example = "null", value = "platba lokálně [persistentní položka]")
  public Double getLocalpayment() {
    return localpayment;
  }

  public void setLocalpayment(Double localpayment) {
    this.localpayment = localpayment;
  }

  public Possummareddocumentpayment currrate(Double currrate) {
    this.currrate = currrate;
    return this;
  }

   /**
   * kurz měny [persistentní položka]
   * @return currrate
  **/
  @ApiModelProperty(example = "null", value = "kurz měny [persistentní položka]")
  public Double getCurrrate() {
    return currrate;
  }

  public void setCurrrate(Double currrate) {
    this.currrate = currrate;
  }

  public Possummareddocumentpayment refcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
    return this;
  }

   /**
   * kurz vztažný [persistentní položka]
   * @return refcurrrate
  **/
  @ApiModelProperty(example = "null", value = "kurz vztažný [persistentní položka]")
  public Double getRefcurrrate() {
    return refcurrrate;
  }

  public void setRefcurrrate(Double refcurrrate) {
    this.refcurrrate = refcurrrate;
  }

  public Possummareddocumentpayment coef(Integer coef) {
    this.coef = coef;
    return this;
  }

   /**
   * koeficient [persistentní položka]
   * @return coef
  **/
  @ApiModelProperty(example = "null", value = "koeficient [persistentní položka]")
  public Integer getCoef() {
    return coef;
  }

  public void setCoef(Integer coef) {
    this.coef = coef;
  }

  public Possummareddocumentpayment localcoef(Integer localcoef) {
    this.localcoef = localcoef;
    return this;
  }

   /**
   * lokální koeficient [persistentní položka]
   * @return localcoef
  **/
  @ApiModelProperty(example = "null", value = "lokální koeficient [persistentní položka]")
  public Integer getLocalcoef() {
    return localcoef;
  }

  public void setLocalcoef(Integer localcoef) {
    this.localcoef = localcoef;
  }

  public Possummareddocumentpayment zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * zóna; id objektu měna [persistentní položka]
   * @return zoneId
  **/
  @ApiModelProperty(example = "null", value = "zóna; id objektu měna [persistentní položka]")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }

  public Possummareddocumentpayment localzoneId(String localzoneId) {
    this.localzoneId = localzoneId;
    return this;
  }

   /**
   * lokální zóna; id objektu měna [persistentní položka]
   * @return localzoneId
  **/
  @ApiModelProperty(example = "null", value = "lokální zóna; id objektu měna [persistentní položka]")
  public String getLocalzoneId() {
    return localzoneId;
  }

  public void setLocalzoneId(String localzoneId) {
    this.localzoneId = localzoneId;
  }

  public Possummareddocumentpayment localvatamount(Double localvatamount) {
    this.localvatamount = localvatamount;
    return this;
  }

   /**
   * dph v lokální měně [persistentní položka]
   * @return localvatamount
  **/
  @ApiModelProperty(example = "null", value = "dph v lokální měně [persistentní položka]")
  public Double getLocalvatamount() {
    return localvatamount;
  }

  public void setLocalvatamount(Double localvatamount) {
    this.localvatamount = localvatamount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Possummareddocumentpayment possummareddocumentpayment = (Possummareddocumentpayment) o;
    return Objects.equals(this.displayname, possummareddocumentpayment.displayname) &&
        Objects.equals(this.id, possummareddocumentpayment.id) &&
        Objects.equals(this.classid, possummareddocumentpayment.classid) &&
        Objects.equals(this.objversion, possummareddocumentpayment.objversion) &&
        Objects.equals(this.parentId, possummareddocumentpayment.parentId) &&
        Objects.equals(this.posindex, possummareddocumentpayment.posindex) &&
        Objects.equals(this.issueddepositinvoices, possummareddocumentpayment.issueddepositinvoices) &&
        Objects.equals(this.currencyId, possummareddocumentpayment.currencyId) &&
        Objects.equals(this.paymenttypeId, possummareddocumentpayment.paymenttypeId) &&
        Objects.equals(this.payment, possummareddocumentpayment.payment) &&
        Objects.equals(this.localpayment, possummareddocumentpayment.localpayment) &&
        Objects.equals(this.currrate, possummareddocumentpayment.currrate) &&
        Objects.equals(this.refcurrrate, possummareddocumentpayment.refcurrrate) &&
        Objects.equals(this.coef, possummareddocumentpayment.coef) &&
        Objects.equals(this.localcoef, possummareddocumentpayment.localcoef) &&
        Objects.equals(this.zoneId, possummareddocumentpayment.zoneId) &&
        Objects.equals(this.localzoneId, possummareddocumentpayment.localzoneId) &&
        Objects.equals(this.localvatamount, possummareddocumentpayment.localvatamount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, issueddepositinvoices, currencyId, paymenttypeId, payment, localpayment, currrate, refcurrrate, coef, localcoef, zoneId, localzoneId, localvatamount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Possummareddocumentpayment {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    issueddepositinvoices: ").append(toIndentedString(issueddepositinvoices)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    paymenttypeId: ").append(toIndentedString(paymenttypeId)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    localpayment: ").append(toIndentedString(localpayment)).append("\n");
    sb.append("    currrate: ").append(toIndentedString(currrate)).append("\n");
    sb.append("    refcurrrate: ").append(toIndentedString(refcurrrate)).append("\n");
    sb.append("    coef: ").append(toIndentedString(coef)).append("\n");
    sb.append("    localcoef: ").append(toIndentedString(localcoef)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    localzoneId: ").append(toIndentedString(localzoneId)).append("\n");
    sb.append("    localvatamount: ").append(toIndentedString(localvatamount)).append("\n");
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
