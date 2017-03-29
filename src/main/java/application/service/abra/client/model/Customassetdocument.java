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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Customassetdocument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Customassetdocument   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("newrelatedtype")
  private Integer newrelatedtype = null;

  @SerializedName("newrelateddocument_id")
  private String newrelateddocumentId = null;

  @SerializedName("accpresetdef_id")
  private String accpresetdefId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("accdate$date")
  private DateTime accdatedate = null;

  @SerializedName("accdocqueue_id")
  private String accdocqueueId = null;

  @SerializedName("accountingtype")
  private Integer accountingtype = null;

  @SerializedName("isaccounted")
  private Boolean isaccounted = null;

  @SerializedName("dirty")
  private Boolean dirty = null;

  @SerializedName("assetcard_type")
  private Integer assetcardType = null;

  @SerializedName("assetcard_id")
  private String assetcardId = null;

  @SerializedName("taxbasepriceamount")
  private Double taxbasepriceamount = null;

  @SerializedName("accbasepriceamount")
  private Double accbasepriceamount = null;

  @SerializedName("taxremainderpriceamount")
  private Double taxremainderpriceamount = null;

  @SerializedName("accremainderpriceamount")
  private Double accremainderpriceamount = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  public Customassetdocument displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Číslo dok.
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Customassetdocument id(String id) {
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

  public Customassetdocument classid(String classid) {
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

  public Customassetdocument objversion(Integer objversion) {
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

  public Customassetdocument docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * zdrojová řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "zdrojová řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Customassetdocument periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období [persistentní položka]
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období [persistentní položka]")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Customassetdocument ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Customassetdocument docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum dok. [persistentní položka]
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum dok. [persistentní položka]")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Customassetdocument createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Customassetdocument correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Customassetdocument newrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
    return this;
  }

   /**
   * typ relace
   * @return newrelatedtype
  **/
  @ApiModelProperty(example = "null", value = "typ relace")
  public Integer getNewrelatedtype() {
    return newrelatedtype;
  }

  public void setNewrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
  }

  public Customassetdocument newrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
    return this;
  }

   /**
   * id dokladu pro připojení
   * @return newrelateddocumentId
  **/
  @ApiModelProperty(example = "null", value = "id dokladu pro připojení")
  public String getNewrelateddocumentId() {
    return newrelateddocumentId;
  }

  public void setNewrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
  }

  public Customassetdocument accpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
    return this;
  }

   /**
   * předkontace; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetdefId
  **/
  @ApiModelProperty(example = "null", value = "předkontace; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetdefId() {
    return accpresetdefId;
  }

  public void setAccpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
  }

  public Customassetdocument description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Customassetdocument accdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
    return this;
  }

   /**
   * datum účt. [persistentní položka]
   * @return accdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum účt. [persistentní položka]")
  public DateTime getAccdatedate() {
    return accdatedate;
  }

  public void setAccdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
  }

  public Customassetdocument accdocqueueId(String accdocqueueId) {
    this.accdocqueueId = accdocqueueId;
    return this;
  }

   /**
   * Účetní řada; id objektu Účetní řada dokladů [persistentní položka]
   * @return accdocqueueId
  **/
  @ApiModelProperty(example = "null", value = "Účetní řada; id objektu Účetní řada dokladů [persistentní položka]")
  public String getAccdocqueueId() {
    return accdocqueueId;
  }

  public void setAccdocqueueId(String accdocqueueId) {
    this.accdocqueueId = accdocqueueId;
  }

  public Customassetdocument accountingtype(Integer accountingtype) {
    this.accountingtype = accountingtype;
    return this;
  }

   /**
   * jak účtovat
   * @return accountingtype
  **/
  @ApiModelProperty(example = "null", value = "jak účtovat")
  public Integer getAccountingtype() {
    return accountingtype;
  }

  public void setAccountingtype(Integer accountingtype) {
    this.accountingtype = accountingtype;
  }

  public Customassetdocument isaccounted(Boolean isaccounted) {
    this.isaccounted = isaccounted;
    return this;
  }

   /**
   * Účtováno
   * @return isaccounted
  **/
  @ApiModelProperty(example = "null", value = "Účtováno")
  public Boolean getIsaccounted() {
    return isaccounted;
  }

  public void setIsaccounted(Boolean isaccounted) {
    this.isaccounted = isaccounted;
  }

  public Customassetdocument dirty(Boolean dirty) {
    this.dirty = dirty;
    return this;
  }

   /**
   * zakázané přepočítání
   * @return dirty
  **/
  @ApiModelProperty(example = "null", value = "zakázané přepočítání")
  public Boolean getDirty() {
    return dirty;
  }

  public void setDirty(Boolean dirty) {
    this.dirty = dirty;
  }

  public Customassetdocument assetcardType(Integer assetcardType) {
    this.assetcardType = assetcardType;
    return this;
  }

   /**
   * typ karty
   * @return assetcardType
  **/
  @ApiModelProperty(example = "null", value = "typ karty")
  public Integer getAssetcardType() {
    return assetcardType;
  }

  public void setAssetcardType(Integer assetcardType) {
    this.assetcardType = assetcardType;
  }

  public Customassetdocument assetcardId(String assetcardId) {
    this.assetcardId = assetcardId;
    return this;
  }

   /**
   * karta majetku; id objektu karta majetku [persistentní položka]
   * @return assetcardId
  **/
  @ApiModelProperty(example = "null", value = "karta majetku; id objektu karta majetku [persistentní položka]")
  public String getAssetcardId() {
    return assetcardId;
  }

  public void setAssetcardId(String assetcardId) {
    this.assetcardId = assetcardId;
  }

  public Customassetdocument taxbasepriceamount(Double taxbasepriceamount) {
    this.taxbasepriceamount = taxbasepriceamount;
    return this;
  }

   /**
   * daň.vstup.cena [persistentní položka]
   * @return taxbasepriceamount
  **/
  @ApiModelProperty(example = "null", value = "daň.vstup.cena [persistentní položka]")
  public Double getTaxbasepriceamount() {
    return taxbasepriceamount;
  }

  public void setTaxbasepriceamount(Double taxbasepriceamount) {
    this.taxbasepriceamount = taxbasepriceamount;
  }

  public Customassetdocument accbasepriceamount(Double accbasepriceamount) {
    this.accbasepriceamount = accbasepriceamount;
    return this;
  }

   /**
   * Účet.vstup.cena [persistentní položka]
   * @return accbasepriceamount
  **/
  @ApiModelProperty(example = "null", value = "Účet.vstup.cena [persistentní položka]")
  public Double getAccbasepriceamount() {
    return accbasepriceamount;
  }

  public void setAccbasepriceamount(Double accbasepriceamount) {
    this.accbasepriceamount = accbasepriceamount;
  }

  public Customassetdocument taxremainderpriceamount(Double taxremainderpriceamount) {
    this.taxremainderpriceamount = taxremainderpriceamount;
    return this;
  }

   /**
   * daň.zůst.cena [persistentní položka]
   * @return taxremainderpriceamount
  **/
  @ApiModelProperty(example = "null", value = "daň.zůst.cena [persistentní položka]")
  public Double getTaxremainderpriceamount() {
    return taxremainderpriceamount;
  }

  public void setTaxremainderpriceamount(Double taxremainderpriceamount) {
    this.taxremainderpriceamount = taxremainderpriceamount;
  }

  public Customassetdocument accremainderpriceamount(Double accremainderpriceamount) {
    this.accremainderpriceamount = accremainderpriceamount;
    return this;
  }

   /**
   * Účet.zůst.cena [persistentní položka]
   * @return accremainderpriceamount
  **/
  @ApiModelProperty(example = "null", value = "Účet.zůst.cena [persistentní položka]")
  public Double getAccremainderpriceamount() {
    return accremainderpriceamount;
  }

  public void setAccremainderpriceamount(Double accremainderpriceamount) {
    this.accremainderpriceamount = accremainderpriceamount;
  }

  public Customassetdocument divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Customassetdocument busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Customassetdocument bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch.případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch.případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Customassetdocument busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customassetdocument customassetdocument = (Customassetdocument) o;
    return Objects.equals(this.displayname, customassetdocument.displayname) &&
        Objects.equals(this.id, customassetdocument.id) &&
        Objects.equals(this.classid, customassetdocument.classid) &&
        Objects.equals(this.objversion, customassetdocument.objversion) &&
        Objects.equals(this.docqueueId, customassetdocument.docqueueId) &&
        Objects.equals(this.periodId, customassetdocument.periodId) &&
        Objects.equals(this.ordnumber, customassetdocument.ordnumber) &&
        Objects.equals(this.docdatedate, customassetdocument.docdatedate) &&
        Objects.equals(this.createdbyId, customassetdocument.createdbyId) &&
        Objects.equals(this.correctedbyId, customassetdocument.correctedbyId) &&
        Objects.equals(this.newrelatedtype, customassetdocument.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, customassetdocument.newrelateddocumentId) &&
        Objects.equals(this.accpresetdefId, customassetdocument.accpresetdefId) &&
        Objects.equals(this.description, customassetdocument.description) &&
        Objects.equals(this.accdatedate, customassetdocument.accdatedate) &&
        Objects.equals(this.accdocqueueId, customassetdocument.accdocqueueId) &&
        Objects.equals(this.accountingtype, customassetdocument.accountingtype) &&
        Objects.equals(this.isaccounted, customassetdocument.isaccounted) &&
        Objects.equals(this.dirty, customassetdocument.dirty) &&
        Objects.equals(this.assetcardType, customassetdocument.assetcardType) &&
        Objects.equals(this.assetcardId, customassetdocument.assetcardId) &&
        Objects.equals(this.taxbasepriceamount, customassetdocument.taxbasepriceamount) &&
        Objects.equals(this.accbasepriceamount, customassetdocument.accbasepriceamount) &&
        Objects.equals(this.taxremainderpriceamount, customassetdocument.taxremainderpriceamount) &&
        Objects.equals(this.accremainderpriceamount, customassetdocument.accremainderpriceamount) &&
        Objects.equals(this.divisionId, customassetdocument.divisionId) &&
        Objects.equals(this.busorderId, customassetdocument.busorderId) &&
        Objects.equals(this.bustransactionId, customassetdocument.bustransactionId) &&
        Objects.equals(this.busprojectId, customassetdocument.busprojectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, accpresetdefId, description, accdatedate, accdocqueueId, accountingtype, isaccounted, dirty, assetcardType, assetcardId, taxbasepriceamount, accbasepriceamount, taxremainderpriceamount, accremainderpriceamount, divisionId, busorderId, bustransactionId, busprojectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customassetdocument {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    accpresetdefId: ").append(toIndentedString(accpresetdefId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accdatedate: ").append(toIndentedString(accdatedate)).append("\n");
    sb.append("    accdocqueueId: ").append(toIndentedString(accdocqueueId)).append("\n");
    sb.append("    accountingtype: ").append(toIndentedString(accountingtype)).append("\n");
    sb.append("    isaccounted: ").append(toIndentedString(isaccounted)).append("\n");
    sb.append("    dirty: ").append(toIndentedString(dirty)).append("\n");
    sb.append("    assetcardType: ").append(toIndentedString(assetcardType)).append("\n");
    sb.append("    assetcardId: ").append(toIndentedString(assetcardId)).append("\n");
    sb.append("    taxbasepriceamount: ").append(toIndentedString(taxbasepriceamount)).append("\n");
    sb.append("    accbasepriceamount: ").append(toIndentedString(accbasepriceamount)).append("\n");
    sb.append("    taxremainderpriceamount: ").append(toIndentedString(taxremainderpriceamount)).append("\n");
    sb.append("    accremainderpriceamount: ").append(toIndentedString(accremainderpriceamount)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
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

