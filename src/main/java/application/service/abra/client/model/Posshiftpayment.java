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
 * Posshiftpayment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posshiftpayment   {
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

  @SerializedName("paymenttype_id")
  private String paymenttypeId = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("payment")
  private Double payment = null;

  @SerializedName("refund")
  private Double refund = null;

  public Posshiftpayment displayname(String displayname) {
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

  public Posshiftpayment id(String id) {
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

  public Posshiftpayment classid(String classid) {
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

  public Posshiftpayment objversion(Integer objversion) {
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

  public Posshiftpayment parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu směna [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu směna [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Posshiftpayment paymenttypeId(String paymenttypeId) {
    this.paymenttypeId = paymenttypeId;
    return this;
  }

   /**
   * způsob úhrady; id objektu způsob úhrady [persistentní položka]
   * @return paymenttypeId
  **/
  @ApiModelProperty(example = "null", value = "způsob úhrady; id objektu způsob úhrady [persistentní položka]")
  public String getPaymenttypeId() {
    return paymenttypeId;
  }

  public void setPaymenttypeId(String paymenttypeId) {
    this.paymenttypeId = paymenttypeId;
  }

  public Posshiftpayment currencyId(String currencyId) {
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

  public Posshiftpayment payment(Double payment) {
    this.payment = payment;
    return this;
  }

   /**
   * placeno [persistentní položka]
   * @return payment
  **/
  @ApiModelProperty(example = "null", value = "placeno [persistentní položka]")
  public Double getPayment() {
    return payment;
  }

  public void setPayment(Double payment) {
    this.payment = payment;
  }

  public Posshiftpayment refund(Double refund) {
    this.refund = refund;
    return this;
  }

   /**
   * vráceno [persistentní položka]
   * @return refund
  **/
  @ApiModelProperty(example = "null", value = "vráceno [persistentní položka]")
  public Double getRefund() {
    return refund;
  }

  public void setRefund(Double refund) {
    this.refund = refund;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posshiftpayment posshiftpayment = (Posshiftpayment) o;
    return Objects.equals(this.displayname, posshiftpayment.displayname) &&
        Objects.equals(this.id, posshiftpayment.id) &&
        Objects.equals(this.classid, posshiftpayment.classid) &&
        Objects.equals(this.objversion, posshiftpayment.objversion) &&
        Objects.equals(this.parentId, posshiftpayment.parentId) &&
        Objects.equals(this.paymenttypeId, posshiftpayment.paymenttypeId) &&
        Objects.equals(this.currencyId, posshiftpayment.currencyId) &&
        Objects.equals(this.payment, posshiftpayment.payment) &&
        Objects.equals(this.refund, posshiftpayment.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, paymenttypeId, currencyId, payment, refund);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posshiftpayment {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    paymenttypeId: ").append(toIndentedString(paymenttypeId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

