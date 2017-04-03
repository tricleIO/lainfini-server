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
 * Posreceiptcheque
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posreceiptcheque   {
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

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("paymenttype_id")
  private String paymenttypeId = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("textdoc")
  private String textdoc = null;

  @SerializedName("authcode")
  private String authcode = null;

  @SerializedName("transactiondata")
  private String transactiondata = null;

  @SerializedName("chequestate")
  private Integer chequestate = null;

  public Posreceiptcheque displayname(String displayname) {
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

  public Posreceiptcheque id(String id) {
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

  public Posreceiptcheque classid(String classid) {
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

  public Posreceiptcheque objversion(Integer objversion) {
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

  public Posreceiptcheque parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu tržba - řádek [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu tržba - řádek [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Posreceiptcheque currencyId(String currencyId) {
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

  public Posreceiptcheque paymenttypeId(String paymenttypeId) {
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

  public Posreceiptcheque amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * hodnota [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "hodnota [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Posreceiptcheque description(String description) {
    this.description = description;
    return this;
  }

   /**
   * text [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "text [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Posreceiptcheque textdoc(String textdoc) {
    this.textdoc = textdoc;
    return this;
  }

   /**
   * Účtenka [persistentní položka]
   * @return textdoc
  **/
  @ApiModelProperty(example = "null", value = "Účtenka [persistentní položka]")
  public String getTextdoc() {
    return textdoc;
  }

  public void setTextdoc(String textdoc) {
    this.textdoc = textdoc;
  }

  public Posreceiptcheque authcode(String authcode) {
    this.authcode = authcode;
    return this;
  }

   /**
   * autorizační kód [persistentní položka]
   * @return authcode
  **/
  @ApiModelProperty(example = "null", value = "autorizační kód [persistentní položka]")
  public String getAuthcode() {
    return authcode;
  }

  public void setAuthcode(String authcode) {
    this.authcode = authcode;
  }

  public Posreceiptcheque transactiondata(String transactiondata) {
    this.transactiondata = transactiondata;
    return this;
  }

   /**
   * transakční data [persistentní položka]
   * @return transactiondata
  **/
  @ApiModelProperty(example = "null", value = "transakční data [persistentní položka]")
  public String getTransactiondata() {
    return transactiondata;
  }

  public void setTransactiondata(String transactiondata) {
    this.transactiondata = transactiondata;
  }

  public Posreceiptcheque chequestate(Integer chequestate) {
    this.chequestate = chequestate;
    return this;
  }

   /**
   * stav [persistentní položka]
   * @return chequestate
  **/
  @ApiModelProperty(example = "null", value = "stav [persistentní položka]")
  public Integer getChequestate() {
    return chequestate;
  }

  public void setChequestate(Integer chequestate) {
    this.chequestate = chequestate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posreceiptcheque posreceiptcheque = (Posreceiptcheque) o;
    return Objects.equals(this.displayname, posreceiptcheque.displayname) &&
        Objects.equals(this.id, posreceiptcheque.id) &&
        Objects.equals(this.classid, posreceiptcheque.classid) &&
        Objects.equals(this.objversion, posreceiptcheque.objversion) &&
        Objects.equals(this.parentId, posreceiptcheque.parentId) &&
        Objects.equals(this.currencyId, posreceiptcheque.currencyId) &&
        Objects.equals(this.paymenttypeId, posreceiptcheque.paymenttypeId) &&
        Objects.equals(this.amount, posreceiptcheque.amount) &&
        Objects.equals(this.description, posreceiptcheque.description) &&
        Objects.equals(this.textdoc, posreceiptcheque.textdoc) &&
        Objects.equals(this.authcode, posreceiptcheque.authcode) &&
        Objects.equals(this.transactiondata, posreceiptcheque.transactiondata) &&
        Objects.equals(this.chequestate, posreceiptcheque.chequestate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, currencyId, paymenttypeId, amount, description, textdoc, authcode, transactiondata, chequestate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posreceiptcheque {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    paymenttypeId: ").append(toIndentedString(paymenttypeId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    textdoc: ").append(toIndentedString(textdoc)).append("\n");
    sb.append("    authcode: ").append(toIndentedString(authcode)).append("\n");
    sb.append("    transactiondata: ").append(toIndentedString(transactiondata)).append("\n");
    sb.append("    chequestate: ").append(toIndentedString(chequestate)).append("\n");
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

