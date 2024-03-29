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
 * Posreceiptrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posreceiptrow   {
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

  @SerializedName("initiativeamount")
  private Double initiativeamount = null;

  @SerializedName("amounttenancy")
  private Double amounttenancy = null;

  @SerializedName("issuedinvoice")
  private Double issuedinvoice = null;

  @SerializedName("issueddinvoice")
  private Double issueddinvoice = null;

  @SerializedName("amountdeposit")
  private Double amountdeposit = null;

  @SerializedName("amountcollection")
  private Double amountcollection = null;

  @SerializedName("issuedadvance")
  private Double issuedadvance = null;

  @SerializedName("finalamount")
  private Double finalamount = null;

  @SerializedName("realamount")
  private Double realamount = null;

  @SerializedName("amountdifference")
  private Double amountdifference = null;

  @SerializedName("amountleft")
  private Double amountleft = null;

  @SerializedName("cheques")
  private List<Posreceiptcheque> cheques = new ArrayList<Posreceiptcheque>();

  @SerializedName("days")
  private List<Posreceiptday> days = new ArrayList<Posreceiptday>();

  @SerializedName("amountgived")
  private Double amountgived = null;

  @SerializedName("actualamount")
  private Double actualamount = null;

  @SerializedName("remainamount")
  private Double remainamount = null;

  public Posreceiptrow displayname(String displayname) {
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

  public Posreceiptrow id(String id) {
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

  public Posreceiptrow classid(String classid) {
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

  public Posreceiptrow objversion(Integer objversion) {
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

  public Posreceiptrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu tržba [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu tržba [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Posreceiptrow currencyId(String currencyId) {
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

  public Posreceiptrow paymenttypeId(String paymenttypeId) {
    this.paymenttypeId = paymenttypeId;
    return this;
  }

   /**
   * typ úhrady; id objektu způsob úhrady [persistentní položka]
   * @return paymenttypeId
  **/
  @ApiModelProperty(example = "null", value = "typ úhrady; id objektu způsob úhrady [persistentní položka]")
  public String getPaymenttypeId() {
    return paymenttypeId;
  }

  public void setPaymenttypeId(String paymenttypeId) {
    this.paymenttypeId = paymenttypeId;
  }

  public Posreceiptrow initiativeamount(Double initiativeamount) {
    this.initiativeamount = initiativeamount;
    return this;
  }

   /**
   * počátek [persistentní položka]
   * @return initiativeamount
  **/
  @ApiModelProperty(example = "null", value = "počátek [persistentní položka]")
  public Double getInitiativeamount() {
    return initiativeamount;
  }

  public void setInitiativeamount(Double initiativeamount) {
    this.initiativeamount = initiativeamount;
  }

  public Posreceiptrow amounttenancy(Double amounttenancy) {
    this.amounttenancy = amounttenancy;
    return this;
  }

   /**
   * tržba [persistentní položka]
   * @return amounttenancy
  **/
  @ApiModelProperty(example = "null", value = "tržba [persistentní položka]")
  public Double getAmounttenancy() {
    return amounttenancy;
  }

  public void setAmounttenancy(Double amounttenancy) {
    this.amounttenancy = amounttenancy;
  }

  public Posreceiptrow issuedinvoice(Double issuedinvoice) {
    this.issuedinvoice = issuedinvoice;
    return this;
  }

   /**
   * faktury [persistentní položka]
   * @return issuedinvoice
  **/
  @ApiModelProperty(example = "null", value = "faktury [persistentní položka]")
  public Double getIssuedinvoice() {
    return issuedinvoice;
  }

  public void setIssuedinvoice(Double issuedinvoice) {
    this.issuedinvoice = issuedinvoice;
  }

  public Posreceiptrow issueddinvoice(Double issueddinvoice) {
    this.issueddinvoice = issueddinvoice;
    return this;
  }

   /**
   * zálohy [persistentní položka]
   * @return issueddinvoice
  **/
  @ApiModelProperty(example = "null", value = "zálohy [persistentní položka]")
  public Double getIssueddinvoice() {
    return issueddinvoice;
  }

  public void setIssueddinvoice(Double issueddinvoice) {
    this.issueddinvoice = issueddinvoice;
  }

  public Posreceiptrow amountdeposit(Double amountdeposit) {
    this.amountdeposit = amountdeposit;
    return this;
  }

   /**
   * vloženo [persistentní položka]
   * @return amountdeposit
  **/
  @ApiModelProperty(example = "null", value = "vloženo [persistentní položka]")
  public Double getAmountdeposit() {
    return amountdeposit;
  }

  public void setAmountdeposit(Double amountdeposit) {
    this.amountdeposit = amountdeposit;
  }

  public Posreceiptrow amountcollection(Double amountcollection) {
    this.amountcollection = amountcollection;
    return this;
  }

   /**
   * vybráno [persistentní položka]
   * @return amountcollection
  **/
  @ApiModelProperty(example = "null", value = "vybráno [persistentní položka]")
  public Double getAmountcollection() {
    return amountcollection;
  }

  public void setAmountcollection(Double amountcollection) {
    this.amountcollection = amountcollection;
  }

  public Posreceiptrow issuedadvance(Double issuedadvance) {
    this.issuedadvance = issuedadvance;
    return this;
  }

   /**
   * vydané zálohy [persistentní položka]
   * @return issuedadvance
  **/
  @ApiModelProperty(example = "null", value = "vydané zálohy [persistentní položka]")
  public Double getIssuedadvance() {
    return issuedadvance;
  }

  public void setIssuedadvance(Double issuedadvance) {
    this.issuedadvance = issuedadvance;
  }

  public Posreceiptrow finalamount(Double finalamount) {
    this.finalamount = finalamount;
    return this;
  }

   /**
   * stav při uzávěrce [persistentní položka]
   * @return finalamount
  **/
  @ApiModelProperty(example = "null", value = "stav při uzávěrce [persistentní položka]")
  public Double getFinalamount() {
    return finalamount;
  }

  public void setFinalamount(Double finalamount) {
    this.finalamount = finalamount;
  }

  public Posreceiptrow realamount(Double realamount) {
    this.realamount = realamount;
    return this;
  }

   /**
   * zjištěno [persistentní položka]
   * @return realamount
  **/
  @ApiModelProperty(example = "null", value = "zjištěno [persistentní položka]")
  public Double getRealamount() {
    return realamount;
  }

  public void setRealamount(Double realamount) {
    this.realamount = realamount;
  }

  public Posreceiptrow amountdifference(Double amountdifference) {
    this.amountdifference = amountdifference;
    return this;
  }

   /**
   * rozdíl [persistentní položka]
   * @return amountdifference
  **/
  @ApiModelProperty(example = "null", value = "rozdíl [persistentní položka]")
  public Double getAmountdifference() {
    return amountdifference;
  }

  public void setAmountdifference(Double amountdifference) {
    this.amountdifference = amountdifference;
  }

  public Posreceiptrow amountleft(Double amountleft) {
    this.amountleft = amountleft;
    return this;
  }

   /**
   * ponecháno [persistentní položka]
   * @return amountleft
  **/
  @ApiModelProperty(example = "null", value = "ponecháno [persistentní položka]")
  public Double getAmountleft() {
    return amountleft;
  }

  public void setAmountleft(Double amountleft) {
    this.amountleft = amountleft;
  }

  public Posreceiptrow cheques(List<Posreceiptcheque> cheques) {
    this.cheques = cheques;
    return this;
  }

  public Posreceiptrow addChequesItem(Posreceiptcheque chequesItem) {
    this.cheques.add(chequesItem);
    return this;
  }

   /**
   * Šeky; kolekce bo tržba - šek [nepersistentní položka]
   * @return cheques
  **/
  @ApiModelProperty(example = "null", value = "Šeky; kolekce bo tržba - šek [nepersistentní položka]")
  public List<Posreceiptcheque> getCheques() {
    return cheques;
  }

  public void setCheques(List<Posreceiptcheque> cheques) {
    this.cheques = cheques;
  }

  public Posreceiptrow days(List<Posreceiptday> days) {
    this.days = days;
    return this;
  }

  public Posreceiptrow addDaysItem(Posreceiptday daysItem) {
    this.days.add(daysItem);
    return this;
  }

   /**
   * datumy; kolekce bo tržba - den [nepersistentní položka]
   * @return days
  **/
  @ApiModelProperty(example = "null", value = "datumy; kolekce bo tržba - den [nepersistentní položka]")
  public List<Posreceiptday> getDays() {
    return days;
  }

  public void setDays(List<Posreceiptday> days) {
    this.days = days;
  }

  public Posreceiptrow amountgived(Double amountgived) {
    this.amountgived = amountgived;
    return this;
  }

   /**
   * odvedeno [persistentní položka]
   * @return amountgived
  **/
  @ApiModelProperty(example = "null", value = "odvedeno [persistentní položka]")
  public Double getAmountgived() {
    return amountgived;
  }

  public void setAmountgived(Double amountgived) {
    this.amountgived = amountgived;
  }

  public Posreceiptrow actualamount(Double actualamount) {
    this.actualamount = actualamount;
    return this;
  }

   /**
   * stav
   * @return actualamount
  **/
  @ApiModelProperty(example = "null", value = "stav")
  public Double getActualamount() {
    return actualamount;
  }

  public void setActualamount(Double actualamount) {
    this.actualamount = actualamount;
  }

  public Posreceiptrow remainamount(Double remainamount) {
    this.remainamount = remainamount;
    return this;
  }

   /**
   * zbývá
   * @return remainamount
  **/
  @ApiModelProperty(example = "null", value = "zbývá")
  public Double getRemainamount() {
    return remainamount;
  }

  public void setRemainamount(Double remainamount) {
    this.remainamount = remainamount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posreceiptrow posreceiptrow = (Posreceiptrow) o;
    return Objects.equals(this.displayname, posreceiptrow.displayname) &&
        Objects.equals(this.id, posreceiptrow.id) &&
        Objects.equals(this.classid, posreceiptrow.classid) &&
        Objects.equals(this.objversion, posreceiptrow.objversion) &&
        Objects.equals(this.parentId, posreceiptrow.parentId) &&
        Objects.equals(this.currencyId, posreceiptrow.currencyId) &&
        Objects.equals(this.paymenttypeId, posreceiptrow.paymenttypeId) &&
        Objects.equals(this.initiativeamount, posreceiptrow.initiativeamount) &&
        Objects.equals(this.amounttenancy, posreceiptrow.amounttenancy) &&
        Objects.equals(this.issuedinvoice, posreceiptrow.issuedinvoice) &&
        Objects.equals(this.issueddinvoice, posreceiptrow.issueddinvoice) &&
        Objects.equals(this.amountdeposit, posreceiptrow.amountdeposit) &&
        Objects.equals(this.amountcollection, posreceiptrow.amountcollection) &&
        Objects.equals(this.issuedadvance, posreceiptrow.issuedadvance) &&
        Objects.equals(this.finalamount, posreceiptrow.finalamount) &&
        Objects.equals(this.realamount, posreceiptrow.realamount) &&
        Objects.equals(this.amountdifference, posreceiptrow.amountdifference) &&
        Objects.equals(this.amountleft, posreceiptrow.amountleft) &&
        Objects.equals(this.cheques, posreceiptrow.cheques) &&
        Objects.equals(this.days, posreceiptrow.days) &&
        Objects.equals(this.amountgived, posreceiptrow.amountgived) &&
        Objects.equals(this.actualamount, posreceiptrow.actualamount) &&
        Objects.equals(this.remainamount, posreceiptrow.remainamount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, currencyId, paymenttypeId, initiativeamount, amounttenancy, issuedinvoice, issueddinvoice, amountdeposit, amountcollection, issuedadvance, finalamount, realamount, amountdifference, amountleft, cheques, days, amountgived, actualamount, remainamount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posreceiptrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    paymenttypeId: ").append(toIndentedString(paymenttypeId)).append("\n");
    sb.append("    initiativeamount: ").append(toIndentedString(initiativeamount)).append("\n");
    sb.append("    amounttenancy: ").append(toIndentedString(amounttenancy)).append("\n");
    sb.append("    issuedinvoice: ").append(toIndentedString(issuedinvoice)).append("\n");
    sb.append("    issueddinvoice: ").append(toIndentedString(issueddinvoice)).append("\n");
    sb.append("    amountdeposit: ").append(toIndentedString(amountdeposit)).append("\n");
    sb.append("    amountcollection: ").append(toIndentedString(amountcollection)).append("\n");
    sb.append("    issuedadvance: ").append(toIndentedString(issuedadvance)).append("\n");
    sb.append("    finalamount: ").append(toIndentedString(finalamount)).append("\n");
    sb.append("    realamount: ").append(toIndentedString(realamount)).append("\n");
    sb.append("    amountdifference: ").append(toIndentedString(amountdifference)).append("\n");
    sb.append("    amountleft: ").append(toIndentedString(amountleft)).append("\n");
    sb.append("    cheques: ").append(toIndentedString(cheques)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    amountgived: ").append(toIndentedString(amountgived)).append("\n");
    sb.append("    actualamount: ").append(toIndentedString(actualamount)).append("\n");
    sb.append("    remainamount: ").append(toIndentedString(remainamount)).append("\n");
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

